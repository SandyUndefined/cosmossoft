package com.sandy.cosmossoft.util;

import android.text.format.Formatter;
import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class IPAddressUtil {
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
            return null;
        } catch (SocketException ex) {
            Log.e("ContentValues", ex.toString());
            return null;
        }
    }
}
