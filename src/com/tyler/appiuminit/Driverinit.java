package com.tyler.appiuminit;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driverinit {
	
	public static DesiredCapabilities getComm(String uuid) {
		File app = new File("/Users/chenjiafeng/Downloads/wolaidai.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hauwei");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		caps.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
		caps.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
		caps.setCapability(AndroidMobileCapabilityType.NO_SIGN, true);
		caps.setCapability(MobileCapabilityType.UDID, uuid);
		return caps;

	}
	public static void main(String[] args) {
		
	}

}
