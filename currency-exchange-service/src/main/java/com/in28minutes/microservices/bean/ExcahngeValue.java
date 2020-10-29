package com.in28minutes.microservices.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "exchange_value")
public class ExcahngeValue {
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="conversion_multiple")
	private BigDecimal conversionMutilple;
	@Column(name="port")
	private int port;
	public ExcahngeValue() {
		// TODO Auto-generated constructor stub
	}
	public ExcahngeValue(Long id, String from, String to, BigDecimal conversionMutilple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutilple = conversionMutilple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMutilple() {
		return conversionMutilple;
	}
	public void setConversionMutilple(BigDecimal conversionMutilple) {
		this.conversionMutilple = conversionMutilple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
