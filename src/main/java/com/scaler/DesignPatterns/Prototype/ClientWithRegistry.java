package com.scaler.DesignPatterns.Prototype;

public class ClientWithRegistry {
    private static VMInstanceRegistry vmInstanceRegistry;
    public static void fillRegisters(){
        vmInstanceRegistry = new VMInstanceRegistry();
        vmInstanceRegistry.register("VMInstance", new VMInstance());
        vmInstanceRegistry.register("GpuVMInstance", new GpuVMInstance());
    }
    public static void main(String[] args) {
        fillRegisters();

        VMInstance copyVmInstance = vmInstanceRegistry.get("VMInstance"); // "VMInstance".clone()
        GpuVMInstance gpuVmInstanceCopy = (GpuVMInstance) vmInstanceRegistry.get("GpuVMInstance"); // "GpuVmInstance".clone()

        // Transferred clone function to registry
        VMInstance orgVmInstance = vmInstanceRegistry.get("VMIInstance");
        // Pre running server
        // Run server

    }
}
