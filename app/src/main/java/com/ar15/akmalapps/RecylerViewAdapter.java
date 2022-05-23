package com.ar15.akmalapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 16-05-2022
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>
{
    Context mContext;
    List<activity_page> mData;

    public RecyclerViewAdapter (Context mContext, List<activity_page> mData)
    {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.activity_page, parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {

        holder.tv_act_name.setText(mData.get(position).getname_21());
        holder.img.setImageResource(mData.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        private TextView tv_act_name;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tv_act_name = (TextView) itemView.findViewById(R.id.textview_activity_name);
            img = (ImageView) itemView.findViewById(R.id.layout_view_img);
        }
    }
}
