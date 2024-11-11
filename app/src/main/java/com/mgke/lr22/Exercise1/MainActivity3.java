package com.mgke.lr22.Exercise1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mgke.lr22.R;

import android.content.Intent;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mgke.lr22.Exercise2.MainActivity; // Импорт второго задания


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        final EditText toField = findViewById(R.id.toField);
        final EditText messageField = findViewById(R.id.messageField);
        Button sendButton = findViewById(R.id.sendButton);
        Button buttonToTaskTwo = findViewById(R.id.button_to_task_two); // Привязка новой кнопки

        // Обработка нажатия на кнопку отправки сообщения
        sendButton.setOnClickListener(v -> {
            String to = toField.getText().toString();
            String message = messageField.getText().toString();

            // Показать Toast с содержимым полей
            Toast.makeText(MainActivity3.this, "Отправлено: " + to + ", Сообщение: " + message, Toast.LENGTH_SHORT).show();

            // Очистить поля после отправки
            toField.setText("");
            messageField.setText("");
        });

        // Переход на активити второго задания
        buttonToTaskTwo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity.class); // Переход на активити второго задания
            startActivity(intent);
        });
    }
}