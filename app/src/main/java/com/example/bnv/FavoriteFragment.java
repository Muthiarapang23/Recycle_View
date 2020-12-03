package com.example.bnv;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoriteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoriteFragment extends Fragment {

    View v;
    RecyclerView recyclerView;
        List<ModalClass> mList;
        CustomAdapter customAdapter;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FavoriteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavoriteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavoriteFragment newInstance(String param1, String param2) {
        FavoriteFragment fragment = new FavoriteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        mList= new ArrayList<>();
        mList.add(new ModalClass(R.drawable.blackpink,"Blackpink"));
        mList.add(new ModalClass(R.drawable.blackpink1,"Blackpink Ot4"));
        mList.add(new ModalClass(R.drawable.jisoo,"Kim Jisoo"));
        mList.add(new ModalClass(R.drawable.jisoo1,"Jichu"));
        mList.add(new ModalClass(R.drawable.jennie,"Kim Jennie"));
        mList.add(new ModalClass(R.drawable.jennie1,"Jendeuki"));
        mList.add(new ModalClass(R.drawable.rose,"Park Chaeyong"));
        mList.add(new ModalClass(R.drawable.rose1,"Roje"));
        mList.add(new ModalClass(R.drawable.lisa,"Lalisa Manoban"));
        mList.add(new ModalClass(R.drawable.lisa1,"Lily"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_favorite, container, false);

        recyclerView=v.findViewById(R.id.favoritesaya);

        customAdapter=new CustomAdapter(mList,getContext());
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

   return v;
    }


}