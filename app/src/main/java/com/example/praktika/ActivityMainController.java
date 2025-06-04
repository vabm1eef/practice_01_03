package com.example.praktika;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMainController {
    private final Activity context;
    private boolean isLandscapeMode;

    public ActivityMainController(Activity context) {
        this.context = context;
        this.isLandscapeMode = isLandscapeOrientation();
    }

    public void setup() {
        // Устанавливаем layout в зависимости от ориентации
        setAppropriateLayout();

        // Инициализация UI элементов
        initializeViews();
    }

    private void setAppropriateLayout() {
        if (isLandscapeMode) {
            context.setContentView(R.layout.activity_main_horizontal);
        } else {
            context.setContentView(R.layout.activity_main);
        }
    }

    private void initializeViews() {
        EditText emailInput = context.findViewById(R.id.editTextTextEmailAddress);
        EditText passwordInput = context.findViewById(R.id.editTextTextPassword);
        Button button = context.findViewById(R.id.button);
        TextView textView6 = context.findViewById(R.id.textView6);
        TextView textView5 = context.findViewById(R.id.textView5);

        // Обработчики событий
        button.setOnClickListener(v -> handleLogin(emailInput, passwordInput));
        textView6.setOnClickListener(v -> new RegisterController(context).setup());
        textView5.setOnClickListener(v -> new ForgotPasswordController(context).setup());
    }

    private void handleLogin(EditText emailInput, EditText passwordInput) {
        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();

        if (email.equals("oav13052006@gmail.com") && password.equals("1234")) {
            new LogoController(context).showLogoAndWelcome();
        } else {
            Toast.makeText(context, "Неверный логин или пароль", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isLandscapeOrientation() {
        return context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    public void onConfigurationChanged(Configuration newConfig) {
        boolean newOrientation = newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE;

        if (this.isLandscapeMode != newOrientation) {
            this.isLandscapeMode = newOrientation;
            // Перезагружаем layout только если ориентация действительно изменилась
            setAppropriateLayout();
            initializeViews();
        }
    }
}