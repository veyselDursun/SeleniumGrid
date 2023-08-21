package tests;

import org.testng.annotations.*;

import static manager.DriverManage.*;

public class Grid_02 {

    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser") String browser){
        setDriver("grid_firefox");
    }

    @Test
    void test01(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @AfterTest
    void afterTest(){
        closeDriver();
    }


    // seleniumGridTeam116\src\test\resources altinda olusturulan drivers kasorunun icine browserlari
    // ve selenium server jar dosyalarini attik.
    // Idemizin terminalinden java -jar selenium-server-4.11.0.jar standalone komutu ile hub ve node olusturduk.
    // Bu sazede tum grid bilesenleri bir proje altinda toplanmis oldu.

}