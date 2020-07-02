package com.example.multi_pane_fragment_assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    ImageView imageView;
    TextView textView;
    Integer[] image={R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,
    R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,
    R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,
            R.drawable.nougat,R.drawable.oreo,R.drawable.pie};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v =inflater.inflate(R.layout.fragment_second, container, false);

        imageView=v.findViewById(R.id.imageview);
        textView=v.findViewById(R.id.textView);



        return v;
    }

    public void getdata(String name, int posi)
    {
        imageView.setImageResource(image[posi]);
        textView.setText(name);
    }
}
