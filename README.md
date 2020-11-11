# IntentAnimationkt
 Intent with many animation that you can choise
 
- [intentanimation](https://github.com/hajiyevelnur92/intentanimation)

- Use on `MainActivity`
```kotlin
//maven { url 'https://jitpack.io' }
//implementation 'com.github.hajiyevelnur92:intentanimation:1.0'
btn.setOnClickListener {
    startActivity(Intent(applicationContext, MainActivity::class.java))
    customType(this,"fadein-to-fadeout")
    //*left-to-right
    //*right-to-left
    //*bottom-to-up
    //*up-to-bottom
    //*fadein-to-fadeout
    //*rotateout-to-rotatein
}
```

---

```
Copyright 2020 M. Fadli Zein
```
