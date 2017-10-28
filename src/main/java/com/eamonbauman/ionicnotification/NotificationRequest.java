package com.eamonbauman.ionicnotification;

import java.util.List;

/**
 * Created by baumae03 on 7/15/17.
 */
public class NotificationRequest {
    List<String> tokens;
    String profile;
    SimpleNotification notification;

    public NotificationRequest(List<String> tokens, String profile, String message) {
        this.tokens = tokens;
        this.profile = profile;
        this.notification = new SimpleNotification(message);
    }

    private class SimpleNotification {
        String message;

        public SimpleNotification(String message) {
            this.message = message;
        }
    }
}
