package com.sandy.cosmossoft.util;

import android.app.Activity;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

public class StartGettingLocation {
    public static void setAllTheLocations(final Activity activity) {
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(300);
        locationRequest.setPriority(100);
        if (ActivityCompat.checkSelfPermission(activity, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(activity, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationServices.getFusedLocationProviderClient(activity).requestLocationUpdates(locationRequest, new LocationCallback() {
                public void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    LocationServices.getFusedLocationProviderClient(activity).removeLocationUpdates((LocationCallback) this);
                    if (locationResult.getLocations().size() > 0) {
                        int latestLocationIndex = locationResult.getLocations().size() - 1;
                        UtilHolder.setLatitude(Double.valueOf(locationResult.getLocations().get(latestLocationIndex).getLatitude()));
                        UtilHolder.setLongitude(Double.valueOf(locationResult.getLocations().get(latestLocationIndex).getLongitude()));
                        return;
                    }
                    ViewUtils.showToast(activity, "Location issue found..");
                }
            }, Looper.getMainLooper());
        } else {
            ViewUtils.showToast(activity, "No Location Permission has given");
        }
    }
}
