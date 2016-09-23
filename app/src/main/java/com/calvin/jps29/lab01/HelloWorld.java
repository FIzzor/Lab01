package com.calvin.jps29.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toast.makeText(this, "There's a snake in mah boot!", Toast.LENGTH_SHORT).show();
    }
}
