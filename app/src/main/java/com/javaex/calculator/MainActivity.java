package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtText;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clr;
    private Button eql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("calculator", "btn_onClick: ");

                switch (view.getId()) {
                    case R.id.one:
                        Log.d("cct", "1: ");
                        edtText.setText(edtText.getText().toString() + 1);
                        break;
                    case R.id.two:
                        Log.d("cct", "2: ");
                        edtText.setText(edtText.getText().toString() + 2);
                        break;
                    case R.id.three:
                        Log.d("cct", "3: ");
                        edtText.setText(edtText.getText().toString() + 3);
                        break;
                    case R.id.four:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 4);
                        break;
                    case R.id.five:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 5);
                        break;
                    case R.id.six:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 6);
                        break;
                    case R.id.seven:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 7);
                        break;
                    case R.id.eight:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 8);
                        break;
                    case R.id.nine:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 9);
                        break;
                    case R.id.zero:
                        Log.d("cct", "4: ");
                        edtText.setText(edtText.getText().toString() + 0);
                        break;
                    case R.id.plus:
                        Log.d("cct", "+: ");
                        edtText.setText(edtText.getText().toString() + " + ");
                        break;
                    case R.id.sub:
                        Log.d("cct", "-: ");
                        edtText.setText(edtText.getText().toString() + " - ");
                        break;

                    case R.id.div:
                        Log.d("cct", "/: ");
                        edtText.setText(edtText.getText().toString() + " / ");
                        break;
                    case R.id.mul:
                        Log.d("cct", " *: ");
                        edtText.setText(edtText.getText().toString() + " * ");
                        break;
                    case R.id.clr:
                        Log.d("cct", "C: ");
                        edtText.setText("");
                        break;
                    case R.id.eql:
                        Log.d("cct", "=: ");
                        String result = edtText.getText().toString();
                        String[] resultArr = result.split(" ");
                        Log.d("cct", "" + resultArr[1]);
                        String sign = resultArr[1];
                        int no1 = Integer.parseInt(resultArr[0]);
                        int no2 = Integer.parseInt(resultArr[2]);
                        if (sign.equals("+")) {
                            edtText.setText(Integer.toString(no1+no2));
                        }else if (sign.equals("-")) {
                            edtText.setText(Integer.toString(no1-no2));
                        }else if (sign.equals("/")) {
                            edtText.setText(Double.toString(no1/no2));
                        }else if (sign.equals("*")){
                            edtText.setText(Integer.toString(no1*no2));
                        }
                        break;


                }


            }


        };

        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(Listener);

        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(Listener);

        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(Listener);

        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(Listener);

        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(Listener);

        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(Listener);

        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(Listener);

        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(Listener);

        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(Listener);

        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(Listener);

        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(Listener);

        sub = (Button) findViewById(R.id.sub);
        sub.setOnClickListener(Listener);

        mul = (Button) findViewById(R.id.mul);
        mul.setOnClickListener(Listener);

        div = (Button) findViewById(R.id.div);
        div.setOnClickListener(Listener);

        clr = (Button) findViewById(R.id.clr);
        clr.setOnClickListener(Listener);

        eql = (Button) findViewById(R.id.eql);
        eql.setOnClickListener(Listener);

        edtText = (EditText) findViewById(R.id.edtText);

    }
}