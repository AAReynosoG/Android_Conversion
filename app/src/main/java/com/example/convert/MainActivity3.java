package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView txtf, txtk;

    Double valorCelsius, valorKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            valorCelsius = bundle.getDouble("valorCelsius");
            valorKelvin = bundle.getDouble("valorKelvin");
        }

        txtf = findViewById(R.id.txtF);
        txtk = findViewById(R.id.txtK);

        txtf.setText(txtf.getText() + Double.toString(valorCelsius));
        txtk.setText(txtk.getText() + Double.toString(valorKelvin));
    }
}