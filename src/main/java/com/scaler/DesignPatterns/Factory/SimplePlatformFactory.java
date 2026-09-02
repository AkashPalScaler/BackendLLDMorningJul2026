package com.scaler.DesignPatterns.Factory;

public class SimplePlatformFactory {
    public static Platform getPlatform(String platformName) {
        switch (platformName) {
            case "IOS":
                return new IOSPlatform();
            case  "ANDROID":
                return new AndroidPlatform();
        }
        return null;
    }
}
