package com.eamonbauman.ionicnotification;

/**
 * Created by baumae03 on 7/12/17.
 */
public class Token {
    /**
     *
     App ID the Token belongs to
     */
    public String app_id;

    /**
     * (date-time) When the Token was created
     */
    public String created;

    /**
     * Token ID. A MD5 hash of the device token
     */
    public String id;

    /**
     * (date-time) When the Token was last invalidated
     */
    public String invalidated;

    /**
     * Device Token
     */
    public String token;

    /**
     * Platform of the Token
     */
    public String type;

    /**
     * Validity of the Token
     */
    public boolean valid;
}
