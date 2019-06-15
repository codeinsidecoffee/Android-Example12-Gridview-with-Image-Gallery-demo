package com.mrlonewolfer.example43;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;
import android.os.Parcel;
import java.util.ArrayList;

import androidx.fragment.app.Fragment;


public class ImageAdapterClass extends BaseAdapter{

    Context context;
    ArrayList<ImageBean> imageBeans;
    int  imgid;

    public ImageAdapterClass(Context context, ArrayList<ImageBean> imageBeans) {
    this.context=context;
        this.imageBeans=imageBeans;
    }

    @Override
    public int getCount() {
        return imageBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        RatingBar rateImage;
        if(convertView==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.grid_layout_xml, parent, false);
        }
        final ImageBean imageBean=imageBeans.get(position);
        imageView=convertView.findViewById(R.id.imgViewId);
        imageView.setImageResource(imageBean.mImgId);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        rateImage=convertView.findViewById(R.id.rateImg);
        rateImage.setRating(Float.parseFloat(imageBean.RatingBar));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,FullScreenActivity.class);
                 imgid=imageBean.getmImgId();

             Bundle bundle= new Bundle();
             bundle.putInt("mimgid",imgid);
                bundle.putString("imagrating",imageBean.getRatingBar());

              //  Toast.makeText(context, "Imageid"+imageBeans.get(position).mImgId, Toast.LENGTH_SHORT).show();
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

        return  convertView;

    }


}
