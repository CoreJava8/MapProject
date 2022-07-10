package com.dev.map;

import com.dev.map.model.ChargeHistory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, ChargeHistory> finalMap_model = ChargeHistoryServiceImpl.getResultantObjects();
        System.out.println(finalMap_model);

        System.out.println("===========");
        System.out.println();

        List finalList = MapServiceImpl.getResultantObjects();
        System.out.println(finalList);
    }
}
