package com.example.demo.entity;

import javax.persistence.*;
@Table(name = "parameter")
public class Parameter {
    @Id
    @Column(name = "posID")
    private Integer posid;

    @Column(name = "App_Sub_ID")
    private String appSubId;

    @Column(name = "App_Token")
    private String appToken;

    @Column(name = "Api_ID")
    private String apiId;

    @Column(name = "Api_Version")
    private String apiVersion;

    @Column(name = "Time_Stamp")
    private String timeStamp;

    @Column(name = "Sign_Method")
    private String signMethod;

    @Column(name = "Sign")
    private String sign;

    @Column(name = "Format")
    private String format;

    @Column(name = "Partner_ID")
    private String partnerId;

    @Column(name = "Sys_ID")
    private String sysId;

    @Column(name = "App_Pub_ID")
    private String appPubId;

    @Column(name = "Is_Sand_Box")
    private String isSandBox;

    @Column(name = "api_name")
    private String apiName;

    @Column(name = "api_ne")
    private String apiNe;

    @Column(name = "api_sx")
    private String apiSx;

    /**
     * @return posID
     */
    public Integer getPosid() {
        return posid;
    }

    /**
     * @param posid
     */
    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    /**
     * @return App_Sub_ID
     */
    public String getAppSubId() {
        return appSubId;
    }

    /**
     * @param appSubId
     */
    public void setAppSubId(String appSubId) {
        this.appSubId = appSubId;
    }

    /**
     * @return App_Token
     */
    public String getAppToken() {
        return appToken;
    }

    /**
     * @param appToken
     */
    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    /**
     * @return Api_ID
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * @param apiId
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * @return Api_Version
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * @return Time_Stamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return Sign_Method
     */
    public String getSignMethod() {
        return signMethod;
    }

    /**
     * @param signMethod
     */
    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    /**
     * @return Sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * @return Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return Partner_ID
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * @param partnerId
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * @return Sys_ID
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * @param sysId
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * @return App_Pub_ID
     */
    public String getAppPubId() {
        return appPubId;
    }

    /**
     * @param appPubId
     */
    public void setAppPubId(String appPubId) {
        this.appPubId = appPubId;
    }

    /**
     * @return Is_Sand_Box
     */
    public String getIsSandBox() {
        return isSandBox;
    }

    /**
     * @param isSandBox
     */
    public void setIsSandBox(String isSandBox) {
        this.isSandBox = isSandBox;
    }

    /**
     * @return api_name
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * @param apiName
     */
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * @return api_ne
     */
    public String getApiNe() {
        return apiNe;
    }

    /**
     * @param apiNe
     */
    public void setApiNe(String apiNe) {
        this.apiNe = apiNe;
    }

    /**
     * @return api_sx
     */
    public String getApiSx() {
        return apiSx;
    }

    /**
     * @param apiSx
     */
    public void setApiSx(String apiSx) {
        this.apiSx = apiSx;
    }
}