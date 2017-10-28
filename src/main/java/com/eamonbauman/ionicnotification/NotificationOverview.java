package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class NotificationOverview {
    /**
     * Notification Overview Error Schema
     */
    public NotificationOverviewError[] errors;

    /**
     * The number of invalid tokens for this notification
     */
    public int invalid;

    /**
     * The number of messages accepted by FCM/APNS
     */
    public int sent;
}
