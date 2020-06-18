package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public Number() {
        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;
                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            }else {

                return false;
            }
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);

            if ((squareRoot) == Math.floor(squareRoot)) { //checking if integer
                return true;
            }else {
                return false;
            }
        }
    }

    public void testNumber(View view){
        Log.i("info", "button pressed");
        EditText editText = (EditText)findViewById(R.id.editTextNumber);

        String message1 = "Please enter a number";

        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(this, message1, Toast.LENGTH_LONG).show();
        }else if (Integer.parseInt(editText.getText().toString()) < 0) {
            message1 = "Please enter a positive number";
            Toast.makeText(this, message1, Toast.LENGTH_LONG).show();
        }else{

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            System.out.println(myNumber.isSquare());

            String message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message += " is square and triangular";
            } else if (myNumber.isSquare()) {
                message += " is a square but not triangular";
            } else if (myNumber.isTriangular()) {
                message += " is triangular but not square";
            } else {
                message += " is neither square nor triangular";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}