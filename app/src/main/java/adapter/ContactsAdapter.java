package adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter {

    public class ContactsViewHolder extends RecyclerView.ViewHolder{


        TextView tvContactname, tvPhoneNo;
        CircleImageView imgProfile;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);


            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvContactname = itemView.findViewById(R.id.tvContactname);
            tvPhoneNo = itemView.findViewById(R.id.tvPhoneNo);


        }
    }

}
