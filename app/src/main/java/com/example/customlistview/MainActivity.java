package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv1;

    ArrayList<I_Items> i_items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.simpleListViewcustom);

     i_items.add(new I_Items("Sunny",R.drawable.image_one));
        i_items.add(new I_Items("Ajay",R.drawable.image_two));
        i_items.add(new I_Items("ABC",R.drawable.image_three));
        i_items.add(new I_Items("PQR",R.drawable.image_four));


        MyAdapter myAdapter= new MyAdapter(this, R.layout.custom_list_view_items,i_items);
        lv1.setAdapter(myAdapter);


    }
}
