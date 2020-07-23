package com.dream.corona.controller;

import com.dream.corona.service.CoronaTrackerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CoronaTrackerController {

  @Autowired
  private CoronaTrackerService coronaTrackerService;

  @GetMapping(value = "/dream/coronastatus/country/{countryCode}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getCoronaStatusForSpecificCountryCountryCode(
      @PathVariable String countryCode) throws IOException {
    JSONObject jsonObject =
        coronaTrackerService.doGetCoronaStatusForSpecificCountryCountryCode(countryCode);
    return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<Object> getText() {
    return new ResponseEntity<Object>("Hi krishna", HttpStatus.OK);
  }
}
