# ionic-notification
Java library for helping with Ionic notifications


A helper class (IonicNotificationService) is included for quick start. 

```
IonicNotificationService ins = 
    new IonicNotificationService(gson, apiURL, token, pushProfile);
    
NotificationResponse nr = 
    ins.create(tokens, message);
```

Help me make this better! Please take a look through the code and submit PRs for anything you think could be better.
Library development is not my strong suit, so any reasonable offers of assistance will *not* be refused! 