package com.example.arrayadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        String[] person={"arun","varun","kishore","sanjay","amal","benny","melbin"};

        listView=findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,person));
        listView.setOnItemClickListener(((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(), "the name selected is :"+person[position], Toast.LENGTH_LONG).show();

        }));


    }
}