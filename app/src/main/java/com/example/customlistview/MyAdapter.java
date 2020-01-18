package com.example.customlistview;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<I_Items>
{
    ArrayList<I_Items> ii_items = new ArrayList<>();
    public MyAdapter(MainActivity mainActivity, int custom_list_view_items, ArrayList<I_Items> i_items) {
        super(mainActivity,custom_list_view_items,i_items);
        ii_items=i_items;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v=convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v= inflater.inflate(R.layout.custom_list_view_items,null);
        TextView textView= v.findViewById(R.id.textViewcustom);
        ImageView imageView=v.findViewById(R.id.imageViewcustom);

        textView.setText(ii_items.get(position).getName());
       imageView.setImageResource(ii_items.get(position).getImage());
        return v;

    }
}
