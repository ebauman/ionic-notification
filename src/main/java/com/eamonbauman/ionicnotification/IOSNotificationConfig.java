package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class IOSNotificationConfig {
    /**
     * The number to display as the badge of the web icon
     */
    public int badge;

    /**
     * Determines if the message should be delivered as a silent notification.
     * A value of 1 will cause the message to be delivered as a background notification,
     * which will not display a notification to the user, but the application can still process the notification.
     */
    public int content_available;

    /**
     * Raw data sent to APNS
     */
    public Object data;

    /**
     * Time at which APNS will stop trying to deliver the notification
     */
    public String expire;

    /**
     * Notification Text
     */
    public String message;

    /**
     * Custom data
     */
    public Object payload;

    /**
     * Message Priority. A value of 10 will cause APNS to attempt immediate delivery.
     * A value of 5 will attempt a delivery which is convenient for battery life.
     */
    public int priority;

    /**
     * Filename of audio file to play when a notification is received.
     * Setting this to 'default' will use the default iOS device notification sound
     */
    public String sound;

    /**
     * Default values to for template variables when a corresponding user does not have a value
     */
    public Object template_defaults;

    /**
     * Alert Title, only applicable for iWatch devices
     */
    public String title;

}
