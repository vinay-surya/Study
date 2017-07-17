package com.example.admin.study.Tutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.admin.study.R;

public class MainActivity extends AppCompatActivity {

    CardView
            cardView_java,
            cardView_testing,
            cardView_web_technology,
            cardView_dot_net,
            cardViewbig_data,
            cardView_sap,
            cardView_oracle,
            cardView_data_warehouse,
            cardView_java_script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView_java = (CardView)findViewById(R.id.cardview_java);
        cardView_testing = (CardView)findViewById(R.id.cardview_testing);
        cardView_web_technology = (CardView)findViewById(R.id.cardview_web_technology);
        cardView_dot_net = (CardView)findViewById(R.id.cardview_dot_net);
        cardViewbig_data = (CardView)findViewById(R.id.cardview_big_data);
        cardView_sap = (CardView)findViewById(R.id.cardview_sap);
        cardView_oracle = (CardView)findViewById(R.id.cardview_oracle);
        cardView_data_warehouse = (CardView)findViewById(R.id.cardview_data_warehouse);
        cardView_java_script = (CardView)findViewById(R.id.cardview_java_script);

        cardView_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Java.class);
                startActivity(intent);
            }
        });

        cardView_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Testing.class);
                startActivity(intent);
            }
        });

        cardView_web_technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Web_Technology.class);
                startActivity(intent);
            }
        });


        cardView_dot_net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dot_net.class);
                startActivity(intent);
            }
        });

        cardViewbig_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Big_Data.class);
                startActivity(intent);
            }
        });

        cardView_sap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sap.class);
                startActivity(intent);
            }
        });

        cardView_oracle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Oracle.class);
                startActivity(intent);
            }
        });

        cardView_data_warehouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Data_warehouse.class);
                startActivity(intent);
            }
        });

        cardView_java_script.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Java_Script.class);
                startActivity(intent);
            }
        });

    }
}
