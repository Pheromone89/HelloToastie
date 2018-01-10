package com.ggdz.store.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nispok.snackbar.Snackbar;

public class SimpleCalcActivity extends AppCompatActivity {

    Button addButton;
    Button minButton;
    Button mulButton;
    Button divButton;
    EditText firstNumberView;
    double d1n;
    EditText secondNumberView;
    double d2n;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);

        addButton = (Button) findViewById(R.id.plus_button);
        minButton = (Button) findViewById(R.id.minus_button);
        mulButton = (Button) findViewById(R.id.mul_button);
        divButton = (Button) findViewById(R.id.div_button);
        resultView = (TextView) findViewById(R.id.calc_result);
        firstNumberView = (EditText) findViewById(R.id.first_calc_number);
        secondNumberView = (EditText) findViewById(R.id.second_calc_number);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber();
                displayResult(add(d1n, d2n));
            }
        });
        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber();
                displayResult(min(d1n, d2n));
            }
        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber();
                displayResult(mul(d1n, d2n));
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber();
                if (d1n == 0 || d2n == 0) {
                    Toast.makeText(SimpleCalcActivity.this, "No no no no no!", Toast.LENGTH_SHORT).show();
                } else {
                    displayResult(div(d1n, d2n));
                }
            }
        });
    }

    private void setNumber() {
        d1n = (double) Integer.parseInt(firstNumberView.getText().toString());
        d2n = (double) Integer.parseInt(secondNumberView.getText().toString());
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double min(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    private void displayResult(double num) {
        resultView.setText("" + num);
    }
}
