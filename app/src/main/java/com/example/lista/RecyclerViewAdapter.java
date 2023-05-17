package com.example.lista;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Food> mData;

    public RecyclerViewAdapter(Context mContext, List<Food> mData){
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_food,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.labelTitle.setText(mData.get(i).getFoodTitle());
        myHolder.imageOfFood.setImageResource(mData.get(i).getImage());
        myHolder.cardViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,FoodActivity.class);

                intent.putExtra("FoodTitle",mData.get(i).getFoodTitle());
                intent.putExtra("FoodDescription",mData.get(i).getFoodDescription());
                intent.putExtra("Description",mData.get(i).getDescription());
                intent.putExtra("ImagesOfFood",mData.get(i).getImage());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView labelTitle;
        CardView cardViewId;
        ImageView imageOfFood;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            labelTitle = (TextView)itemView.findViewById(R.id.labelTitle);
            imageOfFood= (ImageView)itemView.findViewById(R.id.imageOfFood);
            cardViewId= (CardView)itemView.findViewById(R.id.cardviewId);


        }
    }
}

