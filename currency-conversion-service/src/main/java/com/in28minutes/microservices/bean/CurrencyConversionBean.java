package com.in28minutes.microservices.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMutilple;
	private BigDecimal quantity;
	private int port;
	private BigDecimal totalAmount;
	public CurrencyConversionBean() {
		
	}
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			int port, BigDecimal totalAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutilple = conversionMultiple;
		this.quantity = quantity;
		this.port = port;
		this.totalAmount = totalAmount;
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

	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}