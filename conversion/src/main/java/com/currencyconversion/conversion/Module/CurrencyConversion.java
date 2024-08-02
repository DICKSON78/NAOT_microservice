package com.currencyconversion.conversion.Module;

import java.math.BigDecimal;

public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal ConversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversion(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        ConversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return ConversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }




}
