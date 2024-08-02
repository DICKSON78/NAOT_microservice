package com.currecyexchange.Module;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
@Entity
@Table(name = "currency_exchange")
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from_data")
    private String from;

    @Column(name = "to_data")
    private String to;
    @Column(name = "Conversion_Multiple")
    private BigDecimal conversionMultiple;
    @Column (name = "port")
    private int port;
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

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }






}

