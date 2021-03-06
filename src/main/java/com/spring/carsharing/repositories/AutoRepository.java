package com.spring.carsharing.repositories;

import com.spring.carsharing.models.Auto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface AutoRepository extends JpaRepository<Auto, Integer> {

    void deleteByAutoId(Integer autoId);

    Auto findByAutoId(Integer autoId);

    List<Auto> findByNumberOfSeatsGreaterThanEqualAndDailyPriceLessThanEqualAndDailyPriceGreaterThanEqualAndAvailableIsOrderByAutoIdDesc(
            int seats, double maxDailyPrice, double minDailyPrice, boolean available);
}
