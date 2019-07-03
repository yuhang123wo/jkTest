package com.yuhang.domain;

import java.math.BigDecimal;
import java.util.List;

public class InquiryEdit {

	private long inquiryId;// 询价信息ID
	private String approveStatus;// 审核状态
	private String quirySate;// 询单状态
	private String approveMsg;// 审核信息
	private BigDecimal verifyPrice;// 审核价格
    
	private boolean sendAll;
	private List<Long> supplierId;
	private int outPlatform;
	public long getInquiryId() {
		return inquiryId;
	}
	public void setInquiryId(long inquiryId) {
		this.inquiryId = inquiryId;
	}
	
	public String getApproveMsg() {
		return approveMsg;
	}
	public void setApproveMsg(String approveMsg) {
		this.approveMsg = approveMsg;
	}
	public BigDecimal getVerifyPrice() {
		return verifyPrice;
	}
	public void setVerifyPrice(BigDecimal verifyPrice) {
		this.verifyPrice = verifyPrice;
	}
	public boolean isSendAll() {
		return sendAll;
	}
	public void setSendAll(boolean sendAll) {
		this.sendAll = sendAll;
	}
	public List<Long> getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(List<Long> supplierId) {
		this.supplierId = supplierId;
	}
	public int getOutPlatform() {
		return outPlatform;
	}
	public void setOutPlatform(int outPlatform) {
		this.outPlatform = outPlatform;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getQuirySate() {
		return quirySate;
	}
	public void setQuirySate(String quirySate) {
		this.quirySate = quirySate;
	}
	
	

}
