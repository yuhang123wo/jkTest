package com.yuhang.demo.util.vo;

public enum SourceType {
	TAOBAO{public String getName(){return "淘宝";}},
	TMALL{public String getName(){return "天猫";}},
	WEIDIAN{public String getName(){return "微店";}},
	JD{public String getName(){return "京东";}},
	MEILISHUO{public String getName(){return "美丽说";}},
	MOGUJIE{public String getName(){return "蘑菇街";}},
	MANUL{public String getName(){return "手动";}},
	IMPORT{public String getName(){return "导入";}},
	YLBB{public String getName(){return "1688";}},
	PDD{public String getName(){return "拼多多";}};
    public abstract String getName();	
}
