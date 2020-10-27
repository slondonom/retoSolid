package com.sophossolutions.utilities;

import com.google.gson.Gson;
import cucumber.api.DataTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodsComun {

    public static String bodyUser(DataTable dataTable) {
        List<List<String>> raw = dataTable.raw();
        Map<String, String> user = new HashMap<>();
        Gson gson = new Gson();
        user.put("name", raw.get(0).get(0) + " " +  raw.get(0).get(1));
        user.put("gender",  raw.get(0).get(2));
        user.put("dob",  raw.get(0).get(3));
        user.put("email",  raw.get(0).get(4));
        user.put("status",  raw.get(0).get(5));
        return gson.toJson(user);
    }
}
