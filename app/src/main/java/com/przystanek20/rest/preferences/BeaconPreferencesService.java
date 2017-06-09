package com.przystanek20.rest.preferences;

import android.util.Log;

import com.przystanek20.rest.RestApi;
import com.przystanek20.rest.preferences.model.BeaconPreferences;

/**
 * Created by Adam on 2017-06-09.
 */
public class BeaconPreferencesService extends RestApi {

    private final Class CLAZZ = BeaconPreferences.class;
    private final String POST_ENDPOINT = "/beacon/preferences/";

    public void postBeaconPreferences(String deviceId, BeaconPreferences beaconPreferences) {
        String response = this.post(POST_ENDPOINT + deviceId, CLAZZ, beaconPreferences);
        Log.i(getClass().toString(), "Response " + response);
    }
}
