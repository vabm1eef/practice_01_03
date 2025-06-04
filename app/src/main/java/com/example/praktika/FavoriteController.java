package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;

public class FavoriteController {
    private final Activity context;

    public FavoriteController(Activity context) {
        this.context = context;

        // Проверяем ориентацию устройства
        int orientation = context.getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Горизонтальная ориентация
            context.setContentView(R.layout.favorite_horizontal);
        } else {
            // Вертикальная ориентация
            context.setContentView(R.layout.favorite);
        }
    }

    public void setup() {
        context.findViewById(R.id.imageView63).setOnClickListener(v -> new HomeController(context).setup());
        context.findViewById(R.id.nav_home).setOnClickListener(v -> new HomeController(context).setup());

        // Для горизонтальной версии также нужно обработать клики
        if (context.findViewById(R.id.item1) != null) {
            setupItemClickListeners();
        }
    }

    private void setupItemClickListeners() {
        // Здесь должна быть реализация обработки кликов по элементам
        // Можно использовать тот же код, что и для вертикальной версии
    }
}