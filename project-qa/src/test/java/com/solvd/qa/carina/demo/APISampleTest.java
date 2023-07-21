package com.solvd.qa.carina.demo;

import java.lang.invoke.MethodHandles;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.solvd.qa.carina.demo.api.PutUserMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.solvd.qa.carina.demo.api.DeleteUserMethod;
import com.solvd.qa.carina.demo.api.GetUserMethods;
import com.solvd.qa.carina.demo.api.PostUserMethod;
import com.zebrunner.carina.api.APIMethodPoller;
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
        PostUserMethod api = new PostUserMethod();
        api.callAPIExpectSuccess();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    public void testGetListOfUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.callAPI();
        Assert.assertEquals(deleteUserMethod.getResponse(),null,"User info was't deleted");
    }

    @Test()
    @MethodOwner(owner = "Vladimir")
    public void testShowUpdatedUser()  {
        PutUserMethod api = new PutUserMethod();
        api.callAPI();
        System.out.println("name:"+(api.getRequest()).contentType("name"));

    }



}
