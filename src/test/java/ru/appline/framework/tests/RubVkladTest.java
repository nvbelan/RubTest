package ru.appline.framework.tests;

import org.junit.Test;
import ru.appline.framework.baseTestsClass.BaseTests;


public class RubVkladTest extends BaseTests {
    @Test
    public void startTest() {
        app.getStartPage()
                .selectMenuVklad()
                .checkT()
                .setValute()
                .setVkladSumm()
                .setSrok()
                .setTicks()
                .checkfills();
    }

}
