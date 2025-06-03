package com.example.praktika;

import android.app.Activity;
import android.widget.Button;

public class Welcome2Controller {
    private final Activity context;

    public Welcome2Controller(Activity context) {
        this.context = context;
        context.setContentView(R.layout.welcome2);
    }

    public void setup() {
        Button button4Welcome2 = context.findViewById(R.id.button4);
        button4Welcome2.setOnClickListener(btn4_2 -> new HomeController(context).setup());
    }
}
