package com.amira.thirdseccion.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amira.thirdseccion.R;
import com.amira.thirdseccion.pojo.cat;

import java.util.ArrayList;

public class catAdapter extends RecyclerView.Adapter<catAdapter.catViewHolder> {
   ArrayList<cat>cats;

    public catAdapter(ArrayList<cat> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public catViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_design,null,false );
        catViewHolder catViewHolder=new catViewHolder( v );
        return catViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull catViewHolder holder, int position) {
       cat c=cats.get( position );
       holder.tv_name.setText( c.getName() );
       holder.img.setImageResource( c.getImg() );
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    class catViewHolder extends RecyclerView.ViewHolder{
         TextView tv_name;
         ImageView img;

        public catViewHolder(@NonNull View itemView) {
            super( itemView );

            tv_name=itemView.findViewById( R.id.tv );
            img=itemView.findViewById( R.id.image );
        }
    }
}
