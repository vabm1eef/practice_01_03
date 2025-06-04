package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;

public class Welcome2Controller {
    private final Activity context;

    public Welcome2Controller(Activity context) {
        this.context = context;

        // Проверяем ориентацию экрана
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.welcome2_horizontal);
        } else {
            context.setContentView(R.layout.welcome2);
        }
    }

    public void setup() {
        Button button4 = context.findViewById(R.id.button4);
        button4.setOnClickListener(btn4 -> new Welcome3Controller(context).setup());
    }
}