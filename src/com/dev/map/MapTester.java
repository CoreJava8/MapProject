package com.dev.map;

import com.dev.map.model.ChargeHistory;

import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, ChargeHistory> finalMap = ChargeHistoryServiceImpl.getResultantObjects();
        System.out.println(finalMap);
    }
}
