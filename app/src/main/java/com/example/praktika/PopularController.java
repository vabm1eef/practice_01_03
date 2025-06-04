package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;

public class PopularController {
    private final Activity context;

    public PopularController(Activity context) {
        this.context = context;

        // Проверяем ориентацию экрана
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.popular_horizontal);
        } else {
            context.setContentView(R.layout.popular);
        }
    }

    public void setup() {
        context.findViewById(R.id.imageView6).setOnClickListener(v -> new HomeController(context).setup());
    }
}