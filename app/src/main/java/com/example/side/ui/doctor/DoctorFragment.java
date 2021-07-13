package com.example.side.ui.doctor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.side.R;

public class DoctorFragment extends Fragment {

    private DoctorViewModel DoctorViewModel;
    RecyclerView recyclerView;
    doctorAdapter adapter;



    String name[]={"Ali","Hisham","Nader","Celia","Salma","Israa","Merna","Asmaa","Alaa","Sara"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DoctorViewModel = new ViewModelProvider(this).get(DoctorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_doctor, container, false);

        recyclerView= (RecyclerView) root.findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new doctorAdapter(getActivity(),name);
        recyclerView.setAdapter(adapter);



        return root;
    }




}