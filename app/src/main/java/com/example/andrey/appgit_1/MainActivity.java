package com.example.andrey.appgit_1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button) findViewById(R.id.button1);
        bt.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.tv1);

        System.out.println("Активити создано. freeMemory = " + Runtime.getRuntime().freeMemory());
        System.out.println("Активити создано. totalMemory = " + Runtime.getRuntime().totalMemory());
    }



 /*   public void onClick(View view) {
        A1 a1 = new A1();
        st = Long.toString(a1.getX());
        tv.setText(st);

    }*/

    A1 a1 = new A1();

    //Обработка нажатия кнопки
    @Override
    public void onClick(View v) {
        //A1 a1 = new A1();
        st = Long.toString(a1.getX());
        tv.setText(st);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Кнопка нажата. freeMemory = " + Runtime.getRuntime().freeMemory());
        System.out.println("Кнопка нажата. totalMemory = " + Runtime.getRuntime().totalMemory());

    }
}