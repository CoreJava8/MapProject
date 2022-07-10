**Running Map implementation:**

**With Unique objects:**
List historiesList = Arrays.asList(getMapObject(TestDataGenerator.getData1()), getMapObject(TestDataGenerator.getData2()), getMapObject(TestDataGenerator.dupli_getData1()));

**Output:**

{
100 = {
historyClaimId = 100,
charges = [{
id = 1000,
name = Charger_1,
modifiers = [{
id = 1,
name = Mod1,
amount = 100.0
}, {
id = 2,
name = Mod2,
amount = 200.0
}]
}, {
id = 2000,
name = Charger_2,
modifiers = [{
id = 1,
name = Mod1,
amount = 100.0
}, {
id = 2,
name = Mod2,
amount = 200.0
}]
}]
}, 200 = {
historyClaimId = 200,
charges = [{
id = 3000,
name = Charger_3,
modifiers = [{
id = 3,
name = Mod3,
amount = 300.0
}, {
id = 4,
name = Mod4,
amount = 400.0
}]
}]
}
}







**With different objects:**
List historiesList = Arrays.asList(getMapObject(TestDataGenerator.getData1()), getMapObject(TestDataGenerator.getData2()), getMapObject(TestDataGenerator.getData3()));

**Output:**

{
100 = {
historyClaimId = 100,
charges = [{
id = 1000,
name = Charger_1,
modifiers = [{
id = 1,
name = Mod1,
amount = 100.0
}, {
id = 2,
name = Mod2,
amount = 200.0
}]
}, {
id = 2000,
name = Charger_2,
modifiers = [{
id = 1,
name = Mod1,
amount = 100.0
}, {
id = 2,
name = Mod2,
amount = 200.0
}]
}]
}, 200 = {
historyClaimId = 200,
charges = [{
id = 3000,
name = Charger_3,
modifiers = [{
id = 3,
name = Mod3,
amount = 300.0
}, {
id = 4,
name = Mod4,
amount = 400.0
}]
}, {
id = 5000,
name = Charger_5,
modifiers = [{
id = 5,
name = Mod5,
amount = 500.0
}, {
id = 6,
name = Mod6,
amount = 600.0
}]
}, {
id = 6000,
name = Charger_6,
modifiers = [{
id = 5,
name = Mod5,
amount = 500.0
}, {
id = 6,
name = Mod6,
amount = 600.0
}]
}]
}
}

