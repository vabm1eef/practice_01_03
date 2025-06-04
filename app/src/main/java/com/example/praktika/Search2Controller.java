package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.ImageView;
import android.widget.SearchView;

public class Search2Controller {
    private final Activity context;

    public Search2Controller(Activity context) {
        this.context = context;

        // Проверяем ориентацию устройства
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Горизонтальная ориентация
            context.setContentView(R.layout.search2_horizontal);
        } else {
            // Вертикальная ориентация
            context.setContentView(R.layout.search2);
        }
    }

    public void setup() {
        ImageView backToHome = context.findViewById(R.id.imageView83);
        backToHome.setOnClickListener(v -> new HomeController(context).setup());

        SearchView searchView = context.findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                new SearchController(context).setup();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}