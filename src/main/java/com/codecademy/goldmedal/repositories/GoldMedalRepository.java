package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.*;


public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {

}
