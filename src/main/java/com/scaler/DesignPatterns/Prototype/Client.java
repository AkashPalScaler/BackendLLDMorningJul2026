package com.scaler.DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        VMInstance originalVmInstance = new VMInstance(); // Prototype
        GpuVMInstance gpuVmInstance = new GpuVMInstance(); // Prototype


        VMInstance copyVmInstance = originalVmInstance.clone();
        VMInstance vmInstanceCopy =  gpuVmInstance.clone();

        VMInstance copyVmInstanceCopy = new VMInstance(originalVmInstance);
    }
}
