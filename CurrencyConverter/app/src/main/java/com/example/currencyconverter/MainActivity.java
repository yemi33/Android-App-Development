package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("info","button pressed");
        EditText editText = findViewById(R.id.editText);

        //1000 won in Korea equals 0.83 dollars in US
        String amountInWon = editText.getText().toString();
        double amountInWonDouble = Double.parseDouble(amountInWon);
        double amountInUSDDouble = amountInWonDouble * 0.00083;
        String amountInUSD = Double.toString(amountInUSDDouble);
        Log.i("Amount in dollars",amountInUSD);
        Toast.makeText(this, "W" + amountInWon + " is $" +amountInUSD, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}