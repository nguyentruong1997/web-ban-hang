package com.migi.model;

import java.util.Date;

public class EnterCouponDTO {
	private String maPhieuNhap;
	private Date ngayNhap;

	public EnterCouponDTO() {
		super();
	}

	public EnterCouponDTO(String maPhieuNhap, Date ngayNhap) {
		super();
		this.maPhieuNhap = maPhieuNhap;
		this.ngayNhap = ngayNhap;
	}

	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}

	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

}
