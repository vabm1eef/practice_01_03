package com.example.praktika;

import android.app.Activity;
import android.widget.Button;

public class WelcomeController {
    private final Activity context;

    public WelcomeController(Activity context) {
        this.context = context;
        context.setContentView(R.layout.welcome);
    }

    public void setup() {
        Button button2 = context.findViewById(R.id.button2);
        button2.setOnClickListener(btn2 -> new Welcome1Controller(context).setup());
    }
}