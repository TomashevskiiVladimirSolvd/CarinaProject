package com.solvd.qa.carina.demo;

import java.lang.invoke.MethodHandles;
import com.solvd.qa.carina.demo.api.*;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.jayway.jsonpath.JsonPath;
import org.testng.Assert;



public class APIReqresTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestListOfUsers() {
        GetUsers api = new GetUsers();
        LOGGER.info("List of Users is created.");
        Response response =api.callAPIExpectSuccess();
        int actualPageNumber = response.jsonPath().getInt("page");
        int expectedPageNumber = 1;
        Assert.assertEquals(actualPageNumber,expectedPageNumber,"Page number is not valid");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rs.schema");

    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSingleUser() {
        GetUser api = new GetUser();
        LOGGER.info("Single User is created.");
        Response response =api.callAPIExpectSuccess();
        String actualEmail = response.jsonPath().getString("data.email");
        String expectedEmail = "janet.weaver@reqres.in";
        Assert.assertEquals(actualEmail,expectedEmail,"Email is not valid");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rssingle.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestListOfResources() {
        GetResources api = new GetResources();
        LOGGER.info("List of Resources is created.");
        Response response =api.callAPIExpectSuccess();
        int actualTotal = response.jsonPath().getInt("total");
        int expectedTotal =12;
        Assert.assertEquals(actualTotal,expectedTotal,"Total is not valid.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rsresources.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSingleResource() {
        GetResource api = new GetResource();
        Response response =api.callAPIExpectSuccess();
        String actualColor = response.jsonPath().getString("data.color");
        String expectedColor = "#C74375";
        Assert.assertEquals(actualColor,expectedColor,"Color is not valid");
        LOGGER.info("Single Resource is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rsresource.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSDelayed() {
        GetDelayed api = new GetDelayed();
        Response response =api.callAPIExpectSuccess();
        int actualTotalPages = response.jsonPath().getInt("total_pages");
        int expectedTotalPages=2;
        Assert.assertEquals(actualTotalPages,expectedTotalPages,"total_pages is not valid");
        LOGGER.info("Delayed is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rsdelay.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestRegistration()  {
        PostRegister api = new PostRegister();
        api.callAPIExpectSuccess();
        LOGGER.info("Registration is completed.");
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestUnsuccessfulLog(){
        PostLoginUnsuccessful api = new PostLoginUnsuccessful();
        api.callAPIExpectSuccess();
        LOGGER.info("The password is missed");
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestUserNotFound() {
        GetUserNotFound api = new GetUserNotFound();
        api.callAPIExpectSuccess();
        LOGGER.info("User not found.");
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestResourseNotFound() {
        GetResourceNotFound api = new GetResourceNotFound();
        api.callAPIExpectSuccess();
        LOGGER.info("Resource not found.");
        api.validateResponse();
    }


    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testUnsuccessfulRegister(){
        PostRegisterUnsuccessful api = new PostRegisterUnsuccessful();
        api.callAPIExpectSuccess();
        LOGGER.info("Password is missed");
        api.validateResponse();
    }


    @DataProvider(name = "DP1")
    public Object[][] dataprovider() {
        return new Object[][]{
                { 1},
                { 2},
                { 3}
        };
    }
}
