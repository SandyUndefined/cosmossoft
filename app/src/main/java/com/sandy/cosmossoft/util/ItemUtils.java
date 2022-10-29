package com.sandy.cosmossoft.util;

import java.util.Random;

public class ItemUtils {
    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase() + "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            salt.append(SALTCHARS.charAt((int) (rnd.nextFloat() * ((float) SALTCHARS.length()))));
        }
        return salt.toString();
    }
}
