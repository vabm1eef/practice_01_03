package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;

public class Welcome1Controller {
    private final Activity context;

    public Welcome1Controller(Activity context) {
        this.context = context;

        // Проверяем ориентацию экрана
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.welcome1_horizontal);
        } else {
            context.setContentView(R.layout.welcome1);
        }
    }

    public void setup() {
        Button button2 = context.findViewById(R.id.button2);
        button2.setOnClickListener(btn2 -> new Welcome2Controller(context).setup());
    }
}