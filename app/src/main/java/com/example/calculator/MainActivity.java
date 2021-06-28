package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mE1;
    private EditText mE2;
    private TextView mResult;
    private Button mB1;
    private Button mB2;
    private Button mB3;
    private Button mB4;
    private String mCount = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mE1=(EditText)findViewById(R.id.et1);
        mE2=(EditText)findViewById(R.id.et2);
        mResult=(TextView)findViewById(R.id.result);
        mB1=(Button)findViewById(R.id.plus);
        mB2=(Button)findViewById(R.id.minus);
        mB3=(Button)findViewById(R.id.multiply);
        mB4=(Button)findViewById(R.id.divide);

        mB1.setOnClickListener(this);
        mB2.setOnClickListener(this);
        mB3.setOnClickListener(this);
        mB4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        float value1 =0;
        float value2=0;
        float result=0;
        value1=Float.parseFloat(mE1.getText().toString());
        value2=Float.parseFloat(mE2.getText().toString());

        switch (v.getId()) {
            case R.id.plus:
                mCount = "+";
                result = value1 + value2;
                break;
            case R.id.minus:
                mCount = "-";
                result = value1 - value2;
                break;
            case R.id.multiply:
                mCount = "*";
                result = value1 * value2;
                break;
            case R.id.divide:
                mCount = "/";
                result = value1 / value2;
                break;
            default:
                break;
        }

        mResult.setText(value1 + " " + mCount + " " + value2 + " = " + result);
    }
}