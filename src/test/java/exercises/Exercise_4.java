package exercises;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exercise_4 extends BaseTests {

    @Test
    public void testClickOkButton(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickHotSpotBox();
        String popUpText = contextMenuPage.getPopUpText();
        contextMenuPage.clickOkButton();
        assertEquals(popUpText, "You selected a context menu", "Pop up text is incorrect");

    }
}
