package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/${api_user}${api_delay}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/reqres/_get/rsdelay.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetDelayed extends AbstractApiMethodV2{
    public GetDelayed(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("api_user",Configuration.getRequired("api_user"));
        replaceUrlPlaceholder("api_delay",Configuration.getRequired("api_delay"));
    }
}
