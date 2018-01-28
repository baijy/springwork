package cn.jianyu.spring3.demo3;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	/**
	 * 转账的方法
	 * @param from 转出账户
	 * @param to 转入账户
	 * @param money 转账金额
	 */
	public void transfer(String from, String to, Double money) {
		accountDao.out(from, money);
		//double  i = 1/0;
		accountDao.in(to, money);
	}
	

	/*通过setter方法注入*/
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
