package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class NotificationConfig {
    /**
     * Android notification options
     */
    public AndroidNotificationConfig android;

    /**
     * iOS notification options
     */
    public IOSNotificationConfig ios;

    /**
     * Notification text
     */
    public String message;

    /**
     * Payload data
     */
    public Object payload;

    /**
     * Notification title to show on devices as applicable
     */
    public String title;
}
