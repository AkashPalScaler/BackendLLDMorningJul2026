package com.scaler.DesignPatterns.Prototype;

public class VMInstance implements Prototype<VMInstance> {
    private String os;
    private String runtime;
    private String monitoringAgent;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getMonitoringAgent() {
        return monitoringAgent;
    }

    public void setMonitoringAgent(String monitoringAgent) {
        this.monitoringAgent = monitoringAgent;
    }

    // copy constructor (Homework -> convert this to private)
    public VMInstance (VMInstance other){
        this.os = other.os;
        this.runtime = other.runtime;
        this.monitoringAgent = other.monitoringAgent;
    }

    public VMInstance(){

    }

    @Override
    public VMInstance clone() {
        return new VMInstance(this);
    }
}
