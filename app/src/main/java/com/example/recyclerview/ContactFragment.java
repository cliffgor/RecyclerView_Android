package com.example.recyclerview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ContactFragment extends Fragment {

    View v ;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public ContactFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_contact,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Cliff Gor","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("Noma Gani","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("mihadarati","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("ndogi","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("John","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("wamlambez","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("Cliff Gor","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("Noma Gani","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("mihadarati","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("ndogi","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("John","(+254) 712345678", R.drawable.cliffgor_icon));
        lstContact.add(new Contact("wamlambez","(+254) 712345678", R.drawable.cliffgor_icon));

    }
}
