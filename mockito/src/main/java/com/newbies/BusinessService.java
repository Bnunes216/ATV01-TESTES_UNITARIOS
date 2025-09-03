// src/main/java/com/newbies/BusinessService.java
package com.newbies;

public class BusinessService {

    private final DataRepository dataRepository;

    public BusinessService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataRepository.findAll();
        if (data == null || data.length == 0) {
            return Integer.MIN_VALUE;
        }
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}
