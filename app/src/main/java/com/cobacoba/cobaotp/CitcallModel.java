package com.cobacoba.cobaotp;

public class CitcallModel {

    private String msisdn;
    private int gateway;

    public CitcallModel(String msisdn, int gateway) {
        this.msisdn = msisdn;
        this.gateway = gateway;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public int getGateway() {
        return gateway;
    }

    public void setGateway(int gateway) {
        this.gateway = gateway;
    }

}
