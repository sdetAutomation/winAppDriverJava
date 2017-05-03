package com.sdet.auto.AUTLayer;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GuiHelper {

    public static IOSDriver driver;
    private static final String winDriverUri = "http://127.0.0.1:4723";
    private static final String notepadPath = "C:\\Windows\\System32\\notepad.exe";

    public static void launchNotepadApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", notepadPath);
        driver = new IOSDriver(new URL(winDriverUri), capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public static void closeNotepadApp(){
        driver.close();
    }
}
