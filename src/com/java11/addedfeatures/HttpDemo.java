package com.java11.addedfeatures;

import java.net.URI;
import java.net.http.HttpClient;
//import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public class HttpDemo {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://github.com/mulu2035/testrepo2")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApplyAsync(HttpResponse::body).thenAccept(System.out::println).join();


    }
    //public static String parse(String responseBody){


}
