package com.example.praktika;

import android.app.Activity;
import android.widget.Button;

public class Welcome1Controller {
    private final Activity context;

    public Welcome1Controller(Activity context) {
        this.context = context;
        context.setContentView(R.layout.welcome1);
    }

    public void setup() {
        Button button4Welcome1 = context.findViewById(R.id.button4);
        button4Welcome1.setOnClickListener(btn4_1 -> new Welcome2Controller(context).setup());
    }
}