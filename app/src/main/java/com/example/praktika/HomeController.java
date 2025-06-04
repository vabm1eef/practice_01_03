package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.SearchView;

public class HomeController {
    private final Activity context;

    public HomeController(Activity context) {
        this.context = context;

        // Check screen orientation
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.home_horizontal);
        } else {
            context.setContentView(R.layout.home);
        }
    }

    public void setup() {
        setupItemClickListeners();

        context.findViewById(R.id.nav_fav).setOnClickListener(v -> new FavoriteController(context).setup());
        context.findViewById(R.id.button5).setOnClickListener(v -> new CatalogController(context).setup());
        context.findViewById(R.id.textView16).setOnClickListener(v -> new PopularController(context).setup());

        SearchView searchView = context.findViewById(R.id.searchView);
        searchView.setOnClickListener(v -> new Search2Controller(context).setup());

        View fabCenter = context.findViewById(R.id.fab_center);
        View imageView12 = context.findViewById(R.id.imageView12);
        View.OnClickListener openCart = v -> new MyCartController(context).setup();

        if (fabCenter != null) fabCenter.setOnClickListener(openCart);
        if (imageView12 != null) imageView12.setOnClickListener(openCart);
    }

    private void setupItemClickListeners() {
        int[] frameIds = {
                R.id.item1, R.id.item2, R.id.item3, R.id.item4, R.id.item5,
                R.id.item6, R.id.item7, R.id.item8, R.id.item9, R.id.item10
        };

        View.OnClickListener openDetails = v -> new Details1Controller(context).setup();

        for (int id : frameIds) {
            View item = context.findViewById(id);
            if (item != null) {
                item.setOnClickListener(openDetails);
            }
        }
    }
}