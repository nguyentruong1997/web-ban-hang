package com.migi.model;

import java.util.Date;

public class InvoicesDTO {
	private String maHoaDon;
	private String maKhachHang;
	private String maNhanVien;
	private Date ngayLap;
	private Date nganhan;
	private String giaban;

	public InvoicesDTO() {
		super();
	}

	public InvoicesDTO(String maHoaDon, String maKhachHang, String maNhanVien, Date ngayLap, Date nganhan,
			String giaban) {
		super();
		this.maHoaDon = maHoaDon;
		this.maKhachHang = maKhachHang;
		this.maNhanVien = maNhanVien;
		this.ngayLap = ngayLap;
		this.nganhan = nganhan;
		this.giaban = giaban;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public Date getNganhan() {
		return nganhan;
	}

	public void setNganhan(Date nganhan) {
		this.nganhan = nganhan;
	}

	public String getGiaban() {
		return giaban;
	}

	public void setGiaban(String giaban) {
		this.giaban = giaban;
	}

}
