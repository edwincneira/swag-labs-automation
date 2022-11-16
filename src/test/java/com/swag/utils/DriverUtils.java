package com.swag.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverUtils {

    private static AndroidDriver<MobileElement> androidDriver;

    public static  AndroidDriver<MobileElement> getDriver() {
        return androidDriver;
    }

    public static void setDriver(AndroidDriver<MobileElement> androidDriver) {
        DriverUtils.androidDriver = androidDriver;
    }

}
