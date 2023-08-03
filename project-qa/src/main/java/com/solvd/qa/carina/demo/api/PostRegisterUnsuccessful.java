package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/${api_register}", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/reqres/_post/rqcreate.json")
@ResponseTemplatePath(path = "api/reqres/_post/rscreate.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.BAD_REQUEST_400)

public class PostRegisterUnsuccessful extends AbstractApiMethodV2 {
    public PostRegisterUnsuccessful() {
        super("api/reqres/_post/rqcreate.json", "api/reqres/_post/rscreate.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("api_register", Configuration.getRequired("api_register"));
    }
}
