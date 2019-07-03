package com.yuhang.demo.util;

public enum GiftType {
	PACK {
		public String getName() {
			return "包装";
		}
	},
	GIFT {
		public String getName() {
			return "礼物";
		}
	};
	public abstract String getName();
}