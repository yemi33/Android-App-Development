package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;

    public void generateRandomNumber(){
        Random random = new Random();
        num = random.nextInt(20)+1;
    }

    public void guess(View view){
        Log.i("info",Integer.toString(num));
        EditText editText = (EditText) findViewById(R.id.editText);

        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;
        if (guessValue > num) {
            message = "lower";
        }else if (guessValue < num){
            message = "higher";
        }else{
            message = "You got it right! Try it again.";
            generateRandomNumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Entered Value:", editText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

    }
}