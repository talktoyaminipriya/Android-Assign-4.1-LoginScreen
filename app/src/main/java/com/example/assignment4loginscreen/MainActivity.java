package com.example.assignment4loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    public void signup (View v){

        Toast.makeText(getBaseContext(),"You Clicked on Sign Up Link",Toast.LENGTH_LONG).show();

    }

@Override

    public void onClick(View v){

        Toast.makeText(getBaseContext(),"You Clicked on Login Button",Toast.LENGTH_LONG).show();

    }
}

