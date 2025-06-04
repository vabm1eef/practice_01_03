package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.ImageView;

public class SearchController {
    private final Activity context;

    public SearchController(Activity context) {
        this.context = context;

        // Проверяем ориентацию устройства
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Горизонтальная ориентация
            context.setContentView(R.layout.search_horizontal);
        } else {
            // Вертикальная ориентация
            context.setContentView(R.layout.search);
        }
    }

    public void setup() {
        ImageView backToHome = context.findViewById(R.id.imageView79);
        if (backToHome != null) {
            backToHome.setOnClickListener(v -> new HomeController(context).setup());
        }
    }
}