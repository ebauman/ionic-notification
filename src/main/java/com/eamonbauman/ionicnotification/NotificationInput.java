package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class NotificationInput {
    /**
     * Targets User email address for delivery
     */
    public String[] emails;

    /**
     * Targets Custom Authentication User IDs for delivery
     */
    public String[] external_ids;

    /**
     *
     Targets Facebook User IDs for delivery
     */
    public String[] facebook_ids;

    /**
     *
     Targets Github User IDs for delivery
     */
    public String[] github_ids;

    /**
     *
     Targets Google+ User IDs for delivery
     */
    public String[] google_ids;

    /**
     * Targets Instagram User IDs for delivery
     */
    public String[] instagram_ids;

    /**
     *
     Targets LinkedIn User IDs for delivery
     */
    public String[] linkedin_ids;

    /**
     * Notification Config
     */
    public NotificationConfig notification;

    /**
     * Security Profile Tag to use when sending Messages
     */
    public String profile;

    /**
     * Time to start delivery of the notification
     */
    public String scheduled;

    /**
     * Targets all valid Device Tokens for delivery, ignores other delivery options
     */
    public boolean send_to_all;

    /**
     *
     Targets Device Tokens for delivery
     */
    public String[] tokens;

    /**
     *
     Targets Twitter User IDs for delivery
     */
    public String[] twitter_ids;

    /**
     * Targets User IDs for delivery
     */
    public String[] user_ids;
}
