package com.sandy.cosmossoft.util;

public class UtilHolder {
    static Double latitude = null;
    static Double longitude = null;

    public static String getLongitude() {
        Double d = longitude;
        if (d == null) {
            return "88.363895";
        }
        return String.valueOf(d);
    }

    public static void setLongitude(Double longitude2) {
        longitude = longitude2;
    }

    public static String getLatitude() {
        Double d = latitude;
        if (d == null) {
            return "22.572646";
        }
        return String.valueOf(d);
    }

    public static void setLatitude(Double latitude2) {
        latitude = latitude2;
    }
}
