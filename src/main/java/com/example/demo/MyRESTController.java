package com.example.demo;

import org.json.JSONArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by edward on 2/1/2018.
 * This is my RestController class to handle HTTP requests.
 * @RequestMapping ensures that HTTP requests to /api will be mapped with this class methods.
 */
@RestController
@RequestMapping("/api")
public class MyRESTController {
    /**
     * Method that is ran everytime there is a HTTP request,
     * for example if ran on localhost, request looks like this:
     * http://localhost:8080/api/request
     * @return a User object with firstname, lastname, username.
     * @throws IOException
     */
    @GetMapping("/request")
    public User getUser() throws IOException {

        JSONObject user = JsonReader.readJsonFromUrl("https://randomuser.me/api/");
        JSONArray results = user.getJSONArray("results");
        JSONObject obj = results.getJSONObject(0);
        String firstName = obj.getJSONObject("name").getString("first");
        String lastName = obj.getJSONObject("name").getString("last");
        String username = obj.getJSONObject("login").getString("username");

        User u = new User();
        u.setFirstName(firstName);
        u.setLastName(lastName);
        u.setUsername(username);

        return u;
    }


}
