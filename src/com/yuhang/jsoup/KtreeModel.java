package com.yuhang.jsoup;

import java.util.List;

/**
 * 
 * @author yuhang
 * @date 2016年9月6日
 * @desc
 */
public class KtreeModel {

	private List<String> topMenu;// 顶部菜单
	private String pageTitle;//
	private String pageSuffix;// 后缀
	private int totalPage;// 总页数
	private int currentPage;// 当前页
	private int nextPage;
	private List<String> pageContent;

	public List<String> getTopMenu() {
		return topMenu;
	}

	public void setTopMenu(List<String> topMenu) {
		this.topMenu = topMenu;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<String> getPageContent() {
		return pageContent;
	}

	public void setPageContent(List<String> pageContent) {
		this.pageContent = pageContent;
	}

	public String getPageSuffix() {
		return pageSuffix;
	}

	public void setPageSuffix(String pageSuffix) {
		this.pageSuffix = pageSuffix;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	@Override
	public String toString() {
		return "KtreeModel [topMenu=" + topMenu + ", pageTitle=" + pageTitle + ", pageSuffix="
				+ pageSuffix + ", totalPage=" + totalPage + ", currentPage=" + currentPage
				+ ", nextPage=" + nextPage + ", pageContent=" + pageContent + "]";
	}

}
