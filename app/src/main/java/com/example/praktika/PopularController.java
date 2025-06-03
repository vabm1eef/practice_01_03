package com.example.praktika;

import android.app.Activity;

public class PopularController {
    private final Activity context;

    public PopularController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.popular);
    }

    public void setup() {
        context.findViewById(R.id.imageView6).setOnClickListener(v -> new HomeController(context).setup());
    }
}