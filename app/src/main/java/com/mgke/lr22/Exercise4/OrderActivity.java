package com.mgke.lr22.Exercise4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mgke.lr22.R;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order);
        TextView orderSummaryText = findViewById(R.id.orderSummaryText);

        // Получаем заказ из intent
        String orderSummary = getIntent().getStringExtra("order_summary");

        // Отображаем заказ
        orderSummaryText.setText(orderSummary);
    }
}