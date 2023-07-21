package com.solvd.qa.carina.demo;

import java.lang.invoke.MethodHandles;

import com.solvd.qa.carina.demo.api.PutReqresMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.solvd.qa.carina.demo.api.DeleteReqresMethod;
import com.solvd.qa.carina.demo.api.GetReqresMethods;
import com.solvd.qa.carina.demo.api.PostReqresMethod;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;

/**
 * This sample shows how create REST API tests.
 *
 * @author qpsdemo
 */
public class APISampleTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "Vladimir")
    public void testUserRegistration() throws Exception {
        LOGGER.info("test");
        PostReqresMethod api = new PostReqresMethod();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    public void testGetListOfUsers() {
        GetReqresMethods api = new GetReqresMethods();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/reqres/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteReqresMethod api = new DeleteReqresMethod();
        api.callAPI();
        Assert.assertEquals(api.getResponse(),null,"User info was't deleted");
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    public void testShowUpdatedUser()  {
        PutReqresMethod api = new PutReqresMethod();
        api.callAPI();
        System.out.println("name:"+(api.getRequest()).contentType("name"));

    }



}
