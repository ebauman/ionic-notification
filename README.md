# ionic-notification
Java library for helping with Ionic notifications


A helper class (IonicNotificationService) is included for quick start. 

```
IonicNotificationService ins = 
    new IonicNotificationService(gson, apiURL, token, pushProfile);
    
NotificationResponse nr = 
    ins.create(tokens, message);
```

