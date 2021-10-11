package com.example.abeer.audiobooksplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Recently_played extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Kafka On The Shore", "Haruki Murakami"));
        books.add(new Book("The Da Vinci Code", "Dan Brown"));
        books.add(new Book("Before I Go To Sleep", "S.J. Watson"));
        books.add(new Book("Zorba The Greek", "Nikos Kazantzakis"));
        books.add(new Book("The Kite Runner", "Khaled Hosseini"));

        BookAdapter bookAdapter = new BookAdapter(this, books);

        ListView listViewOfRecent = (ListView) findViewById(R.id.listOfRecent);
        listViewOfRecent.setAdapter(bookAdapter);

        TextView resentPlayedBackButton = (TextView) findViewById(R.id.backButton);
        resentPlayedBackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent bestSell_Intent_back = new Intent(Recently_played.this, MainActivity.class);
                startActivity(bestSell_Intent_back);
            }
        });
    }
}
