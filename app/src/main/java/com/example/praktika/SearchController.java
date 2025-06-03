package com.example.praktika;

import android.app.Activity;
import android.widget.ImageView;

public class SearchController {
    private final Activity context;

    public SearchController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.search);
    }

    public void setup() {
        ImageView backToHome = context.findViewById(R.id.imageView79);
        backToHome.setOnClickListener(v -> new HomeController(context).setup());
    }
}