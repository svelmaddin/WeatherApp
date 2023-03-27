package com.elmaddin.weather.repository;

import com.elmaddin.weather.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeatherRepository extends JpaRepository<WeatherEntity ,String > {

    Optional<WeatherEntity> findFirstByRequestedCityNameOrderByUpdateTimeDesc(String city);

}
