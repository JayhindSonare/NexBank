package com.project.Bank.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Bank.entity.Account;

@Repository
public interface AccountDao extends CrudRepository<Account, Integer> {

}
