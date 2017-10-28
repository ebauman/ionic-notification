package com.eamonbauman.ionicnotification;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Created by baumae03 on 7/15/17.
 */
public class NotificationDeserializer implements JsonDeserializer<Notification> {
    @Override
    public Notification deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException
    {
        JsonObject jobject = json.getAsJsonObject();
        Notification n = new Notification();
        n.state = NotificationState.valueOf(jobject.get("state").getAsString());
        n.status = NotificationStatus.valueOf(jobject.get("status").getAsString());
        n.created = jobject.get("created").getAsString();
        n.app_id = jobject.get("app_id").getAsString();
        n.uuid = jobject.get("uuid").getAsString();
        JsonObject nestedConfig = jobject.get("config").getAsJsonObject();
        n.config = context.deserialize(nestedConfig.get("notification").getAsJsonObject(), NotificationConfig.class);
        return n;
    }
}
