package com.example.praktika;

import android.app.Activity;

public class FavoriteController {
    private final Activity context;

    public FavoriteController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.favorite);
    }

    public void setup() {
        context.findViewById(R.id.imageView63).setOnClickListener(v -> new HomeController(context).setup());
        context.findViewById(R.id.nav_home).setOnClickListener(v -> new HomeController(context).setup());

        // Подразумевается, что setupItemClickListeners() должен быть доступен здесь
        // Можно вынести в отдельный утилитный класс или сделать базовый класс
    }
}