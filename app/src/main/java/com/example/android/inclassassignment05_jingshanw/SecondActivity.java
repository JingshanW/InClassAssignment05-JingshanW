package com.example.android.inclassassignment05_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.id.message;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;
    private TextView moreInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText= (TextView) findViewById(R.id.display_text);
        moreInformation= (TextView) findViewById(R.id.more_information);

        Intent intent=getIntent();
        Car c=(Car) getIntent().getSerializableExtra(Keys.CAR);
        displayText.setText(c.toString());

        Intent intent2=getIntent();
        String information=moreInformation.getText().toString();
        moreInformation.setText(information);



    }
}
