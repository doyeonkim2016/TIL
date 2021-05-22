# Hashmap

```java
Map<String, Product> productsByName= new HashMap<>();

//Get - we can retrieve a value from the map by its key
Product nextPurchase = productsByName.get("E-Bike");

//Check If a Key or Value Exists in the map
productsByName.containsKey("E-Bike");
productsByName.containsValue(eBike);

//Iterating Over Hashmap

for (String key : productsByName.keySet)){
  Product product = productsByName.get(key);
}

for(Map.Entry<String ,Product> entry: productsByName.entrySet()){
  Product producct = entry.getValue();
  String key = entry.getKey();
}

//The Key
//We can use any class as the key in our HashMap. However, for the map to work properly, we need to provide an implementation for equals()
//and hashCode()
