package com.example.abeer.audiobooksplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(@NonNull Activity context, ArrayList<Book> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list, parent, false);
        }
        Book currentBook = getItem(position);

        TextView bookNameTextView = (TextView) listItemView.findViewById(R.id.bookName);
        bookNameTextView.setText(currentBook.getBookName());

        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.author);
        authorNameTextView.setText(currentBook.getAuthor());

        return listItemView;
    }
}
