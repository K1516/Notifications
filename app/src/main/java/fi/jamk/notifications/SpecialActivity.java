package fi.jamk.notifications;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Risto on 17.9.2017.
 */

public class SpecialActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
    }

    public void backButtonClicked(View view) {
        finish();
    }

}