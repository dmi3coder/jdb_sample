package de.dmi3y.articles.jdbtest.resource;

import spark.Request;
import spark.Response;

public class MainResource {


    public static Object handleMain(Request request, Response response) {
        String htmlCode = "<div>Hello, someone :)</div>";
        if (request.attribute("username") != null) {
            htmlCode = "<div>Hello, " + request.attribute("username") + ":)</div>";
        }
        return htmlCode;
    }
}
