package com.namely.hcm.api;

import com.jayway.restassured.path.json.JsonPath;
import com.namely.TestBase;
import com.namely.api.Factory;
import com.namely.hibernate.annotations.Entity;
import com.namely.hibernate.db.utils.DataProviderUtils;
import com.namely.hibernate.model.apikeys.ApiKeys;
import org.testng.annotations.Test;
import java.util.ArrayList;

import static com.namely.hibernate.db.utils.DataProviderUtils.GENERIC_DP;
import static com.namely.hibernate.enums.Schema.AUTOMATION;
import static com.namely.routings.hcm.Profilesroutings.GET_PROFILES;

/**
 * Created by anjalhussan on 11/16/16.
 */
public class Profiles extends TestBase {

    @Entity(entity = ApiKeys.class, schema = AUTOMATION, ids = 1)
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
    public void getProfiles(final ApiKeys apiKeys) {
        JsonPath adapter = Factory.GET.method
                .execute(apiKeys.getEnvironment(), GET_PROFILES.getRoute(),
                        apiKeys.getApikey());
        System.out.println(adapter.getString("profiles.full_name"));
        ArrayList allstartDate = adapter.getJsonObject("profiles.start_date");
        System.out.println(allstartDate);

    }

    @Entity(entity = ApiKeys.class, schema = AUTOMATION, ids = 1)
    @Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
    public void getShowProfiles(final ApiKeys apiKeys) {
        JsonPath adapter = Factory.GET.method
                .execute(apiKeys.getEnvironment(), GET_PROFILES.getRoute(),
                        apiKeys.getApikey());
        ArrayList allids = adapter.getJsonObject("profiles.id");
        System.out.println(allids);

    }
}
