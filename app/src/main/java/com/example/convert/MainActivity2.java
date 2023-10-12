package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtf, txtk;

    Double valorFarenheit, valorKelvin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            valorFarenheit = bundle.getDouble("valorFarenheit");
            valorKelvin = bundle.getDouble("valorKelvin");
        }

        txtf = findViewById(R.id.txtF);
        txtk = findViewById(R.id.txtK);

        txtf.setText(txtf.getText() + Double.toString(valorFarenheit));
        txtk.setText(txtk.getText() + Double.toString(valorKelvin));
    }
}