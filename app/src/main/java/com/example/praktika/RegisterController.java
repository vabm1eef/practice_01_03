package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterController {
    private final Activity context;

    public RegisterController(Activity context) {
        this.context = context;
        // Проверяем ориентацию и выбираем соответствующий layout
        int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            context.setContentView(R.layout.register_horizontal);
        } else {
            context.setContentView(R.layout.register);
        }
    }

    public void setup() {
        TextView backToLogin = context.findViewById(R.id.textView6);
        backToLogin.setOnClickListener(view -> new ActivityMainController(context).setup());

        Button registerButton = context.findViewById(R.id.button);
        CheckBox checkboxAgree = context.findViewById(R.id.checkbox_agree);

        registerButton.setOnClickListener(view -> {
            if (!checkboxAgree.isChecked()) {
                Toast.makeText(context, "Вы должны согласиться с условиями", Toast.LENGTH_SHORT).show();
            } else {
                new LogoController(context).showLogoAndWelcome();
            }
        });
    }
}