package com.solvd.qa.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/users/1", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/users/reqres/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.NO_CONTENT_204)
public class DeleteReqresMethod extends AbstractApiMethodV2 {

    public DeleteReqresMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}