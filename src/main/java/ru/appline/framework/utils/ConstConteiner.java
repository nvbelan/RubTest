package ru.appline.framework.utils;

import java.util.HashMap;


public class ConstConteiner {

    private static boolean capitalEveryMonthTick = true;
    private static String menuVklad = "Вклады";
    private static String checkableText = "Рассчитайте доходность по вкладу";
    private static String valuta = "Рубли";
    private static String vkladSumm = "300000";
    private static String srok = "6 месяцев";
    private static String fillEveryMonth = "50000";
    private static String replenish = "250 000";
    private static String accryedProcent = "8 490,49";
    private static String result = "558 490,49";
    private static boolean upTick = true;

    public static boolean isUpTick() {
        return upTick;
    }

    public static String getResult() {
        return result;
    }

    public static String getReplenish() {
        return replenish;
    }

    public static String getAccryedProcent() {
        return accryedProcent;
    }

    public static boolean isCapitalEveryMonthTick() {
        return capitalEveryMonthTick;
    }

    public static String getFillEveryMonth() {
        return fillEveryMonth;
    }

    public static String getSrok() {
        return srok;
    }

    public static String getVkladSumm() {
        return vkladSumm;
    }

    public static String getCheckableText() {
        return checkableText;
    }

    public static String getMenuVklad() {
        return menuVklad;
    }

    public static String getValuta() {
        return valuta;
    }


}
