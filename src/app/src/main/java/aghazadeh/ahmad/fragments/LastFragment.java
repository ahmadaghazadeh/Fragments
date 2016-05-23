package aghazadeh.ahmad.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class LastFragment extends Fragment {
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.

    @BindView(R.id.textView1)    TextView someTextView1;
    @BindView(R.id.textView2)    TextView someTextView2;
    @BindView(R.id.textView3)    TextView someTextView3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment


        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_detail, parent, false);

        ButterKnife.bind(this, rootView);

        return rootView;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }




    public void setText(String text)
    {
        someTextView1.setText(text+"1");
        someTextView2.setText(text+"2");
        someTextView3.setText(text+"3");
    }


}