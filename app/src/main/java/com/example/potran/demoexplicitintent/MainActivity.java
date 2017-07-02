package com.example.potran.demoexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int requestCodeForSupermanStats = 1;
    int requestCodeForBatmanStats = 2;

    TextView tvSuperman, tvBatman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBatman = (TextView) findViewById(R.id.textViewBatman);
        tvSuperman = (TextView) findViewById(R.id.textViewSuperman);

        tvSuperman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Hero Object of strength 100 & technical 60
                Hero superman = new Hero("Superman",100,60);
                Intent i = new Intent(MainActivity.this, HeroStatsActivity.class);

                // Put hero object in intent
                i.putExtra("hero", superman);
                startActivityForResult(i, requestCodeForSupermanStats);
            }
        });

        tvBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Hero Object of strength 100 & technical 60
                Hero superman = new Hero("Batman",60,90);
                Intent i = new Intent(MainActivity.this, HeroStatsActivity.class);

                // Put hero object in intent
                i.putExtra("hero", superman);
                startActivityForResult(i, requestCodeForBatmanStats);
            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        // Only handle when 2nd activity closed normally
        //  and data contains something

        if(resultCode == RESULT_OK){
            if(data != null){
                // Get data passed back from 2nd activity
                String like = data.getStringExtra("like");
                String statement = "";
                // If it is activity started by clicking
                //  Superman, create corresponding String
            }
        }
    }
}
