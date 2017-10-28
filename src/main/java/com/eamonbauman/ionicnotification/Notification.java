package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class Notification {
    /**
     * App ID the Notification belongs to;
     */
    public String app_id;

    /**
     * Notification config
     */
    public NotificationConfig config;

    /**
     * Date time of the notification creation
     */
    public String created;

    /**
     * Notification Overview Schema
     */
    public NotificationOverview overview;

    /**
     * State of the notification
     */
    public NotificationState state;

    /**
     * Determines whether or not the notification can be modified
     */
    public NotificationStatus status;

    /**
     * Unique id for this notification
     */
    public String uuid;
}
