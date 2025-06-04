package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;

public class CatalogController {
    private final Activity context;

    public CatalogController(Activity context) {
        this.context = context;
        setLayoutBasedOnOrientation();
    }

    public void setup() {
        context.findViewById(R.id.imageView10).setOnClickListener(v -> new HomeController(context).setup());

        // Общие настройки для обеих ориентаций
        setupCommonViews();
    }

    private void setLayoutBasedOnOrientation() {
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.catalog_horizontal);
        } else {
            context.setContentView(R.layout.catalog);
        }
    }

    private void setupCommonViews() {
        // Здесь можно добавить общую логику для обоих макетов
        // Например, обработку кликов на элементы продуктов и т.д.
    }

    // Метод для обработки изменения ориентации
    public void onConfigurationChanged(Configuration newConfig) {
        setLayoutBasedOnOrientation();
        setup();
    }
}