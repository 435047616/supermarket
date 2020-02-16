package com.smbms.pojo;

import java.io.Serializable;

/**
 * 分页封装类
 * 
 * @author Administrator
 *
 */
public class PageBean implements Serializable {
	// 总条数
	private long totalSize;
	// 总页数
	private long totalPage;
	// 数据
	private Object list;

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long l) {
		this.totalSize = l;
	}

	public long getTotalPage() {
		return totalPage;
	}

	// 计算总页数
	public void setTotalPage(long pageSize) {
		this.totalPage = (this.totalSize + pageSize - 1) / pageSize;
	}

	public Object getList() {
		return list;
	}

	public void setList(Object list) {
		this.list = list;
	}

	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageBean(Integer pageSize, long totalSize, Object list) {
		this.totalSize = totalSize;
		if (pageSize == null) {
			pageSize = 0;
		}
		this.setTotalPage(pageSize);
		this.list = list;
	}
}
