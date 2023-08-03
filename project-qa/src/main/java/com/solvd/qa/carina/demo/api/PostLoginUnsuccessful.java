package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/login", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/reqres/_post/rqlog.json")
@ResponseTemplatePath(path = "api/reqres/_post/rslog.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.BAD_REQUEST_400)

public class PostLoginUnsuccessful extends AbstractApiMethodV2 {
    public PostLoginUnsuccessful() {
        super("api/reqres/_post/rqlog.json", "api/reqres/_post/rslog.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
