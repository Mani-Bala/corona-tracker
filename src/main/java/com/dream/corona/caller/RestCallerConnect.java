package com.dream.corona.caller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class RestCallerConnect {

  public static JSONObject get(String url) throws IOException {
    URL urlForGetRequest = new URL(url);
    String readLine = null;
    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
    conection.setRequestMethod("GET");
    // conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
    StringBuilder response = new StringBuilder();
    int responseCode = conection.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK) {
      BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
      while ((readLine = in.readLine()) != null) {
        response.append(readLine);
      }
      in.close();
      // print result
      System.out.println("JSON String Result " + response.toString());
      // GetAndPost.POSTRequest(response.toString());
    } else {
      System.out.println("GET NOT WORKED");
    }
    org.json.JSONObject jsonObject = new JSONObject(response.toString());
    return jsonObject;
  }
}
