package com.sdet.auto;

import com.sdet.auto.AUTLayer.GuiHelper;
import com.sdet.auto.AUTLayer.NotepadMain;
import org.junit.Test;

import java.net.MalformedURLException;

public class WinAppDriverTest extends TestBaseClass{

    @Test
    public void TC0001_SmokeTest() throws MalformedURLException {
        GuiHelper.launchNotepadApp();
        NotepadMain.verifyDefaultState(testAssert);
        GuiHelper.closeNotepadApp();
    }
}
