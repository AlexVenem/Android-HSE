package com.example.lab1android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_activity);

        nameEditText = findViewById(R.id.nameEditText);
        closeButton = findViewById(R.id.closeButton);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("name_key", name);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}

