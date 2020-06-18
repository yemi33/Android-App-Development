package com.myappcompany.rob.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchDog(View view)
    {
        Log.i ("info","Button pressed");
        ImageView image = (ImageView) findViewById(R.id.dogImage);
        image.setImageResource(R.drawable.dog2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
