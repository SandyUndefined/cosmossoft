package com.sandy.cosmossoft.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.app.ActivityCompat;

public class LocationUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Location finalLoc = null;
    public static Location gpsLocation = null;
    public static Location networkLoacation = null;

    public static Location getLocationWithCheckNetworkAndGPS(Context mContext) {
        LocationManager lm = (LocationManager) mContext.getSystemService("location");
        if (lm != null) {
            boolean isGpsEnabled = lm.isProviderEnabled("gps");
            boolean isNetworkLocationEnabled = lm.isProviderEnabled("network");
            if (isGpsEnabled && ActivityCompat.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            gpsLocation = lm.getLastKnownLocation("gps");
            if (isNetworkLocationEnabled) {
                networkLoacation = lm.getLastKnownLocation("network");
            }
            Location location = gpsLocation;
            if (location == null || networkLoacation == null) {
                if (location != null) {
                    finalLoc = location;
                    return location;
                }
                Location location2 = networkLoacation;
                if (location2 == null) {
                    return finalLoc;
                }
                finalLoc = location2;
                return location2;
            } else if (location.getAccuracy() > networkLoacation.getAccuracy()) {
                Location location3 = networkLoacation;
                finalLoc = location3;
                return location3;
            } else {
                Location location4 = gpsLocation;
                finalLoc = location4;
                return location4;
            }
        } else {
            throw new AssertionError();
        }
    }
}
