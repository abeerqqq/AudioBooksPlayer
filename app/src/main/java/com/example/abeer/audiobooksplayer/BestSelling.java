package com.example.abeer.audiobooksplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BestSelling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_selling);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Girl On The Train", "Paula Hawkins"));
        books.add(new Book("Endless Night", "Agatha Christie"));
        books.add(new Book("Hamlet", "William Shakespeare"));
        books.add(new Book("Me Before You", "Jojo Moyes"));
        books.add(new Book("A Man Called Ove", "Fredrik Backman"));
        books.add(new Book("Shackleton's Boat Journey", "F.A Worsley"));
        BookAdapter bookAdapter = new BookAdapter(this, books);

        ListView listViewOfBestSelling = (ListView) findViewById(R.id.listOfBest);
        listViewOfBestSelling.setAdapter(bookAdapter);

        TextView bestSellBackButton = (TextView) findViewById(R.id.backButton);
        bestSellBackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent bestSell_Intent_back = new Intent(BestSelling.this, MainActivity.class);
                startActivity(bestSell_Intent_back);
            }
        });
    }
}
