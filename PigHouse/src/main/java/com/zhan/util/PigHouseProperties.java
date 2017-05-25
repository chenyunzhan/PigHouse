package com.zhan.util;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(PigHouseProperties.PREFIX)
public class PigHouseProperties {
	public static final String PREFIX = "com.zhan.pighouse";
	
	private String cardPath;

	public String getCardPath() {
		return cardPath;
	}

	public void setCardPath(String cardPath) {
		this.cardPath = cardPath;
	}


}
