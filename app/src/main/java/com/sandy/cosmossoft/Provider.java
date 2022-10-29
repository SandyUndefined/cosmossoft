package com.sandy.cosmossoft;

import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Provider {
    public static String getLocalIpAddress() {
        try {
            Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
            while (en.hasMoreElements()) {
                Enumeration<InetAddress> enumIpAddr = en.nextElement().getInetAddresses();
                while (true) {
                    if (enumIpAddr.hasMoreElements()) {
                        InetAddress inetAddress = enumIpAddr.nextElement();
                        if (!inetAddress.isLoopbackAddress()) {
                            String ip = Formatter.formatIpAddress(inetAddress.hashCode());
                            Log.i("ContentValues", "***** IP=" + ip);
                            return ip;
                        }
                    }
                }
            }
            return "Couldn't fetch from the device";
        } catch (SocketException ex) {
            Log.e("ContentValues", ex.toString());
            return "Couldn't fetch from the device";
        }
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }
}
