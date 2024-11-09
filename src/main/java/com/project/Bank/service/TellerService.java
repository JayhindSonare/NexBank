package com.project.Bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Bank.dao.TellerDao;
import com.project.Bank.entity.Teller;

@Service
public class TellerService {

	@Autowired
	private TellerDao tellerDao;

	public Boolean createTeller(Teller tellerFromUser) {

		Optional<Teller> optional = tellerDao.findById(tellerFromUser.getTellerId());

		if (optional.isEmpty()) {

			tellerDao.save(tellerFromUser);
			return true;

		} else {

			return false;

		}

	}

	public Boolean findId(Teller tellerFromUser) {

		Teller tellerFromDb = tellerDao.findById(tellerFromUser.getTellerId()).get();

		if (tellerFromUser.getPassword().equals(tellerFromDb.getPassword())) {

			return true;
		}
		return false;

	}

}
