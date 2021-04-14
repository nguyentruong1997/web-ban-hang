package com.migi.model;

public class ProductDTO {
	private String maSP;
	private String tenSP;
	private String dvt;
	private String giaHienTai;
	private String maLoaiSP;
	private String chatLuong;
	private String kieuDang;
	private String color;
	private char size;
	private String soLuong;

	public ProductDTO() {
		super();
	}

	public ProductDTO(String maSP, String tenSP, String dvt, String giaHienTai, String maLoaiSP, String chatLuong,
			String kieuDang, String color, char size, String soLuong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dvt = dvt;
		this.giaHienTai = giaHienTai;
		this.maLoaiSP = maLoaiSP;
		this.chatLuong = chatLuong;
		this.kieuDang = kieuDang;
		this.color = color;
		this.size = size;
		this.soLuong = soLuong;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getDvt() {
		return dvt;
	}

	public void setDvt(String dvt) {
		this.dvt = dvt;
	}

	public String getGiaHienTai() {
		return giaHienTai;
	}

	public void setGiaHienTai(String giaHienTai) {
		this.giaHienTai = giaHienTai;
	}

	public String getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	public String getChatLuong() {
		return chatLuong;
	}

	public void setChatLuong(String chatLuong) {
		this.chatLuong = chatLuong;
	}

	public String getKieuDang() {
		return kieuDang;
	}

	public void setKieuDang(String kieuDang) {
		this.kieuDang = kieuDang;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

}
