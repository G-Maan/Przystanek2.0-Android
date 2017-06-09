package com.przystanek20.rest.preferences.model;

import com.przystanek20.rest.common.model.Category;
import com.przystanek20.rest.common.model.District;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adam on 2017-06-09.
 */
public class BeaconPreferences {

    private Map<District, List<Category>> beaconPreferences = new HashMap<>();

    public Map<District, List<Category>> getBeaconPreferences() {
        return beaconPreferences;
    }

    public void setBeaconPreferences(Map<District, List<Category>> beaconPreferences) {
        this.beaconPreferences = beaconPreferences;
    }
}
