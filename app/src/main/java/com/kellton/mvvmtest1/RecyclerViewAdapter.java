package com.kellton.mvvmtest1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private Context mContext;
    private ArrayList<String> mImageName = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mImageName, ArrayList<String> mImages) {
        this.mContext = mContext;
        this.mImageName = mImageName;
        this.mImages = mImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
       ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder()");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.imageView);
        holder.tvCountryName.setText(mImageName.get(position));


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick()::");
                Toast.makeText(mContext, mImageName.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, Gallery.class);
                intent.putExtra("image_name", mImageName.get(position));
                intent.putExtra("image_url", mImages.get(position));
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout parentLayout;
        CircleImageView imageView;
        TextView tvCountryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            imageView = itemView.findViewById(R.id.image);
            tvCountryName = itemView.findViewById(R.id.tv_country_name);
        }
    }
}
