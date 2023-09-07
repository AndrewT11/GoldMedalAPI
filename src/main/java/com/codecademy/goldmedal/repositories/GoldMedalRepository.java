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
    List<GoldMedal> findMedalAllByCountryOrderByYearDesc(String country);
    List<GoldMedal> findMedalAllByCountryOrderBySeasonDesc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByCityDesc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByNameDesc(String country);
    List<GoldMedal> findMedalAllByCountryOrderByEventDesc(String country);

    Integer countByCountry(String country);

    Integer findByCountryAndSeasonOrderByYearAsc(String country, String season);
    Integer countBySeason(String season);

    Integer countBySeasonOrderByYearAsc(String season);

    Integer countByGender(String gender);
}
