package com.example.android.inclassassignment05_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.android.inclassassignment05_jingshanw.Keys.CAR;


public class MainActivity extends AppCompatActivity {

    private TextView brand;
    private TextView color;
    private TextView price;
    private CheckBox suv;
    private TextView moreInformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brand= (TextView) findViewById(R.id.brand);
        color= (TextView) findViewById(R.id.color);
        price= (TextView) findViewById(R.id.price);
        suv= (CheckBox) findViewById(R.id.suv_checkbox);
        moreInformation= (TextView) findViewById(R.id.information);

    }

    public void submit(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        String b=brand.getText().toString();
        String c=color.getText().toString();
        String p=price.getText().toString();
        int pr=Integer.parseInt(p);
  //      String s=suv.getText().toString();
    //    boolean su=Boolean.parseBoolean(s);

        boolean su = ((CheckBox) findViewById(R.id.suv_checkbox)).isChecked();

        Car car=new Car(b,c,pr,su);
        intent.putExtra(Keys.CAR,car);
        startActivity(intent);

        Intent intent2=new Intent(this,SecondActivity.class);
        String message=moreInformation.getText().toString();
        intent2.putExtra(Keys.MESSAGE,message);
        startActivity(intent2);



    }
}
