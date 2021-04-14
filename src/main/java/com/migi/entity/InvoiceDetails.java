package com.migi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "invoice_details")
public class InvoiceDetails {
	@Column(name = "mahoadpn")
	private String maHoaDon;

	@Column(name = "masanpham")
	private String maSanPham;

	@Column(name = "soluong")
	private int soLuong;

	public InvoiceDetails() {
		super();
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
