package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.*;


public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> findMedalByCountryOrderByYearAsc(String country);
    List<GoldMedal> findMedalByCountryOrderBySeasonAsc(String country);
    List<GoldMedal> findMedalByCountryOrderByCityAsc(String country);
    List<GoldMedal> findMedalByCountryOrderByNameAsc(String country);
    List<GoldMedal> findMedalByCountryOrderByEventAsc(String country);
    List<GoldMedal> findMedalByCountryOrderByYearDesc(String country);
    List<GoldMedal> findMedalByCountryOrderBySeasonDesc(String country);
    List<GoldMedal> findMedalByCountryOrderByCityDesc(String country);
    List<GoldMedal> findMedalByCountryOrderByNameDesc(String country);
    List<GoldMedal> findMedalByCountryOrderByEventDesc(String country);

    Integer countByCountry(String country);

    Integer findByCountryAndSeasonOrderByYearAsc(String country, String season);
    Integer countBySeason(String season);

    Integer countBySeasonOrderByYearAsc(String season);

    Integer countByGender(String gender);
}
