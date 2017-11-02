package com.app.airbom.domain;

import org.springframework.stereotype.Component;

@Component
public class Gmap {
	private String mapseq, flag, host_serial, latlng;

	public String getMapseq() {
		return mapseq;
	}

	public void setMapseq(String mapseq) {
		this.mapseq = mapseq;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getHost_serial() {
		return host_serial;
	}

	public void setHost_serial(String host_serial) {
		this.host_serial = host_serial;
	}

	public String getLatlng() {
		return latlng;
	}

	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}
}
