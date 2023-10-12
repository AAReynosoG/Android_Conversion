package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView txtf, txtk;

    Double valorCelsius, valorFarenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            valorCelsius = bundle.getDouble("valorCelsius");
            valorFarenheit = bundle.getDouble("valorFarenheit");
        }

        txtf = findViewById(R.id.txtF);
        txtk = findViewById(R.id.txtK);

        txtf.setText(txtf.getText() + Double.toString(valorCelsius));
        txtk.setText(txtk.getText() + Double.toString(valorFarenheit));
    }
}