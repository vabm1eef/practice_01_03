package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;

public class Welcome3Controller {
    private final Activity context;

    public Welcome3Controller(Activity context) {
        this.context = context;

        // Check screen orientation
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.welcome3_horizontal);
        } else {
            context.setContentView(R.layout.welcome3);
        }
    }

    public void setup() {
        Button button4 = context.findViewById(R.id.button4);
        button4.setOnClickListener(btn4_2 -> new HomeController(context).setup());
    }
}