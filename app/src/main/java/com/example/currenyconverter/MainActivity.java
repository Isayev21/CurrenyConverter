package com.example.currenyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void currencyConverter(View view){
        double currentDollar = 1.70;
        double userEnteredAmount;
        EditText editText = (EditText) findViewById(R.id.editNumber);
        userEnteredAmount = Double.parseDouble(editText.getText().toString());

        double result = userEnteredAmount / currentDollar;
        DecimalFormat df_obj = new DecimalFormat("#.##");
        Toast.makeText(getApplicationContext(), df_obj.format(result) +"$", Toast.LENGTH_LONG).show();

    }
}