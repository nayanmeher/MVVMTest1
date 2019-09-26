package com.kellton.mvvmtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Gallery extends AppCompatActivity {

    public static final String TAG = "Gallery";
    private ImageView imageView;
    private TextView tvImageDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        tvImageDesc = findViewById(R.id.image_desc);
        imageView = findViewById(R.id.image_view);

        getIntentData();

    }

    private void getIntentData(){
        if (getIntent().hasExtra("image_name") && getIntent().hasExtra("image_url")){
            Log.d(TAG, "getIntentData: ");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageDesc = getIntent().getStringExtra("image_name");

            tvImageDesc.setText(imageDesc);
            Glide.with(this)
                    .asBitmap()
                    .load(imageUrl)
                    .into(imageView);


        }
    }
}
