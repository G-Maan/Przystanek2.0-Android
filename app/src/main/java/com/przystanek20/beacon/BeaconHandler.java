package com.przystanek20.beacon;

import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.Region;
import com.przystanek20.rest.beacon.BeaconNotificationsService;
import com.przystanek20.rest.beacon.BeaconService;
import com.przystanek20.rest.common.model.Beacon;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adam on 2017-06-09.
 */
public class BeaconHandler {

    private final BeaconNotificationsService beaconNotificationsService = new BeaconNotificationsService();
    private final BeaconService beaconService = new BeaconService();

    private BeaconManager beaconManager;

    public BeaconHandler(BeaconManager beaconManager) {
        this.beaconManager = beaconManager;
    }

    public void connect() {

        final List<Beacon> beacons = beaconService.getBeacons().getBeacons();

        beaconManager.connect(new BeaconManager.ServiceReadyCallback(){

            @Override
            public void onServiceReady() {
                for(Beacon beacon : beacons) {
                    beaconManager.startMonitoring(new Region(beacon.getIdentifier(),
                            UUID.fromString(beacon.getIdentifier()), beacon.getMajor(), beacon.getMinor()));
                }
            }
        });
    }

    public void monitor() {
        beaconManager.setMonitoringListener(new BeaconManager.MonitoringListener() {

            @Override
            public void onEnteredRegion(Region region, List<com.estimote.sdk.Beacon> list) {

            }

            @Override
            public void onExitedRegion(Region region) {}
        });
    }
}
