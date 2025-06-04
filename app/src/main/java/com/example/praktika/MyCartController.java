package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.ImageView;

public class MyCartController {
    private final Activity context;

    public MyCartController(Activity context) {
        this.context = context;

        // Проверяем ориентацию устройства
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Горизонтальная ориентация
            context.setContentView(R.layout.mycart_horizontal);
        } else {
            // Вертикальная ориентация
            context.setContentView(R.layout.mycart);
        }
    }

    public void setup() {
        ImageView backToHome = context.findViewById(R.id.imageView67);
        if (backToHome != null) {
            backToHome.setOnClickListener(v -> new HomeController(context).setup());
        }
    }
}