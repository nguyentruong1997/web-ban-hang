package com.migi.model;

public class ProductTypeDTO {
	private String maLoaiSP;
	private String tenLoaiSP;

	public ProductTypeDTO() {
		super();
	}

	public ProductTypeDTO(String maLoaiSP, String tenLoaiSP) {
		super();
		this.maLoaiSP = maLoaiSP;
		this.tenLoaiSP = tenLoaiSP;
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
