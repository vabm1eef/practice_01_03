package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class ForgotPasswordController {
    private final Activity context;

    public ForgotPasswordController(Activity context) {
        this.context = context;
        // Проверяем ориентацию и выбираем соответствующий layout
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.forgotpassword_horizontal);
        } else {
            context.setContentView(R.layout.forgotpassword);
        }
    }

    public void setup() {
        ImageView backArrow = context.findViewById(R.id.imageView82);
        backArrow.setOnClickListener(view -> new ActivityMainController(context).setup());

        Button forgotButton = context.findViewById(R.id.button);
        forgotButton.setOnClickListener(view -> showPopup());
    }

    private void showPopup() {
        View popupView = LayoutInflater.from(context).inflate(R.layout.popup, null);

        final PopupWindow popupWindow = new PopupWindow(
                popupView,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                true
        );

        View rootView = context.findViewById(android.R.id.content);
        popupWindow.setElevation(20);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popupWindow.setOutsideTouchable(true);

        View overlay = new View(context);
        overlay.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        overlay.setBackgroundColor(Color.parseColor("#88000000"));
        ((ViewGroup) rootView).addView(overlay);

        popupWindow.setOnDismissListener(() -> ((ViewGroup) rootView).removeView(overlay));
        popupWindow.showAtLocation(rootView, Gravity.CENTER, 0, 0);
    }
}