package com.fable.shiro.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
@ConfigurationProperties(prefix = "cas")
public class CasConfig {
	private String casServerUrlPrefix = "https://server.fable.com:8443/cas";
	private String casServerLoginUrl = casServerUrlPrefix + "/login";
	private String casServerLogoutUrl = casServerUrlPrefix + "/logout";
	private String localServerUrlPrefix = "http://client1.fable.com:8081/shiroCAS";
	private String casFilterUrlPattern = "/shiro-cas";
	private String localServerLoginUrl = casServerLoginUrl + "?service=" + localServerUrlPrefix + casFilterUrlPattern;

	public String getCasServerUrlPrefix() {
		return casServerUrlPrefix;
	}

	public void setCasServerUrlPrefix(String casServerUrlPrefix) {
		this.casServerUrlPrefix = casServerUrlPrefix;
	}

	public String getCasServerLoginUrl() {
		return casServerLoginUrl;
	}

	public void setCasServerLoginUrl(String casServerLoginUrl) {
		this.casServerLoginUrl = casServerLoginUrl;
	}

	public String getCasServerLogoutUrl() {
		return casServerLogoutUrl;
	}

	public void setCasServerLogoutUrl(String casServerLogoutUrl) {
		this.casServerLogoutUrl = casServerLogoutUrl;
	}

	public String getLocalServerUrlPrefix() {
		return localServerUrlPrefix;
	}

	public void setLocalServerUrlPrefix(String localServerUrlPrefix) {
		this.localServerUrlPrefix = localServerUrlPrefix;
	}

	public String getCasFilterUrlPattern() {
		return casFilterUrlPattern;
	}

	public void setCasFilterUrlPattern(String casFilterUrlPattern) {
		this.casFilterUrlPattern = casFilterUrlPattern;
	}

	public String getLocalServerLoginUrl() {
		return localServerLoginUrl;
	}

	public void setLocalServerLoginUrl(String localServerLoginUrl) {
		this.localServerLoginUrl = localServerLoginUrl;
	}

	public String getCasService(){
		return localServerUrlPrefix + casFilterUrlPattern;
	}
}
