package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import pens.lab.app.belajaractivity.FirstActivity;
import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    Bundle bundle;
    EditText etEmail;
    EditText etPassword;
   // Button btnLogin;


    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.data_login, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        etEmail = fragmentView.findViewById(R.id.textView_email);
        etPassword = fragmentView.findViewById(R.id.textView_password);
        //btnLogin = fragmentView.findViewById(R.id.bt_login);
        //btnLogin.setOnClickListener(new View.OnClickListener() {
       //

        setTitle("Profile");

        String email = bundle.getString("email");
        String password = bundle.getString("password");


        showUser(email, password);

        return fragmentView;

    }


    public void showUser(String email, String password) {
        etEmail.setText(email);
        etPassword.setText(password);
    }

//    public void setBtLoginClick(){
//        String email = etEmail.getText().toString();
//        String password = etPassword.getText().toString();
//        mPresenter.performLogin(email,password);
//    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

//    @Override
//    public void redirectToProfile() {
//            Intent intent = new Intent(activity, FirstActivity.class);
//            startActivity(intent);
//            activity.finish();
//    }


}
