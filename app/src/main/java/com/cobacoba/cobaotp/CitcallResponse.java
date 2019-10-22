package com.cobacoba.cobaotp;

public class CitcallResponse {

    private String rc;
    private String trxid;
    private String msisdn;
    private String via;
    private String token;
    private String dial_code;
    private String dial_status;
    private String call_status;
    private String result;

    public CitcallResponse(String rc, String trxid, String msisdn, String via, String token, String dial_code, String dial_status, String call_status, String result) {
        this.rc = rc;
        this.trxid = trxid;
        this.msisdn = msisdn;
        this.via = via;
        this.token = token;
        this.dial_code = dial_code;
        this.dial_status = dial_status;
        this.call_status = call_status;
        this.result = result;
    }

    public CitcallResponse() {
        this.rc = "";
        this.trxid = "";
        this.msisdn = "";
        this.via = "";
        this.token = "";
        this.dial_code = "";
        this.dial_status = "";
        this.call_status = "";
        this.result = "";
    }


    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDial_code() {
        return dial_code;
    }

    public void setDial_code(String dial_code) {
        this.dial_code = dial_code;
    }

    public String getDial_status() {
        return dial_status;
    }

    public void setDial_status(String dial_status) {
        this.dial_status = dial_status;
    }

    public String getCall_status() {
        return call_status;
    }

    public void setCall_status(String call_status) {
        this.call_status = call_status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
