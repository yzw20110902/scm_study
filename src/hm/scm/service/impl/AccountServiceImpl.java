package hm.scm.service.impl;

import hm.scm.dao.AccountMapper;
import hm.scm.entity.Account;
import hm.scm.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public int insert(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Account select(Account entity) {
		// TODO Auto-generated method stub
		return accountMapper.select(entity);
	}

	@Override
	public Account login(Account account) {
		// TODO Auto-generated method stub
		return accountMapper.login(account);
	}

}
