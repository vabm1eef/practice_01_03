package com.example.praktika;

import android.app.Activity;

public class CatalogController {
    private final Activity context;

    public CatalogController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.catalog);
    }

    public void setup() {
        context.findViewById(R.id.imageView10).setOnClickListener(v -> new HomeController(context).setup());
    }
}