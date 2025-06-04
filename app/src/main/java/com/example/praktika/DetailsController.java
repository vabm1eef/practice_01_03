package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.ImageView;

public class DetailsController {
    private final Activity context;

    public DetailsController(Activity context) {
        this.context = context;

        // Проверяем ориентацию устройства
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.details_horizontal);
        } else {
            context.setContentView(R.layout.details);
        }
    }

    public void setup() {
        ImageView backToDetails1 = context.findViewById(R.id.imageView76);
        if (backToDetails1 != null) {
            backToDetails1.setOnClickListener(v -> new Details1Controller(context).setup());
        }

        ImageView backToHome = context.findViewById(R.id.imageView66);
        if (backToHome != null) {
            backToHome.setOnClickListener(v -> new HomeController(context).setup());
        }
    }
}