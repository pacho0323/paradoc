package com.bancolombia.certificacion.paradoc.drivers;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class OwnRemoteWindowsDriver {

	
private static WindowsDriver<WindowsElement> driver;
	
	public static OwnRemoteWindowsDriver hisBrowser() {
		try {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			//capabilities.setCapability("app", "C:\\Windows\\System32\\calc.exe");
			capabilities.setCapability("app","C:\\Users\\1550768\\eclipse-workspace\\ParadocCertificadosTributarios\\insumos");
			//capabilities.setCapability("app", "\\\\10.8.69.8\\e$\\PARADOC_IN_TARJETAS");

			driver= new WindowsDriver<WindowsElement>(new URL("http://localhost:4723/"), capabilities);
		} catch (Exception e) {

		}
		return new OwnRemoteWindowsDriver();
	}
	
	public static WindowsDriver<WindowsElement> on() {
		return driver;
	}
}
