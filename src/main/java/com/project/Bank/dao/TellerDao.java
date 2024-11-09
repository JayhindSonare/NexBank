package com.project.Bank.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Bank.entity.Teller;

@Repository
public interface TellerDao extends CrudRepository<Teller, Integer> {

}
