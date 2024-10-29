package com.example.lab1android;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_activity);

        textView = findViewById(R.id.textView);

        // Получаем текст, переданный из MainActivity
        String text = getIntent().getStringExtra("text_key");
        textView.setText(text);
    }
}
