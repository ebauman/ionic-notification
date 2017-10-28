package com.eamonbauman.ionicnotification;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by baumae03 on 7/12/17.
 */
public class IonicNotificationService {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private String APIUrl = "https://api.ionic.io";
    private String token = "";
    private String pushProfile = "";
    private Gson gson;

    public IonicNotificationService(Gson gson, String APIUrl, String token, String pushProfile) {
        this.gson = gson;
        this.APIUrl = APIUrl;
        this.token = token;
        this.pushProfile = pushProfile;
    }

    public NotificationResponse getAll() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(APIUrl + "/push/notifications")
                .addHeader("Authorization", "Bearer " + this.token)
                .build();
        Response response = client.newCall(request).execute();

        return gson.fromJson(response.body().string(), NotificationResponse.class);
    }

    public NotificationResponse get(String notif_id) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(APIUrl + "/push/notifications/" + notif_id)
                .addHeader("Authorization", "Bearer " + this.token)
                .build();
        Response response = client.newCall(request).execute();

        return gson.fromJson(response.body().string(), NotificationResponse.class);
    }

    public NotificationResponse create(List<String> tokens, String message) throws IOException {
        NotificationRequest nr = new NotificationRequest(tokens, this.pushProfile, message);

        // First, create the notification in ionic
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, gson.toJson(nr));
        Request request = new Request.Builder()
                .url(APIUrl + "/push/notifications")
                .addHeader("Authorization", "Bearer " + this.token)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();

        return gson.fromJson(response.body().string(), NotificationResponse.class);
    }
}
