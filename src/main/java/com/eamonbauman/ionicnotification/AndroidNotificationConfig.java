package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class AndroidNotificationConfig {

    /**
     * Identifies a group of messages that can be collapsed,
     * so that only the last message gets sent when delivery can be resumed.
     */
    public String collapse_key;

    /**
     * Determines if the message should be delivered as a silent notification.
     * A value of 1 will cause the message to be delivered as a background notification,
     * which will not display a notification to the user, but the application can still process the notification.
     */
    public int content_available;

    /**
     * Raw data sent to GCM
     */
    public Object data;

    /**
     * When this parameter is set to true,
     * it indicates that the message should not be sent until the device becomes active.
     */
    public boolean delay_while_idle;

    /**
     * Filename of the Icon to display with the notification
     */
    public String icon;

    /**
     * Filename or URI of an image file to display with the notification
     */
    public String image;

    /**
     * Message text
     */
    public String message;

    /**
     * Custom data
     */
    public Object payload;

    /**
     *
     * Filename of audio file to play when a notification is received.
     * Setting this to 'default' will use the default Android device notification sound
     */
    public String sound;

    /**
     * Indicates whether each notification message results in a new entry on the notification center on Android.
     * If not set, each request creates a new notification. If set,
     * and a notification with the same tag is already being shown,
     * the new notification replaces the existing one in notification center.
     */
    public String tag;

    /**
     * Default values to for template variables when a corresponding user does not have a value
     */
    public Object template_defaults;

    /**
     * This parameter specifies for how long (in seconds) the message should be kept in GCM storage
     * if the device is offline
     */
    public int time_to_live;

    /**
     * Notification Title
     */
    public String title;
}

