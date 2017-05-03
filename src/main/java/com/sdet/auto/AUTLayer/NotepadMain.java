package com.sdet.auto.AUTLayer;

import com.sdet.auto.TestHelper.IoLibrary;
import com.sdet.auto.TestHelper.LoggingLibrary;
import com.sdet.auto.TestHelper.TestAssert;
import org.openqa.selenium.interactions.Actions;

public class NotepadMain extends WinAppDriverBase {

    public static void verifyDefaultState(TestAssert testAssert){
        IoLibrary.writeLine("Verifying Application Default State, and Menu Items.");
        Actions action = new Actions(driver);
        String notePadTitle = driver.getTitle();
        testAssert.setPass(LoggingLibrary.CompareResult(notePadTitle, "Untitled - Notepad"));
        // verifying File Menu Items
        IoLibrary.writeLine("Verifying Following File Menu Displayed: New, Open, Save, Save As..., Page Setup..., Print, Exit.");
        driver.findElementByName("File").click();
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("New").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Open...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Save").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Save As...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Page Setup...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Print...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Exit").isDisplayed(), true));

        IoLibrary.writeLine("Verifying Following Edit Menu Displayed: Undo, Cut..., Copy, Paste, Delete, Find..., Find Next, Replace..., Go To..., Select All, Time/Date.");
        action.moveToElement(driver.findElementByName("Edit")).perform();
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Undo").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Cut").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Copy").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Paste").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Delete").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Find...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Find Next").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Replace...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Go To...").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Select All").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Time/Date").isDisplayed(), true));

        IoLibrary.writeLine("Verifying Following Format Menu Displayed: Word Wrap, Font...");
        action.moveToElement(driver.findElementByName("Format")).perform();
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Word Wrap").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Font...").isDisplayed(), true));

        IoLibrary.writeLine("Verifying Following View Menu Displayed: Status Bar");
        action.moveToElement(driver.findElementByName("View")).perform();
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("Status Bar").isDisplayed(), true));

        IoLibrary.writeLine("Verifying Following Help Menu Displayed: View Help, About Notepad");
        action.moveToElement(driver.findElementByName("Help")).perform();
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("View Help").isDisplayed(), true));
        testAssert.setPass(LoggingLibrary.CompareResult(driver.findElementByName("About Notepad").isDisplayed(), true));
    }
}
