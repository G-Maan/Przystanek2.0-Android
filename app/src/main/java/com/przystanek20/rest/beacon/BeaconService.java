package com.przystanek20.rest.beacon;


import com.przystanek20.rest.RestApi;
import com.przystanek20.rest.common.model.Beacon;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adam on 2017-06-10.
 */
public class BeaconService extends RestApi {

    private final Class CLAZZ = Beacon[].class;
    private final String GET_ENDPOINT = "/beacons";

    public List<Beacon> getBeacons() {
        return Arrays.asList((Beacon[]) get(GET_ENDPOINT, CLAZZ));
    }
}
