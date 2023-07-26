package com.solvd.qa.carina.demo.api;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
    @DataProvider(name = "badIds")
    public static Object[][] badIds() {
        return new Object[][]{
                {"999"}, {"1000"}, {"1001"}
        };
    }
}
