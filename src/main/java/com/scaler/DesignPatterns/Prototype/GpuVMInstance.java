package com.scaler.DesignPatterns.Prototype;

import com.sun.security.auth.NTSidUserPrincipal;

public class GpuVMInstance extends VMInstance {
    private String gpuName;

    //copy constructor
    public GpuVMInstance(GpuVMInstance other) {
        super(other);
        this.gpuName = other.gpuName;
    }
    public GpuVMInstance() {
    }

    @Override
    public GpuVMInstance clone() {
        return new GpuVMInstance(this);
    }
}
