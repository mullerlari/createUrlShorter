package com.larimuller.createUrlShortner;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Main implements RequestHandler<Map<String, Object>, Map<String, String >>{


    @Override
    public Map<String, String> handleRequest(Map<String, Object> stringObjectMap, Context context) {
        return Map.of();
    }
}