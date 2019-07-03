package com.yuhang.jsoup;

import java.util.List;

public class ProductModel {

	private String artNo;// 货号
	private String bulkPrice;// 散拿价
	private String type;// 类型
	private String supply;// 货源
	private String popular;// 总人气
	private String downCount;// 下载次数
	private String pubCount;// 发布次数
	private String trademark;// 品牌
	private String closedWay;// 闭合方式
	private String pattern;// 图案
	private String style;// 风格
	private String heelPiece;// 后跟高
	private String listed;// 上市年份季节
	private String toeCap;// 鞋头款式
	private String soleStyle;// 跟底款式
	private String soleMaterial;// 鞋底材质
	private String insideMaterial;// 内里材质
	private String depth;// 开口深度
	private String features;// 皮质特征
	private String process;// 鞋制作工艺
	private String insolesMaterial;// 鞋垫材质
	private String upperMaterial;// 帮面材质
	private String color;// 颜色
	private String size;// 尺码
	private String design;// 款式
	private String popElement;// 流行元素
	private List<String> imgs;
	// 拿货信息
	private String takeAddress;// 拿货地址
	private String contactNumber;// 联系电话
	private String contactQq;// 联系QQ

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public String getBulkPrice() {
		return bulkPrice;
	}

	public void setBulkPrice(String bulkPrice) {
		this.bulkPrice = bulkPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public String getPopular() {
		return popular;
	}

	public void setPopular(String popular) {
		this.popular = popular;
	}

	public String getDownCount() {
		return downCount;
	}

	public void setDownCount(String downCount) {
		this.downCount = downCount;
	}

	public String getPubCount() {
		return pubCount;
	}

	public void setPubCount(String pubCount) {
		this.pubCount = pubCount;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getClosedWay() {
		return closedWay;
	}

	public void setClosedWay(String closedWay) {
		this.closedWay = closedWay;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getHeelPiece() {
		return heelPiece;
	}

	public void setHeelPiece(String heelPiece) {
		this.heelPiece = heelPiece;
	}

	public String getListed() {
		return listed;
	}

	public void setListed(String listed) {
		this.listed = listed;
	}

	public String getToeCap() {
		return toeCap;
	}

	public void setToeCap(String toeCap) {
		this.toeCap = toeCap;
	}

	public String getSoleStyle() {
		return soleStyle;
	}

	public void setSoleStyle(String soleStyle) {
		this.soleStyle = soleStyle;
	}

	public String getSoleMaterial() {
		return soleMaterial;
	}

	public void setSoleMaterial(String soleMaterial) {
		this.soleMaterial = soleMaterial;
	}

	public String getInsideMaterial() {
		return insideMaterial;
	}

	public void setInsideMaterial(String insideMaterial) {
		this.insideMaterial = insideMaterial;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getInsolesMaterial() {
		return insolesMaterial;
	}

	public void setInsolesMaterial(String insolesMaterial) {
		this.insolesMaterial = insolesMaterial;
	}

	public String getUpperMaterial() {
		return upperMaterial;
	}

	public void setUpperMaterial(String upperMaterial) {
		this.upperMaterial = upperMaterial;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTakeAddress() {
		return takeAddress;
	}

	public void setTakeAddress(String takeAddress) {
		this.takeAddress = takeAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactQq() {
		return contactQq;
	}

	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getPopElement() {
		return popElement;
	}

	public void setPopElement(String popElement) {
		this.popElement = popElement;
	}

	public List<String> getImgs() {
		return imgs;
	}

	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}

	@Override
	public String toString() {
		return "ProductModel [artNo=" + artNo + ", bulkPrice=" + bulkPrice + ", type=" + type
				+ ", supply=" + supply + ", popular=" + popular + ", downCount=" + downCount
				+ ", pubCount=" + pubCount + ", trademark=" + trademark + ", closedWay="
				+ closedWay + ", pattern=" + pattern + ", style=" + style + ", heelPiece="
				+ heelPiece + ", listed=" + listed + ", toeCap=" + toeCap + ", soleStyle="
				+ soleStyle + ", soleMaterial=" + soleMaterial + ", insideMaterial="
				+ insideMaterial + ", depth=" + depth + ", features=" + features + ", process="
				+ process + ", insolesMaterial=" + insolesMaterial + ", upperMaterial="
				+ upperMaterial + ", color=" + color + ", size=" + size + ", design=" + design
				+ ", popElement=" + popElement + ", imgs=" + imgs + ", takeAddress=" + takeAddress
				+ ", contactNumber=" + contactNumber + ", contactQq=" + contactQq + "]";
	}

}
