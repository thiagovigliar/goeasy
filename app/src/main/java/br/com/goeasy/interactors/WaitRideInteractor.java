package br.com.goeasy.interactors;

import android.app.Activity;

import org.androidannotations.annotations.EBean;

import br.com.goeasy.views.MainFragment;

/**
 * Created by biliboss on 28/02/2015.
 */
@EBean
public class WaitRideInteractor {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void cancelRide() {
        MainFragment.show(activity);
    }
}
