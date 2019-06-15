package com.mrlonewolfer.example43;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RatingBar;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment  {


    Context context;
    RatingBar rateImage;
    ArrayList<ImageBean> imageBeans;
    GridView gridView;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        gridView=view.findViewById(R.id.grid_view);
        preparedData();
        ImageAdapterClass imageAdapterClass=new ImageAdapterClass(context,imageBeans);
        gridView.setAdapter(imageAdapterClass);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getContext(),FullScreenActivity.class);
//                intent.putExtra("id",position);
//                startActivity(intent);
//            }
//        });
        return view;
    }

    private void preparedData() {
        imageBeans=new ArrayList<>();
        imageBeans.add(new ImageBean(R.drawable.statusvideologo,"4.7"));
        imageBeans.add(new ImageBean(R.drawable.plmk,"5.0"));
        imageBeans.add(new ImageBean(R.drawable.mahabharatlogo,"4.5"));
        imageBeans.add(new ImageBean(R.drawable.ramayanlogo,"4.0"));
        imageBeans.add(new ImageBean(R.drawable.statussaverlogo,"4.0"));
        imageBeans.add(new ImageBean(R.drawable.storyingujarati,"5.0"));
        imageBeans.add(new ImageBean(R.drawable.storyinhindi,"4.4"));
        imageBeans.add(new ImageBean(R.drawable.storyinenglish,"4.6"));

    }

}
