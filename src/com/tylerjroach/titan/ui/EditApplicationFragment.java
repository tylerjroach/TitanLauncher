package com.tylerjroach.titan.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tylerjroach.titan.R;


public class EditApplicationFragment extends DialogFragment {

  public EditApplicationFragment() {}

  public static EditApplicationFragment newInstance() {
    EditApplicationFragment fragment = new EditApplicationFragment();
    Bundle args = new Bundle();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_edit_application, container, false);
  }


  @Override public void onAttach(Context context) {
    super.onAttach(context);

  }

  @Override public void onDetach() {
    super.onDetach();

  }

}
