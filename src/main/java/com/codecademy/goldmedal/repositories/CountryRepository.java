package com.codecademy.goldmedal.repositories;
import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.*;
import java.util.Optional;
import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Integer>{
    Optional<Country> findCountryByName(String name);

    List<Country> findAllByOrderByNameAsc();
    List<Country> findAllByOrderByNameDesc();
    List<Country>  findAllByOrderByGdpAsc();
    List<Country>  findAllByOrderByGdpDesc();

    List<Country> findAllByOrderByPopulationAsc();
    List<Country> findAllByOrderByPopulationDesc();


}
