package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etext1, etext2;
    TextView tv;

    Button add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etext1 = findViewById(R.id.et1);
        etext2 = findViewById(R.id.et2);
        tv = findViewById(R.id.textView);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        mul = findViewById(R.id.buttonMul);
        div = findViewById(R.id.buttonDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, result;
                num1 = Integer.parseInt(etext1.getText().toString());
                num2 = Integer.parseInt(etext2.getText().toString());

                result = num1 + num2;
                tv.setText("Addition = " + result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, result;
                num1 = Integer.parseInt(etext1.getText().toString());
                num2 = Integer.parseInt(etext2.getText().toString());

                result = num1 - num2;
                tv.setText("Subtraction = " + result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, result;
                num1 = Integer.parseInt(etext1.getText().toString());
                num2 = Integer.parseInt(etext2.getText().toString());

                result = num1 * num2;
                tv.setText("Multiplication = " + result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, result;
                num1 = Integer.parseInt(etext1.getText().toString());
                num2 = Integer.parseInt(etext2.getText().toString());

                result = num1 / num2;
                tv.setText("Division = " + result);
            }
        });

    }
}