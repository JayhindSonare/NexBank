package com.project.Bank.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Bank.dao.AccountDao;
import com.project.Bank.entity.Account;
import com.project.Bank.model.DebitCreditModel;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;

	public boolean createAccount(Account accountFromUser) {

		Optional<Account> optional = accountDao.findById(accountFromUser.getAccountNumber());

		if (optional.isEmpty()) {

			accountDao.save(accountFromUser);
			return true;

		} else {

			return false;

		}
	}

	public Account fetchAccount(Account accountFromUser) {

		Optional<Account> optional = accountDao.findById(accountFromUser.getAccountNumber());

		if (!optional.isEmpty()) {
			Account accountFromDb = optional.get();

			return accountFromDb;

		}

		return null;

	}

	public Account transactionAccount(DebitCreditModel modelFromUser) {

		Optional<Account> optional = accountDao.findById(modelFromUser.getAccountNumber());

		Account acc = optional.get();

		String tranType = modelFromUser.getTransactionType();

		long amount = modelFromUser.getAmount();

		long balance = acc.getBalance();

		if (!optional.isEmpty()) {

			if (tranType.equals("debit")) {

				acc.setBalance(balance -= amount);
				accountDao.save(acc);

			} else if (tranType.equals("credit")) {

				acc.setBalance(balance += amount);
				accountDao.save(acc);

			}
			
			return acc;

		}
		
		else
			return null;

	}

}
