package com.example.user.qcoftermalconductvity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    public static ArrayList<CountModel> countModelArrayList;

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_measure, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        //        holder.tvNo.setText();
        holder.tvNo.setText(countModelArrayList.get(position).getNo());
        holder.tvTime.setText(countModelArrayList.get(position).getTime());
        holder.etSuhu.setHint("masukkan data ke-" + countModelArrayList.get(position).getNo());
    }

    @Override
    public int getItemCount() {
        //TODO : sampai sini
        return countModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvNo;
        private final TextView tvTime;
        private final EditText etSuhu;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvNo = itemView.findViewById(R.id.noItem);
            tvTime = itemView.findViewById(R.id.timeItem);
            etSuhu = itemView.findViewById(R.id.inputSuhu);
        }
    }
}
