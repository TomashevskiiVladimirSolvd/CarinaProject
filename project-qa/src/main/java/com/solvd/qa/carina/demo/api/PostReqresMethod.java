package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/register", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/reqres/_post/rq.json")
@ResponseTemplatePath(path = "api/reqres/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostReqresMethod extends AbstractApiMethodV2 {

    public PostReqresMethod() {
        super("api/reqres/_post/rq.json", "api/reqres/_post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
