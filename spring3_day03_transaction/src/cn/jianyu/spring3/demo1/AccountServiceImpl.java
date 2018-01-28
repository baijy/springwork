package cn.jianyu.spring3.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	/*事务管理*/
	private TransactionTemplate transactionTemplate;
	
	/**
	 * 转账的方法
	 * @param from 转出账户
	 * @param to 转入账户
	 * @param money 转账金额
	 */
	public void transfer(final String from, final String to, final Double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.out(from, money);
				double  i = 1/0;
				accountDao.in(to, money);
			}
		});
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	/*通过setter方法注入*/
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
