package adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{


    Context mContext;
    List<Contacts> contactslist;

    public ContactsAdapter(Context mContext, List<Contacts> contactslist)
    {
        this.mContext = mContext;
        this.contactslist = contactslist;
    }


    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.contact,viewGroup, false);


        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {


        Contacts contacts = contactslist.get(i);
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageID());
        contactsViewHolder.tvContactname.setText(contacts.getName());
        contactsViewHolder.tvPhoneNo.setText(contacts.getPhoneno());

    }

    @Override
    public int getItemCount() {
        return contactslist.size();
    }

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
