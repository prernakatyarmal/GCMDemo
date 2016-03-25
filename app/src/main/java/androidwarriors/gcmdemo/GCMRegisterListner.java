package androidwarriors.gcmdemo;

import android.util.Log;

/**
 * Created by prerana_katyarmal on 3/25/2016.
 */
public interface GCMRegisterListner {
    void onSuccess(String registrationId, boolean isNewRegistration);
    void onFailure(String ex);
}
