package com.currecyexchange.Controller;
import com.currecyexchange.CurrencyRepository.CurrencyRepository;
import com.currecyexchange.Module.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CurrencyController {
    @Autowired
    private  final CurrencyRepository currencyRepository;
    @Autowired
   private final Environment environment;

    public CurrencyController( CurrencyRepository currencyRepository, Environment environment) {
        this.currencyRepository = currencyRepository;
        this.environment = environment;
    }

    @GetMapping("/CurrencyExchange/{from}to{to}")
    public ResponseEntity<Optional<CurrencyExchange>> getExchangeValues(@PathVariable String from, @PathVariable String to) {
        Optional<CurrencyExchange> currencyExchange = currencyRepository.findByFromAndTo(from, to);
        if (currencyExchange == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(currencyExchange);
    }
}
