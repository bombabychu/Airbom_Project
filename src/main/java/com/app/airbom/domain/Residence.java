package com.app.airbom.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Residence {
	private String hostSerial, memberId, residenceName, price, zipcode, addr, limitNo, detailImg, infoImg, regiContent;

	public String getHostSerial() {
		return hostSerial;
	}

	public void setHostSerial(String hostSerial) {
		this.hostSerial = hostSerial;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getResidenceName() {
		return residenceName;
	}

	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getDetailImg() {
		return detailImg;
	}

	public void setDetailImg(String detailImg) {
		this.detailImg = detailImg;
	}

	public String getInfoImg() {
		return infoImg;
	}

	public void setInfoImg(String infoImg) {
		this.infoImg = infoImg;
	}

	public String getRegiContent() {
		return regiContent;
	}

	public void setRegiContent(String regiContent) {
		this.regiContent = regiContent;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getLimitNo() {
		return limitNo;
	}

	public void setLimitNo(String limitNo) {
		this.limitNo = limitNo;
	}

	@Override
	public String toString() {
		return "Residence [hostSerial=" + hostSerial + ", memberId=" + memberId + ", residenceName=" + residenceName
				+ ", price=" + price + ", zipcode=" + zipcode + ", detailImg=" + detailImg + ", infoImg=" + infoImg
				+ ", regiContent=" + regiContent + ", addr=" + addr + ", limitNo=" + limitNo + "]";
	}
	

}