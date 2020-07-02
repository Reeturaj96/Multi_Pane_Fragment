package com.example.multi_pane_fragment_assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FirstFragment extends Fragment {

    ListView listView;
    String[] name;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        listView=v.findViewById(R.id.listview);

        name=getResources().getStringArray(R.array.version_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (getContext(),android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                FragmentManager fm = getFragmentManager();
                SecondFragment sfm = (SecondFragment) fm.findFragmentById(R.id.fragment2);
                sfm.getdata(name[position],position);

            }
        });

        return v;
    }
}
