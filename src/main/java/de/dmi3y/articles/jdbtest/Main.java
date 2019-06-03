package de.dmi3y.articles.jdbtest;


import de.dmi3y.articles.jdbtest.resource.MainResource;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {

    public static void main(String[] args) {
        init();
    }


    public static void init() {
        Context context = Context.getInstance();
        initApi();
    }

    public static void initApi() {
        port(8080);
        get("/", MainResource::handleMain);
    }


}
