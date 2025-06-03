package com.example.praktika;

import android.app.Activity;
import android.widget.ImageView;

public class Details1Controller {
    private final Activity context;

    public Details1Controller(Activity context) {
        this.context = context;
        context.setContentView(R.layout.details1);
    }

    public void setup() {
        ImageView back = context.findViewById(R.id.imageView66);
        if (back != null) {
            back.setOnClickListener(v -> new HomeController(context).setup());
        }

        ImageView toDetails = context.findViewById(R.id.imageView74);
        if (toDetails != null) {
            toDetails.setOnClickListener(v -> new DetailsController(context).setup());
        }
    }
}
