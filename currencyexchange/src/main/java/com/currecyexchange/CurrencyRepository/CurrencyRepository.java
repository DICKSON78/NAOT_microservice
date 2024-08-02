package com.currecyexchange.CurrencyRepository;

import com.currecyexchange.Module.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CurrencyRepository extends JpaRepository<CurrencyExchange , Long> {
    Optional<CurrencyExchange> findByFromAndTo(@Param("from_Data") String from, @Param("to_data") String to);
}
