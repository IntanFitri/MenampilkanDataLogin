package pens.lab.app.belajaractivity.modul.profile;

import android.os.Bundle;
import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;
import pens.lab.app.belajaractivity.modul.login.LoginFragment;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profile;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profile = new ProfileFragment();
        profile.bundle = getIntent().getExtras();
        setCurrentFragment(profile, false);

//        loginFragment.bundle = getIntent().getExtras();
//
    }



}
