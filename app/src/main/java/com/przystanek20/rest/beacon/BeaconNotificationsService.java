package com.przystanek20.rest.beacon;

import com.przystanek20.rest.RestApi;
import com.przystanek20.rest.beacon.model.BeaconNotification;


/**
 * Created by Adam on 2017-06-09.
 */
public class BeaconNotificationsService extends RestApi {

    private final Class CLAZZ = BeaconNotification.class;
    private final String GET_ENDPOINT = "/beacon/{}/device/{}";

    public BeaconNotification getBeaconNotifications(String beaconId, String deviceId) {
        String endpoint = this.generateEndpointUrl(GET_ENDPOINT, new String[]{beaconId, deviceId});
        return (BeaconNotification) this.get(endpoint.replaceAll("device_id", deviceId), CLAZZ);
    }
}
