package com.example.convert;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.convert.R;
import com.example.convert.models.Celsius;
import com.example.convert.models.Farenheit;
import com.example.convert.models.Kelvin;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    EditText inpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int rbSeleccionado = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(rbSeleccionado);

        Button button = (Button) findViewById(R.id.b1);

        inpt = findViewById(R.id.input1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = radioGroup.getCheckedRadioButtonId();

                String datos = inpt.getText().toString();
                Double valor = Double.parseDouble(datos);

                if (checkedId == R.id.rb1) {

                    Celsius celsius = new Celsius(valor);
                    Farenheit farenheit = celsius.Parse(new Farenheit(valor));
                    Kelvin kelvin = celsius.Parse(new Kelvin(valor));

                    double valorFarenheit = farenheit.getValor();
                    double valorKelvin = kelvin.getValor();

                    Intent i = new Intent(context, MainActivity2.class);

                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorFarenheit", valorFarenheit);
                    bundle.putDouble("valorKelvin", valorKelvin);

                    i.putExtras(bundle);
                    startActivity(i);

                } else if (checkedId == R.id.rb2) {

                    Farenheit farenheit = new Farenheit(valor);
                    Celsius celsius = farenheit.Parse(new Celsius(valor));
                    Kelvin kelvin = celsius.Parse(new Kelvin(valor));

                    double valorCelsius = celsius.getValor();
                    double valorKelvin = kelvin.getValor();

                    Intent i = new Intent(context, MainActivity3.class);

                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorCelsius", valorCelsius);
                    bundle.putDouble("valorKelvin", valorKelvin);

                    i.putExtras(bundle);
                    startActivity(i);

                } else if (checkedId == R.id.rb3) {

                    Kelvin kelvin = new Kelvin(valor);
                    Celsius celsius = kelvin.Parse(new Celsius(valor));
                    Farenheit farenheit = kelvin.Parse(new Farenheit(valor));

                    double valorCelsius = celsius.getValor();
                    double valorFarenheit = farenheit.getValor();


                    Intent i =  new Intent(context, MainActivity4.class);
                    Bundle bundle =  new Bundle();
                    bundle.putDouble("valorCelsius", valorCelsius);
                    bundle.putDouble("valorFarenheit", valorFarenheit);

                    i.putExtras(bundle);
                    startActivity(i);
                }
            }
        });
    }
}
