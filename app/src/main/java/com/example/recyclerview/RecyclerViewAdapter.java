package com.example.recyclerview;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context mContext;
    List<Contact> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v ;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact, parent, false );
        final MyViewHolder vHolder = new MyViewHolder(v);



        //Dialog ini

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_contact);





        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView dialog_name_tv = (TextView) myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv = (TextView) myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_image = (ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                dialog_contact_image.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                Toast.makeText(mContext, "Test Click"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            item_contact = (LinearLayout) itemView.findViewById(R.id.contact_item_id);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_phone = (TextView) itemView.findViewById(R.id.phone_contact);
            img = (ImageView) itemView.findViewById(R.id.image_contact);

        }
    }


}
