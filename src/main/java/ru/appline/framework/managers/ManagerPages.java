package ru.appline.framework.managers;

import ru.appline.framework.pages.*;


public class ManagerPages {


    private static ManagerPages managerPages;


    StartPage startPage;


    VkladPage vkladPage;

    private ManagerPages() {
    }

    public static ManagerPages getManagerPages() {
        if (managerPages == null) {
            managerPages = new ManagerPages();
        }
        return managerPages;
    }


    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }


    public VkladPage getVkladPage() {
        if (vkladPage == null) {
            vkladPage = new VkladPage();
        }
        return vkladPage;
    }



}




