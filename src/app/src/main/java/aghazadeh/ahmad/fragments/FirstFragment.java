package aghazadeh.ahmad.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstFragment extends Fragment {
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_list, parent, false);
        ButterKnife.bind(this, view);
       return view;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


    }

    @OnClick({ R.id.btn_last})
    public void middle() {
        listener.lastClick("btn_middle click");
    }

    @OnClick({ R.id.btn_middle})
    public void last() {
        listener.middleClick("btn_last click");

    }

    @OnClick({ R.id.btn_last_hide})
    public void lastHide() {
        listener.hideLast();

    }

    @OnClick({ R.id.btn_middle_hide})
    public void middleHide() {
        listener.hideMiddle();

    }

    @OnClick({ R.id.btn_middle_show})
    public void lastShow() {
        listener.showLast();

    }


    @OnClick({ R.id.btn_middle_show})
    public void middleShow() {
        listener.showMiddle();

    }

    @OnClick({ R.id.btn_last_remove})
    public void lastRemove() {
        listener.removeLast();

    }


    @OnClick({ R.id.btn_middle_remove})
    public void middleRemove() {
        listener.removeMiddle();

    }



    private OnItemSelectedListener listener;

    // Define the events that the fragment will use to communicate
    public interface OnItemSelectedListener {
        // This can be any number of events to be sent to the activity
        void middleClick(String text);
        void lastClick(String text);
        void hideMiddle();
        void hideLast();
        void showMiddle();
        void showLast();
        void removeMiddle();
        void removeLast();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement MyListFragment.OnItemSelectedListener");
        }
    }


}