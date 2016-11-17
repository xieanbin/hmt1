package com.example.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Wfrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private WfragListener mListener;

    public Wfrag() {
        // Required empty public constructor
    }

    public static Wfrag newInstance(String param1, String param2) {
        Wfrag fragment = new Wfrag();
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
            Log.e("1",mParam1);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wfrag, container, false);

        btn3= (Button)view.findViewById(R.id.showsex);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("2","showsex");
                if(mListener!=null){
               mListener.onInteraction("jj");}
                else{
                    Log.e("5","mListerner is null");
                }

            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String s) {
        if (mListener != null) {
            mListener.onInteraction(s);
        }
    }



    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);

            mListener = (WfragListener) context;
            Log.e("1",mListener.toString());

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface WfragListener {
        // TODO: Update argument type and name
       void onInteraction(String s);
    }

public void showname(String name){
    Log.e("2",name);
}

    public void setBundle(Bundle bun){
        String s = bun.getString("1");
        Log.e("2",s);
    }
Button btn2;
    Button btn3;
    Bundle bun = new Bundle();;
    @Override
    public void onResume() {
        super.onResume();

        btn2 = (Button)getActivity().findViewById(R.id.showname);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bun.putString("2","lalalalalal");
            // mListener.onInteraction(bun);
            }
        });
    }
}
