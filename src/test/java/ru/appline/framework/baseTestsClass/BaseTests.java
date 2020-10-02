package ru.appline.framework.baseTestsClass;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.ManagerPages;


public class BaseTests {

    protected ManagerPages app = ManagerPages.getManagerPages();

    @BeforeClass
    public static void beforeEach() {
        InitManager.initFramework();
    }
    @AfterClass
    public static void afterEach() { InitManager.quitFramework();}
}
