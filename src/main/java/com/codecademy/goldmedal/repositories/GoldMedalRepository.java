package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.*;


public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> findMedalAllByCountryOrderByYearAsc(String country);
    List<GoldMedal> findMedalAllByCountryOrderBySeasonAsc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByCityAsc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByNameAsc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByEventAsc(String country);
    List<GoldMedal> findMedalAllByCountry(String country);

}
