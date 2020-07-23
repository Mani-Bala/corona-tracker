package com.dream.corona.service;

import java.io.IOException;

import org.json.JSONObject;

public interface CoronaTrackerService {

  JSONObject doGetCoronaStatusForSpecificCountryCountryCode(String countryCode) throws IOException;
}
