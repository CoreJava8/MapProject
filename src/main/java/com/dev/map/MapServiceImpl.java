package com.dev.map;

import com.dev.map.model.ChargeHistory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapServiceImpl {

    public static List getResultantObjects() {
        List historiesList = getTestData();
        Map chargeHistoryMap = new HashMap();
        historiesList.stream().forEach(chargeHistory -> manipulate((Map) chargeHistory, chargeHistoryMap));
        List finalResult = new ArrayList(chargeHistoryMap.values());
        return finalResult;
    }

    private static List getTestData(){
        List historiesList_1 = new ArrayList(Arrays.asList(getMapObject(TestDataGenerator.getData1()), getMapObject(TestDataGenerator.getData2()), getMapObject(TestDataGenerator.getData3())));
        List historiesList_2 = new ArrayList(Arrays.asList(getMapObject(TestDataGenerator.getData1()), getMapObject(TestDataGenerator.getData2()), getMapObject(TestDataGenerator.dupli_getData1())));
        historiesList_1.addAll(historiesList_2);
        return historiesList_1;
    }

    private static Map<String, Object> getMapObject(ChargeHistory chargeHistory) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(chargeHistory, Map.class);
        return map;
    }

    private static void manipulate(Map chargeHistory, Map chargeHistoryMap) {
        if (chargeHistoryMap.containsKey(chargeHistory.get("historyClaimId"))) {
            Map historyFromMap = (Map) chargeHistoryMap.get(chargeHistory.get("historyClaimId"));
            List charge_1 = collectCharges(((List) historyFromMap.get("charges")).stream());
            List charge_2 = collectCharges(((List) chargeHistory.get("charges")).stream());
            charge_1.addAll(charge_2);
            List finalList = collectCharges(charge_1.stream().distinct());
            historyFromMap.put("charges", finalList);
        } else {
            List finalList = collectCharges(((List) chargeHistory.get("charges")).stream().distinct());
            chargeHistory.put("charges", finalList);
            chargeHistoryMap.put(chargeHistory.get("historyClaimId"), chargeHistory);
        }
    }

    private static List collectCharges(Stream historyFromMap) {
        return (List) historyFromMap.collect(Collectors.toList());
    }
}
