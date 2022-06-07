package com.abdallah.myfirebaseaa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Users> mlist = new ArrayList<>();
    private Context context;
    public Adapter(Context context, ArrayList<Users> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Users users = mlist.get(position);
        holder.tv_f_name.setText(users.getFirstName());
        holder.tv_l_name.setText(users.getLastName());
        holder.tv_user .setText(users.getUserName());
        holder.tv_age.setText(users.getAge());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public void setAllMsgTypes(ArrayList<Users> mlist) {
        this.mlist = mlist;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_f_name,tv_l_name,tv_user,tv_age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_f_name = itemView.findViewById(R.id.f_name);
            tv_l_name = itemView.findViewById(R.id.l_name);
            tv_user = itemView.findViewById(R.id.tv_user);
            tv_age = itemView.findViewById(R.id.tv_age);
        }


    }
}
