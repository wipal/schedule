package com.at.schedule.com.at.schedule.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.at.schedule.R;

public class ItemMatchAdapter extends RecyclerView.Adapter<ItemMatchAdapter.ViewHolder> {

    private String[] listData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tv_team_1, tv_team_2, tv_time;
        public ImageButton btn_notification;

        public ViewHolder(View v) {
            super(v);

            tv_team_1 = v.findViewById(R.id.item_match_team_1);
            tv_team_2 = v.findViewById(R.id.item_match_team_2);
            tv_time = v.findViewById(R.id.item_match_time);
            btn_notification = v.findViewById(R.id.item_match_notificaton);
        }
    }

    public ItemMatchAdapter(String[] listData) {
        this.listData = listData;
    }

    @Override
    public ItemMatchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,  int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_match, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tv_team_1.setText("MU");
        holder.tv_team_2.setText("MC");
        holder.tv_time.setText("21h45");

    }


    @Override
    public int getItemCount() {
        return listData.length;
    }
}
