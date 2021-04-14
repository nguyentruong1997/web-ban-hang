package com.migi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "product_type")
public class ProductType {
	@Column(name = "maloaisanpham")
	private String maLoaiSP;

	@Column(name = "tenloaisanpham")
	private String tenLoaiSP;

	public ProductType() {
		super();
	}

	public String getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	public String getTenLoaiSP() {
		return tenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}

}
