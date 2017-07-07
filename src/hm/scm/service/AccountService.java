package hm.scm.service;

import hm.scm.entity.Account;

public interface AccountService extends BaseService<Account> {

	public Account login(Account account);

}
