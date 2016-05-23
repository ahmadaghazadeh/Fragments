package aghazadeh.ahmad.fragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FirstFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.first_placeholder, new FirstFragment(),FirstFragment.class.toString());
        ft.commit();

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.last_placeholder, new LastFragment(),LastFragment.class.toString());
        ft.commit();

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.middle_placeholder, new MiddleFragment(),MiddleFragment.class.toString());
        ft.commit();

    }

    public Fragment getFragment(String fragment)
    {
        return  getSupportFragmentManager().findFragmentByTag(fragment);
    }

    @Override
    public void middleClick(String text) {
        MiddleFragment middleFragment= (MiddleFragment) getFragment(MiddleFragment.class.toString());
        if (middleFragment != null ) {
            middleFragment.setText(text);
        }

    }

    @Override
    public void lastClick(String text) {
        LastFragment lastFragment= (LastFragment) getFragment(LastFragment.class.toString());
        if (lastFragment != null  ) {
            lastFragment.setText(text);
        }


    }

    @Override
    public void hideMiddle() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MiddleFragment middleFragment= (MiddleFragment) getFragment(MiddleFragment.class.toString());
        if (middleFragment != null  ) {
            fragmentManager.beginTransaction()
                    .hide(middleFragment)
                    .commit();
        }
    }

    @Override
    public void hideLast() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        LastFragment lastFragment= (LastFragment) getFragment(LastFragment.class.toString());
        if (lastFragment != null ) {
            fragmentManager.beginTransaction()
                    .hide(lastFragment)
                    .commit();
        }

    }

    @Override
    public void showMiddle() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MiddleFragment middleFragment= (MiddleFragment) getFragment(MiddleFragment.class.toString());
        if (middleFragment != null  ) {
            fragmentManager.beginTransaction()
                    .show(middleFragment)
                    .commit();
        }
    }

    @Override
    public void showLast() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        LastFragment lastFragment= (LastFragment) getFragment(LastFragment.class.toString());
        if (lastFragment != null  ) {
            fragmentManager.beginTransaction()
                    .show(lastFragment)
                    .commit();
        }

    }

    @Override
    public void removeMiddle() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MiddleFragment middleFragment= (MiddleFragment) getFragment(MiddleFragment.class.toString());
        if (middleFragment != null  ) {
            fragmentManager.beginTransaction()
                    .remove(middleFragment)
                    .commit();
        }
    }

    @Override
    public void removeLast() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        LastFragment lastFragment= (LastFragment) getFragment(LastFragment.class.toString());
        if (lastFragment != null  ) {
            fragmentManager.beginTransaction()
                    .remove(lastFragment)
                    .commit();
        }
    }


}
