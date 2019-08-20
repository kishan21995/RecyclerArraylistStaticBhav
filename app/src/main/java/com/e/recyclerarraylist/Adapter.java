package com.e.recyclerarraylist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ModelClass> modelClassList;
    private Context context;


    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_item, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    public Adapter(Context context) {
        this.context = context;

    }


    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder myViewHolder, int i) {
        ModelClass modelClass = modelClassList.get(i);
        myViewHolder.textView1.setText(modelClass.name);
        myViewHolder.textView2.setText(modelClass.address);
        myViewHolder.textView3.setText(modelClass.email);

    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView1,textView2,textView3;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textview1);
            textView2 = itemView.findViewById(R.id.textview2);
            textView3= itemView.findViewById(R.id.textview3);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
