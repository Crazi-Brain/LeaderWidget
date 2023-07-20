package com.example.libraryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.example.libraryapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    LeaderBoardd leaderBoard;

    String url= "https://picsum.photos/200/300";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();

    }
    private void init(){
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.salman3);
        try{
          binding.leader.setRank1("irfan Ali Siddiquee", url);
          binding.leader.setRank2("Arman Pathan Sighwara", icon);
          binding.leader.setRank3("Alfaz", icon);
          binding.leader.setCustomRank("Rahul Shawney", url, "201898356561516546654651");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}