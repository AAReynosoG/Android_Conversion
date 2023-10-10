package com.example.convert;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.convert.R;

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

                if (checkedId == R.id.rb1) {

                } else if (checkedId == R.id.rb2) {

                } else if (checkedId == R.id.rb3) {

                }
            }
        });
    }
}
