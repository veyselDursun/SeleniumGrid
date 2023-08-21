package tests;

import manager.DriverManage;
import org.testng.annotations.Test;

public class Grid_03 {

    DriverManage driverManage = new DriverManage();

    @Test
    void test01(){
        driverManage.setUpChromeDriver().get("https://www.google.com");
    }
    @Test
    void test02(){
        driverManage.setUpFirefoxDriver().get("https://www.google.com");
    }
    @Test
    void test03(){
        driverManage.setUpEdgeDriver().get("https://www.google.com");
    }
    @Test
    void test04(){
        driverManage.setUpIEDriver().get("https://www.google.com");
    }
    @Test
    void test05(){
        driverManage.setUpChromeDriver().get("https://www.wisequarter.com");
    }
    @Test
    void test06(){
        driverManage.setUpFirefoxDriver().get("https://www.wisequarter.com");
    }
    @Test
    void test07(){
        driverManage.setUpEdgeDriver().get("https://www.wisequarter.com");
    }
    @Test
    void test08(){
        driverManage.setUpIEDriver().get("https://www.wisequarter.com");
    }
}