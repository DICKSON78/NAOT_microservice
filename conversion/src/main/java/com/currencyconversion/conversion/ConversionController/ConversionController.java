package com.currencyconversion.conversion.ConversionController;

import com.currencyconversion.conversion.Module.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ConversionController {
    @GetMapping("/CurrencyConversion/{from}to{to}/{quantity}")
     //returns a bean back
    public CurrencyConversion Currency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
    {
        //setting variables to currency exchange service
        Map<String, String> uriVariables=new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        //calling the currency-exchange-service
        ResponseEntity<CurrencyConversion> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/CurrencyExchange/{from}to{to}", CurrencyConversion.class, uriVariables);
        CurrencyConversion response=responseEntity.getBody();

         //creating a new response bean and getting the response back and taking it into Bean
        return new CurrencyConversion(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
    }
}
