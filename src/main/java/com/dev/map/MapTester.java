package com.dev.map;

import com.dev.map.model.ChargeHistory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, ChargeHistory> finalMap_model = ChargeHistoryServiceImpl.getResultantObjects();
        System.out.println(finalMap_model);

        System.out.println("===========");
        System.out.println();

        Map<String, ChargeHistory> finalMap_map = MapServiceImpl.getResultantObjects();
        System.out.println(finalMap_map);
    }
}
