package com.currencyconversion.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
@FeignClient(name="currency-exchange-service", url="localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @Autowired
     CurrencyExchangeServiceProxy proxy = null;

}
