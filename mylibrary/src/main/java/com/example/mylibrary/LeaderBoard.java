package com.example.mylibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class LeaderBoard extends LinearLayout {

    private ImageView image1;
    private TextView name1;

    private ImageView image2;
    private TextView name2;
    private ImageView image3;
    private TextView name3;
    private ImageView customImage;
    private TextView customName;
    private TextView customRank;

    public LeaderBoard(Context context) {
        super(context);
        init(context);
    }

    public LeaderBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public LeaderBoard(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);

    }

    public LeaderBoard(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);

    }

    private void init(Context context) {
        View v = LayoutInflater.from(context).inflate(R.layout.leader_board, this, true);
        image1 = (ImageView) v.findViewById(R.id.ivImage1);
        name1 = (TextView) v.findViewById(R.id.tvName1);
        image2 = (ImageView) v.findViewById(R.id.ivImage2);
        name2 = (TextView) v.findViewById(R.id.tvName2);
        image3 = (ImageView) v.findViewById(R.id.ivImage3);
        name3 = (TextView) v.findViewById(R.id.tvName3);
        customImage = (ImageView) v.findViewById(R.id.ivCustomImage);
        customName = (TextView) v.findViewById(R.id.tvCustomName);
        customRank = (TextView) v.findViewById(R.id.tvCustomRank);
    }

    public void setRank1(String name, Bitmap bm) {
        name1.setText(name);
        if (!bm.equals(null)) {
            image1.setImageBitmap(bm);
        }
    }

    public void setRank1(String name, String url) {
        name1.setText(name);
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(image1);
        }
    }

    public void setRank2(String name, Bitmap bm) {
        name2.setText(name);
        if (!bm.equals(null)) {
            image2.setImageBitmap(bm);
        }
    }

    public void setRank2(String name, String url) {
        name2.setText(name);
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(image2);
        }
    }

    public void setRank3(String name, Bitmap bm) {
        name3.setText(name);
        if (!bm.equals(null)) {
            image3.setImageBitmap(bm);
        }
    }

    public void setRank3(String name, String url) {
        name3.setText(name);
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(image3);
        }
    }

    public void setCustomRank(String name, Bitmap bm, String rank) {
        customName.setText(name);
        customRank.setText(rank);
        if (!bm.equals(null)) {
            customImage.setImageBitmap(bm);
        }
    }

    public void setCustomRank(String name, String url, String rank) {
        customName.setText(name);
        customRank.setText("Rank: "+rank);
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).into(customImage);
        }
    }
}
