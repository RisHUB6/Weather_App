package com.rishabh.weatherbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class cityfinderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityfinder);
        final EditText editText = findViewById(R.id.searchCity);
        ImageView backButton = findViewById(R.id.backButton);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                String newCity = editText.getText().toString();
                Intent intent = new Intent(cityfinderActivity.this, MainActivity.class);
                intent.putExtra("City", newCity);
                startActivity(intent);



                return false;
            }
        });



    }
}