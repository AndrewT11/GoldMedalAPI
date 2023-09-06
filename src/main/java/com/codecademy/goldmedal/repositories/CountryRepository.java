package com.codecademy.goldmedal.repositories;
import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.*;

public interface CountryRepository extends CrudRepository<Country, Integer>{

}
