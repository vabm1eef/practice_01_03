package com.example.praktika;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public class LogoController {
    private final Activity context;

    public LogoController(Activity context) {
        this.context = context;
    }

    public void showLogoAndWelcome() {
        context.setContentView(R.layout.logo);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            new Welcome1Controller(context).setup();
        }, 2000);
    }
}