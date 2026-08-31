package com.scaler.DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class VMInstanceRegistry {
    Map<String, VMInstance> registeredVmInstances;

    public VMInstanceRegistry() {
        registeredVmInstances = new HashMap<>();
    }

    public void register(String key, VMInstance vmInstance) {
        registeredVmInstances.put(key, vmInstance);
    }
    public VMInstance get(String key) {
        if(!registeredVmInstances.containsKey(key)) {
             throw new RuntimeException(key + " not registered");
        }
        return registeredVmInstances.get(key).clone();


    }
}
