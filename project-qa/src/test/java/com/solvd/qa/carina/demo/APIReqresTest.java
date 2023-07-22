package com.solvd.qa.carina.demo;

import java.lang.invoke.MethodHandles;

import com.solvd.qa.carina.demo.api.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;


public class APIReqresTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestListOfUsers() {
        GetUsers api = new GetUsers();
        api.callAPIExpectSuccess();
        LOGGER.info("List of Users is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSingleUser() {
        GetUser api = new GetUser();
        api.callAPIExpectSuccess();
        LOGGER.info("Single User is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rssingle.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestListOfResources() {
        GetResources api = new GetResources();
        api.callAPIExpectSuccess();
        LOGGER.info("List of Resources is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rsresources.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSingleResource() {
        GetResource api = new GetResource();
        api.callAPIExpectSuccess();
        LOGGER.info("Single Resource is created.");
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rsresource.schema");
    }

    @Test()
    @MethodOwner(owner = "vtomashevskii")
    public void testRequestSDelayed() {
        GetDelayed api = new GetDelayed();
        api.callAPIExpectSuccess();
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
