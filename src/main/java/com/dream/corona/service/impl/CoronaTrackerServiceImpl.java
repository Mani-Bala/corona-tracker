package com.dream.corona.service.impl;

import com.dream.corona.caller.RestCallerConnect;
import com.dream.corona.service.CoronaTrackerService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CoronaTrackerServiceImpl implements CoronaTrackerService {

  @Override
  public JSONObject doGetCoronaStatusForSpecificCountryCountryCode(String countryCode)
      throws IOException {
    JSONObject jsonObject =
        RestCallerConnect.get("https://corona-api.com/countries/" + countryCode);
    return jsonObject;
  }
}
