package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSumar, btnMultiplicar, btnDividir, btnRestar, btnIgual;
    private TextView txtResultado;
    private TextView txtEdit, txtOperacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSumar= findViewById(R.id.btnSumar);
        btnRestar= findViewById(R.id.btnRestar);
        btnDividir= findViewById(R.id.btnDividir);
        btnMultiplicar= findViewById(R.id.btnMultiplicar);
        txtResultado = findViewById(R.id.txtResultado);
        txtEdit = findViewById(R.id.txtEdit);
        txtOperacion = findViewById(R.id.txtOperacion);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("0");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "0");
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("1");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("2");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("3");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("4");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("5");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("6");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("7");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("8");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtEdit.setText("9");
                }
                else
                {
                    txtEdit.setText(txtEdit.getText().toString() + "9");
                }
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {

                }
                else
                {
                    txtOperacion.setText(Integer.toString(Integer.parseInt(txtOperacion.getText().toString()) + Integer.parseInt(txtEdit.getText().toString())));
                    txtEdit.setText("0");
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {
                    txtOperacion.setText(Integer.toString(Integer.parseInt(txtOperacion.getText().toString()) * Integer.parseInt(txtEdit.getText().toString())));
                    txtEdit.setText("0");
                }
                else
                {
                    if(txtOperacion.getText().equals("0"))
                    {
                        txtOperacion.setText(txtEdit.getText());
                        txtEdit.setText("0");
                    }
                    else
                    {

                        txtOperacion.setText(Integer.toString(Integer.parseInt(txtOperacion.getText().toString()) * Integer.parseInt(txtEdit.getText().toString())));
                        txtEdit.setText("0");
                    }


                }
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {

                }
                else
                {
                    txtOperacion.setText(Integer.toString(Integer.parseInt(txtEdit.getText().toString()) - Integer.parseInt(txtOperacion.getText().toString())));
                    txtEdit.setText("0");
                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEdit.getText().toString().equals("0"))
                {

                }
                else
                {
                    if(txtOperacion.getText().equals("0"))
                    {
                        txtOperacion.setText(txtEdit.getText());
                        txtEdit.setText("0");
                    }
                    else
                    {
                        txtOperacion.setText(Integer.toString(Integer.parseInt(txtOperacion.getText().toString()) / Integer.parseInt(txtEdit.getText().toString())));
                        txtEdit.setText("0");
                    }


                }
            }
        });

    }


}