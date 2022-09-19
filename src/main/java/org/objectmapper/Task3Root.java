package org.objectmapper;

import java.util.ArrayList;

public class Task3Root {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Task3DataP> data;
	private Task3SupportP support;

	public int getPage() {
		return page;
	}

	public int getPer_page() {
		return per_page;
	}

	public int getTotal() {
		return total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public ArrayList<Task3DataP> getData() {
		return data;
	}

	public Task3SupportP getSupport() {
		return support;
	}

}
