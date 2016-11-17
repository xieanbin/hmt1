package com.example.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Bfrag extends Fragment {



    private BListener mListener;

    public Bfrag() {
        // Required empty public constructor
    }

    public static Bfrag newInstance(String param1, String param2) {
        Bfrag fragment = new Bfrag();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_bfrag, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bun) {
        if (mListener != null) {
            mListener.onFragmentInteraction(bun);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BListener) {
            mListener = (BListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface BListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Bundle bun);
    }
    public void showname(String s){
        Log.e("1",s);
    }
    public void setBundle(Bundle bun){
       String s = bun.getString("1");
Log.e("1",s);
    }
    public void showthis(){
        ((MainActivity) getActivity()).shownames();
    }
}
