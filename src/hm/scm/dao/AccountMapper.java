package hm.scm.dao;

import hm.scm.entity.Account;

public interface AccountMapper extends BaseMapper<Account> {

	public Account login(Account account);
}
