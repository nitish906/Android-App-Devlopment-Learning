package com.masai.handbooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider.findViewById(R.id.image_slider);

        List<SlideModel> imageSlider=new ArrayList<>();

        imageSlider.add(new SlideModel(R.drawable.pic_1,null));
        imageSlider.add(new SlideModel(R.drawable.pic_2,null));
        imageSlider.add(new SlideModel(R.drawable.pic_3,null));

    }

}