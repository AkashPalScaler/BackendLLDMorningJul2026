package com.scaler.DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {
//         String platform = env.get("platform_name")
        String platform = "ANDROID";
        Dashboard dashboard = new Dashboard(SimplePlatformFactory.getPlatform(platform));
        dashboard.renderSearchBox();
    }
}
