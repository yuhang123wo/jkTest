package com.yuhang.demo.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author Niebin
 * @since 2018-12-21
 */
public class OrderInfo {

	private static final long serialVersionUID = 1L;

	private long id;
	/**
	 * 订单编号
	 */
	private String orderNo;

	/**
	 * 客户id
	 */
	private Long customerId;

	/**
	 * 客户名称
	 */
	private String customerName;

	/**
	 * 客户联系电话
	 */
	private String customerPhone;

	/**
	 * 分销商id
	 */
	private Long prdId;

	/**
	 * 分销商名称
	 */
	private String prdName;

	/**
	 * 分销商联系电话
	 */
	private String prdPhone;

	/**
	 * 分销商联系人
	 */
	private String prdConcat;

	/**
	 * 金额
	 */
	private BigDecimal amount;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

	private LocalDateTime updateTime;

	/**
	 * 发货时间
	 */
	private LocalDateTime deliveryTime;

	/**
	 * 完成时间
	 */
	private LocalDateTime finishTime;

	/**
	 * 代发订单id
	 */
	private Long shipOrder;

	/**
	 * 代发订单NO
	 */
	private String shipOrderNo;
	/**
	 * 支付方式:1-余额,2-微信
	 */
	private Integer payWay;

	/**
	 * 重量
	 */
	private BigDecimal weight;

	/**
	 * 运费
	 */
	private BigDecimal freight;

	/**
	 * 状态(位运算)->1:支付,2-已结算
	 */
	private Integer status;

	private String receiverName;

	/**
	 * 收件人电话
	 */
	private String receiverPhone;

	/**
	 * 收件人地址
	 */
	private String receiverAddress;

	/**
	 * 收件人所在省
	 */
	private String recevierProvince;

	/**
	 * 收件人所在市
	 */
	private String recevierCity;

	/**
	 * 收件人所在区
	 */
	private String recevierDistrict;

	/**
	 * 发件人姓名
	 */
	private String consignorName;

	/**
	 * 发件人电话
	 */
	private String consignorPhone;

	private String consignorAddress;

	/**
	 * 发件人所在省
	 */
	private String consignorProvince;

	/**
	 * 发件人所在市
	 */
	private String consignorCity;

	/**
	 * 发件人所在区
	 */
	private String consignorDistrict;

	private String expressNo;

	/**
	 * 邮费id
	 */
	private Long postageId;

	private Integer expressId;

	private String expressName;

	/**
	 * 是否到付:0-否,1-是
	 */
	private Integer collect;

	private Integer version;

	/**
	 * 待结算金额
	 */
	private BigDecimal settlement;

	/**
	 * 货款
	 */
	private BigDecimal price;

	/**
	 * 配送方式:1-邮寄到家,2-上门自提
	 */
	private Integer shipping;

	/**
	 * 买家留言
	 */
	private String buyerComments;

	private LocalDateTime payTime;

	private LocalDateTime shipOrderTime;

	private String shopName;

	private BigDecimal firstWeight;

	private BigDecimal addWeight;

	private BigDecimal firstWeightKg;

	private BigDecimal addWeightKg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Long getPrdId() {
		return prdId;
	}

	public void setPrdId(Long prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdPhone() {
		return prdPhone;
	}

	public void setPrdPhone(String prdPhone) {
		this.prdPhone = prdPhone;
	}

	public String getPrdConcat() {
		return prdConcat;
	}

	public void setPrdConcat(String prdConcat) {
		this.prdConcat = prdConcat;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public LocalDateTime getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(LocalDateTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public LocalDateTime getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(LocalDateTime finishTime) {
		this.finishTime = finishTime;
	}

	public Long getShipOrder() {
		return shipOrder;
	}

	public void setShipOrder(Long shipOrder) {
		this.shipOrder = shipOrder;
	}

	public String getShipOrderNo() {
		return shipOrderNo;
	}

	public void setShipOrderNo(String shipOrderNo) {
		this.shipOrderNo = shipOrderNo;
	}

	public Integer getPayWay() {
		return payWay;
	}

	public void setPayWay(Integer payWay) {
		this.payWay = payWay;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getRecevierProvince() {
		return recevierProvince;
	}

	public void setRecevierProvince(String recevierProvince) {
		this.recevierProvince = recevierProvince;
	}

	public String getRecevierCity() {
		return recevierCity;
	}

	public void setRecevierCity(String recevierCity) {
		this.recevierCity = recevierCity;
	}

	public String getRecevierDistrict() {
		return recevierDistrict;
	}

	public void setRecevierDistrict(String recevierDistrict) {
		this.recevierDistrict = recevierDistrict;
	}

	public String getConsignorName() {
		return consignorName;
	}

	public void setConsignorName(String consignorName) {
		this.consignorName = consignorName;
	}

	public String getConsignorPhone() {
		return consignorPhone;
	}

	public void setConsignorPhone(String consignorPhone) {
		this.consignorPhone = consignorPhone;
	}

	public String getConsignorAddress() {
		return consignorAddress;
	}

	public void setConsignorAddress(String consignorAddress) {
		this.consignorAddress = consignorAddress;
	}

	public String getConsignorProvince() {
		return consignorProvince;
	}

	public void setConsignorProvince(String consignorProvince) {
		this.consignorProvince = consignorProvince;
	}

	public String getConsignorCity() {
		return consignorCity;
	}

	public void setConsignorCity(String consignorCity) {
		this.consignorCity = consignorCity;
	}

	public String getConsignorDistrict() {
		return consignorDistrict;
	}

	public void setConsignorDistrict(String consignorDistrict) {
		this.consignorDistrict = consignorDistrict;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Long getPostageId() {
		return postageId;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public Integer getCollect() {
		return collect;
	}

	public void setCollect(Integer collect) {
		this.collect = collect;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public BigDecimal getSettlement() {
		return settlement;
	}

	public void setSettlement(BigDecimal settlement) {
		this.settlement = settlement;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getShipping() {
		return shipping;
	}

	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}

	public String getBuyerComments() {
		return buyerComments;
	}

	public void setBuyerComments(String buyerComments) {
		this.buyerComments = buyerComments;
	}

	public LocalDateTime getPayTime() {
		return payTime;
	}

	public void setPayTime(LocalDateTime payTime) {
		this.payTime = payTime;
	}

	public LocalDateTime getShipOrderTime() {
		return shipOrderTime;
	}

	public void setShipOrderTime(LocalDateTime shipOrderTime) {
		this.shipOrderTime = shipOrderTime;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public BigDecimal getFirstWeight() {
		return firstWeight;
	}

	public void setFirstWeight(BigDecimal firstWeight) {
		this.firstWeight = firstWeight;
	}

	public BigDecimal getAddWeight() {
		return addWeight;
	}

	public void setAddWeight(BigDecimal addWeight) {
		this.addWeight = addWeight;
	}

	public BigDecimal getFirstWeightKg() {
		return firstWeightKg;
	}

	public void setFirstWeightKg(BigDecimal firstWeightKg) {
		this.firstWeightKg = firstWeightKg;
	}

	public BigDecimal getAddWeightKg() {
		return addWeightKg;
	}

	public void setAddWeightKg(BigDecimal addWeightKg) {
		this.addWeightKg = addWeightKg;
	}

}
