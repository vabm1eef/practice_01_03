package com.example.praktika;

import android.app.Activity;
import android.widget.ImageView;

public class MyCartController {
    private final Activity context;

    public MyCartController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.mycart);
    }

    public void setup() {
        ImageView backToHome = context.findViewById(R.id.imageView67);
        if (backToHome != null) {
            backToHome.setOnClickListener(v -> new HomeController(context).setup());
        }
    }
}
