package pens.lab.app.belajaractivity.modul.profile;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ProfileContract {

    interface View extends BaseView<Presenter> {
        //void redirectToProfile();
        void showUser(String email, String password);
    }

    interface Presenter extends BasePresenter {
        //void performLogin(String email, String password);
    }
}
