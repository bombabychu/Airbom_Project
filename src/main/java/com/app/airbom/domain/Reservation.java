package com.app.airbom.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Reservation {
	private String memberId, hostSerial, resPrice, rsvSeq, regdate, solddays;
	Date checkout;
	Date checkin;
	
	public String getRsvSeq() {
		int random = (int)(Math.random()*99999);
	    rsvSeq = "rev"+String.valueOf(random);
		return rsvSeq;
	}

	public void setRsvSeq(String rsvSeq) {
		this.rsvSeq = rsvSeq;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date date) {
		this.checkin = date;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getSolddays() {
		return solddays;
	}

	public void setSolddays(String solddays) {
		this.solddays = solddays;
	}

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

	public String getResPrice() {
		return resPrice;
	}

	public void setResPrice(String resPrice) {
		this.resPrice = resPrice;
	}
}