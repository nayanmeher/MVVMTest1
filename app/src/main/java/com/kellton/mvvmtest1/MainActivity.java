package com.kellton.mvvmtest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private ArrayList<String> imageUrl = new ArrayList<>();
    private ArrayList<String> imageName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: started");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeList();
        initRecyclerView();
    }

    private void initializeList(){
        imageName.add("Puri Tample");
        imageUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQVLhAZ3XH49jfbPQYOFSXt7pLn-xXHxRctTwVMfTw8Jkr3t-qo");

        imageName.add("Nrusinghnath");
        imageUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQAIO1GTIjRTlmyWSYTe4MGe_5azdNxlpgnbNDhwN_narqzxqC-");

        imageName.add("Konark Tample");
        imageUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTbJreNEzntqLYCUzg3AiNubdNf_WNIuDZN4XuvUEV3F7SoK4en");

        imageName.add("Golden Tample");
        imageUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQLinSWvdW7LeZtvmvQ7Qaq0wEg-GYIJ4DE3kF_af1t1z-vm1pn");

        imageName.add("Taj Mahal");
        imageUrl.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQj-y51EfuVHY5vI2crccf1lRkTJs0vxjpuz4KOZhIYnDDlqIjJ");

        imageName.add("Hampi");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/hampi.jpg");

        imageName.add("Qutub Minar");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/Qutub-Minar.jpg");

        imageName.add("Hawa Mahal");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/Hawa-Mahal.jpg");

        imageName.add("Gateway of India");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/Gateway-of-India.jpg");

        imageName.add("Charminar");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/Charminar.jpg");

        imageName.add("Jallianwala Bagh");
        imageUrl.add("https://ihplb.b-cdn.net/wp-content/uploads/2018/06/Jallianwala-Bagh.jpg");

        imageName.add("Sikkim");
        imageUrl.add("https://static-blog.treebo.com/wp-content/uploads/2018/01/Sikkim.jpg");

        imageUrl.add("https://i.redd.it/glin0nwndo501.jpg");
        imageName.add("White Sands Desert");

        imageUrl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        imageName.add("Havasu Falls");

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: ");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, imageName, imageUrl);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
