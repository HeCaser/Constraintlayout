package com.example.wss.constraintlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();
        list.add("s");

        list.forEach(System.out::print);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setOnClickListener(view -> System.out.print("d"));
    }
}
