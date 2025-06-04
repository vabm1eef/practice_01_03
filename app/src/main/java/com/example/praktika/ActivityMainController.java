package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMainController {
    private final Activity context;

    public ActivityMainController(Activity context) {
        this.context = context;
    }

    public void setup() {
        // Устанавливаем правильный layout в зависимости от ориентации
        if (isLandscape()) {
            context.setContentView(R.layout.activity_main_horizontal);
        } else {
            context.setContentView(R.layout.activity_main);
        }

        // Инициализация UI элементов
        EditText emailInput = context.findViewById(R.id.editTextTextEmailAddress);
        EditText passwordInput = context.findViewById(R.id.editTextTextPassword);
        Button button = context.findViewById(R.id.button);
        TextView textView6 = context.findViewById(R.id.textView6);
        TextView textView5 = context.findViewById(R.id.textView5);

        // Обработчики событий
        button.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (email.equals("oav13052006@gmail.com") && password.equals("1234")) {
                new LogoController(context).showLogoAndWelcome();
            } else {
                Toast.makeText(context, "Неверный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });

        textView6.setOnClickListener(v -> new RegisterController(context).setup());
        textView5.setOnClickListener(v -> new ForgotPasswordController(context).setup());
    }

    // Проверка ориентации устройства
    private boolean isLandscape() {
        return context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    // Метод для обработки изменения конфигурации (например, поворота экрана)
    public void onConfigurationChanged(Configuration newConfig) {
        // Перезагружаем layout при изменении ориентации
        setup();
    }
}