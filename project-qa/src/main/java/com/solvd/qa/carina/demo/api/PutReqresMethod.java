package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/users/2", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/reqres/_put/rq.json")
@ResponseTemplatePath(path = "api/reqres/_put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)

public class PutReqresMethod extends AbstractApiMethodV2 {
    public PutReqresMethod(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
