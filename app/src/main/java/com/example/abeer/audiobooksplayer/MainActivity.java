package com.example.abeer.audiobooksplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// In the mainActivity.java just onClickListeners added
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView recentPlayed = (TextView) findViewById(R.id.recent);
        recentPlayed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent recent_Intent = new Intent(MainActivity.this, Recently_played.class);
                startActivity(recent_Intent);
            }
        });
        TextView bestSell = (TextView) findViewById(R.id.best_sell);
        bestSell.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent bestSell_Intent = new Intent(MainActivity.this, BestSelling.class);
                startActivity(bestSell_Intent);
            }
        });
    }
}
