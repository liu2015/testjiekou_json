package com.example.demo.entity;

import javax.persistence.*;
@Table(name = "pospluprc")
public class Pospluprc {
    /**
     * posid
     */
    @Id
    private Integer posid;

    /**
     * 收银员编号
     */
    @Column(name = "cashierId")
    private String cashierid;

    /**
     * 备注
     */
    @Column(name = "Comments")
    private String comments;

    /**
     * 商品编号
     */
    @Column(name = "itemCode")
    private String itemcode;

    /**
     * 商品价格
     */
    private String price;

    /**
     * 商品数量
     */
    private String quantity;

    /**
     * 商场编号
     */
    @Column(name = "Mall")
    private String mall;

    /**
     * 会员手机号
     */
    @Column(name = "Mobile")
    private String mobile;

    /**
     * 订单号
     */
    @Column(name = "orderId")
    private String orderid;

    /**
     * 支付银行
     */
    @Column(name = "cardBank")
    private String cardbank;

    /**
     * 卡号
     */
    @Column(name = "cardNumber")
    private String cardnumber;

    /**
     * 支付方式
     */
    @Column(name = "paymentMethod")
    private String paymentmethod;

    /**
     * 支付时间
     */
    @Column(name = "payTime")
    private String paytime;

    /**
     * 支付金额
     */
    @Column(name = "Value")
    private Double value;

    /**
     * 应收金额
     */
    @Column(name = "payAmt")
    private Double payamt;

    /**
     * 优惠金额
     */
    @Column(name = "discountAmt")
    private Double discountamt;

    /**
     * 店铺编号
     */
    @Column(name = "Store")
    private String store;

    /**
     * 收银机编号
     */
    @Column(name = "tillId")
    private String tillid;

    /**
     * 时间
     */
    @Column(name = "Time")
    private String time;

    /**
     * 订单总金额
     */
    @Column(name = "totalAmt")
    private String totalamt;

    /**
     * 订单类型
     */
    private String type;

    /**
     * 店铺验证密钥
     */
    @Column(name = "checkCode")
    private String checkcode;

    /**
     * 关联原订单号
     */
    @Column(name = "refOrderId")
    private String reforderid;

    /**
     * 来源
     */
    private String source;

    /**
     * 获取posid
     *
     * @return posid - posid
     */
    public Integer getPosid() {
        return posid;
    }

    /**
     * 设置posid
     *
     * @param posid posid
     */
    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    /**
     * 获取收银员编号
     *
     * @return cashierId - 收银员编号
     */
    public String getCashierid() {
        return cashierid;
    }

    /**
     * 设置收银员编号
     *
     * @param cashierid 收银员编号
     */
    public void setCashierid(String cashierid) {
        this.cashierid = cashierid;
    }

    /**
     * 获取备注
     *
     * @return Comments - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取商品编号
     *
     * @return itemCode - 商品编号
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * 设置商品编号
     *
     * @param itemcode 商品编号
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取商品数量
     *
     * @return quantity - 商品数量
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 设置商品数量
     *
     * @param quantity 商品数量
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取商场编号
     *
     * @return Mall - 商场编号
     */
    public String getMall() {
        return mall;
    }

    /**
     * 设置商场编号
     *
     * @param mall 商场编号
     */
    public void setMall(String mall) {
        this.mall = mall;
    }

    /**
     * 获取会员手机号
     *
     * @return Mobile - 会员手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置会员手机号
     *
     * @param mobile 会员手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取订单号
     *
     * @return orderId - 订单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置订单号
     *
     * @param orderid 订单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取支付银行
     *
     * @return cardBank - 支付银行
     */
    public String getCardbank() {
        return cardbank;
    }

    /**
     * 设置支付银行
     *
     * @param cardbank 支付银行
     */
    public void setCardbank(String cardbank) {
        this.cardbank = cardbank;
    }

    /**
     * 获取卡号
     *
     * @return cardNumber - 卡号
     */
    public String getCardnumber() {
        return cardnumber;
    }

    /**
     * 设置卡号
     *
     * @param cardnumber 卡号
     */
    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    /**
     * 获取支付方式
     *
     * @return paymentMethod - 支付方式
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * 设置支付方式
     *
     * @param paymentmethod 支付方式
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
     * 获取支付时间
     *
     * @return payTime - 支付时间
     */
    public String getPaytime() {
        return paytime;
    }

    /**
     * 设置支付时间
     *
     * @param paytime 支付时间
     */
    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    /**
     * 获取支付金额
     *
     * @return Value - 支付金额
     */
    public Double getValue() {
        return value;
    }

    /**
     * 设置支付金额
     *
     * @param value 支付金额
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * 获取应收金额
     *
     * @return payAmt - 应收金额
     */
    public Double getPayamt() {
        return payamt;
    }

    /**
     * 设置应收金额
     *
     * @param payamt 应收金额
     */
    public void setPayamt(Double payamt) {
        this.payamt = payamt;
    }

    /**
     * 获取优惠金额
     *
     * @return discountAmt - 优惠金额
     */
    public Double getDiscountamt() {
        return discountamt;
    }

    /**
     * 设置优惠金额
     *
     * @param discountamt 优惠金额
     */
    public void setDiscountamt(Double discountamt) {
        this.discountamt = discountamt;
    }

    /**
     * 获取店铺编号
     *
     * @return Store - 店铺编号
     */
    public String getStore() {
        return store;
    }

    /**
     * 设置店铺编号
     *
     * @param store 店铺编号
     */
    public void setStore(String store) {
        this.store = store;
    }

    /**
     * 获取收银机编号
     *
     * @return tillId - 收银机编号
     */
    public String getTillid() {
        return tillid;
    }

    /**
     * 设置收银机编号
     *
     * @param tillid 收银机编号
     */
    public void setTillid(String tillid) {
        this.tillid = tillid;
    }

    /**
     * 获取时间
     *
     * @return Time - 时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取订单总金额
     *
     * @return totalAmt - 订单总金额
     */
    public String getTotalamt() {
        return totalamt;
    }

    /**
     * 设置订单总金额
     *
     * @param totalamt 订单总金额
     */
    public void setTotalamt(String totalamt) {
        this.totalamt = totalamt;
    }

    /**
     * 获取订单类型
     *
     * @return type - 订单类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置订单类型
     *
     * @param type 订单类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取店铺验证密钥
     *
     * @return checkCode - 店铺验证密钥
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
     * 设置店铺验证密钥
     *
     * @param checkcode 店铺验证密钥
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    /**
     * 获取关联原订单号
     *
     * @return refOrderId - 关联原订单号
     */
    public String getReforderid() {
        return reforderid;
    }

    /**
     * 设置关联原订单号
     *
     * @param reforderid 关联原订单号
     */
    public void setReforderid(String reforderid) {
        this.reforderid = reforderid;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }
}