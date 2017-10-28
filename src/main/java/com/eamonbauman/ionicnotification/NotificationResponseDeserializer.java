package com.eamonbauman.ionicnotification;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by baumae03 on 7/12/17.
 */
public class NotificationResponseDeserializer implements JsonDeserializer<NotificationResponse> {
    public NotificationResponse deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException
    {
        JsonObject jobject = json.getAsJsonObject();
        NotificationResponse nr  = new NotificationResponse();

        nr.request_id = jobject.get("meta").getAsJsonObject().get("request_id").getAsString();
        nr.status = jobject.get("meta").getAsJsonObject().get("status").getAsInt();
        nr.version = jobject.get("meta").getAsJsonObject().get("version").getAsString();
        nr.notification = new Stack<Notification>();

        try {
            // See if we have an array
            JsonArray rawData = jobject.get("data").getAsJsonArray();
            Iterator<JsonElement> rawNotifs = rawData.iterator();
            while (rawNotifs.hasNext()) {
                JsonElement d = rawNotifs.next();
                System.out.println(d.toString());
                Notification n = context.deserialize(d, Notification.class);
                nr.notification.add(n);
            }

        } catch (IllegalStateException ex) {
            // Wasn't an array
            nr.notification.add((Notification) context.deserialize(jobject.get("data").getAsJsonObject(), Notification.class));
        }
        return nr;
    }
}
