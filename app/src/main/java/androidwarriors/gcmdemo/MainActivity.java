package androidwarriors.gcmdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements GCMRegisterListner{
    private static final String TAG = "MainActivity";
    String PROJECT_NUMBER="your project number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GCMClientManager pushClientManager = new GCMClientManager(MainActivity.this, PROJECT_NUMBER);
        pushClientManager.registerIfNeeded();
    }

    @Override
    public void onSuccess(String registrationId, boolean isNewRegistration) {
        Log.d("Registration id", registrationId);
        //send this registrationId to your server
    }

    @Override
    public void onFailure(String ex) {
        // If there is an error, don't just keep trying to register.
        // Require the user to click a button again, or perform
        // exponential back-off.
        Log.e(TAG, ex);
    }
}
