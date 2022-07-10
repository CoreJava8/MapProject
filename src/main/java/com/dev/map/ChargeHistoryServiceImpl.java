package com.dev.map;

import com.dev.map.model.Charge;
import com.dev.map.model.ChargeHistory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChargeHistoryServiceImpl {

    public static Map<String, ChargeHistory> getResultantObjects() {
        List<ChargeHistory> historiesList = Arrays.asList(TestDataGenerator.getData1(), TestDataGenerator.getData2(), TestDataGenerator.dupli_getData1());
        Map<String, ChargeHistory> chargeHistoryMap = new HashMap();
        historiesList.stream().forEach(chargeHistory -> manipulate(chargeHistory, chargeHistoryMap));
        return chargeHistoryMap;
    }

    private static void manipulate(ChargeHistory chargeHistory, Map<String, ChargeHistory> chargeHistoryMap) {
        if (chargeHistoryMap.containsKey(chargeHistory.getHistoryClaimId())) {
            ChargeHistory historyFromMap = chargeHistoryMap.get(chargeHistory.getHistoryClaimId());
            List<Charge> charge_1 = collectCharges(historyFromMap.getCharges().stream());
            List<Charge> charge_2 = collectCharges(chargeHistory.getCharges().stream());
            charge_1.addAll(charge_2);
            List<Charge> finalList = collectCharges(charge_1.stream().distinct());
            historyFromMap.setCharges(finalList);
        } else {
            List<Charge> finalList = collectCharges(chargeHistory.getCharges().stream().distinct());
            chargeHistory.setCharges(finalList);
            chargeHistoryMap.put(chargeHistory.getHistoryClaimId(), chargeHistory);
        }
    }

    private static List<Charge> collectCharges(Stream<Charge> historyFromMap) {
        return historyFromMap.collect(Collectors.toList());
    }
}
