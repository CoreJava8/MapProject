package com.dev.map;

import com.dev.map.model.Charge;
import com.dev.map.model.ChargeHistory;
import com.dev.map.model.Modifier;

import java.util.Arrays;

public class TestDataGenerator {

    public static ChargeHistory getData1(){
        Modifier modifier_1 =  new Modifier();
        modifier_1.setId(1);
        modifier_1.setName("Mod1");
        modifier_1.setAmount(100.00);

        Modifier modifier_2 =  new Modifier();
        modifier_2.setId(2);
        modifier_2.setName("Mod2");
        modifier_2.setAmount(200.00);

        Charge charge_1 = new Charge();
        charge_1.setId(1000);
        charge_1.setName("Charger_1");
        charge_1.setModifiers(Arrays.asList(modifier_1, modifier_2));

        Charge charge_2 = new Charge();
        charge_2.setId(2000);
        charge_2.setName("Charger_2");
        charge_2.setModifiers(Arrays.asList(modifier_1, modifier_2));

        ChargeHistory history = new ChargeHistory();
        history.setHistoryClaimId("100");
        history.setCharges(Arrays.asList(charge_1, charge_2));

        return history;
    }

    public static ChargeHistory getData2(){
        Modifier modifier_1 =  new Modifier();
        modifier_1.setId(3);
        modifier_1.setName("Mod3");
        modifier_1.setAmount(300.00);

        Modifier modifier_2 =  new Modifier();
        modifier_2.setId(4);
        modifier_2.setName("Mod4");
        modifier_2.setAmount(400.00);

        Charge charge_1 = new Charge();
        charge_1.setId(3000);
        charge_1.setName("Charger_3");
        charge_1.setModifiers(Arrays.asList(modifier_1, modifier_2));

        Charge charge_2 = new Charge();
        charge_2.setId(3000);
        charge_2.setName("Charger_3");
        charge_2.setModifiers(Arrays.asList(modifier_1, modifier_2));

        ChargeHistory history = new ChargeHistory();
        history.setHistoryClaimId("200");
        history.setCharges(Arrays.asList(charge_1, charge_2));

        return history;
    }

    public static ChargeHistory getData3(){
        Modifier modifier_1 =  new Modifier();
        modifier_1.setId(5);
        modifier_1.setName("Mod5");
        modifier_1.setAmount(500.00);

        Modifier modifier_2 =  new Modifier();
        modifier_2.setId(6);
        modifier_2.setName("Mod6");
        modifier_2.setAmount(600.00);

        Charge charge_1 = new Charge();
        charge_1.setId(5000);
        charge_1.setName("Charger_5");
        charge_1.setModifiers(Arrays.asList(modifier_1, modifier_2));

        Charge charge_2 = new Charge();
        charge_2.setId(6000);
        charge_2.setName("Charger_6");
        charge_2.setModifiers(Arrays.asList(modifier_1, modifier_2));

        ChargeHistory history = new ChargeHistory();
        history.setHistoryClaimId("200");
        history.setCharges(Arrays.asList(charge_1, charge_2));

        return history;
    }

    public static ChargeHistory dupli_getData1(){
        Modifier modifier_1 =  new Modifier();
        modifier_1.setId(1);
        modifier_1.setName("Mod9");
        modifier_1.setAmount(100.00);

        Modifier modifier_2 =  new Modifier();
        modifier_2.setId(2);
        modifier_2.setName("Mod10");
        modifier_2.setAmount(200.00);

        Modifier modifier_3 =  new Modifier();
        modifier_3.setId(2);
        modifier_3.setName("Mod2");
        modifier_3.setAmount(200.00);

        Charge charge_1 = new Charge();
        charge_1.setId(1000);
        charge_1.setName("Charger_1");
        charge_1.setModifiers(Arrays.asList(modifier_1, modifier_2));

        Charge charge_2 = new Charge();
        charge_2.setId(2000);
        charge_2.setName("Charger_2");
        charge_2.setModifiers(Arrays.asList(modifier_1, modifier_3));

        ChargeHistory history = new ChargeHistory();
        history.setHistoryClaimId("100");
        history.setCharges(Arrays.asList(charge_1, charge_2));

        return history;
    }
}
