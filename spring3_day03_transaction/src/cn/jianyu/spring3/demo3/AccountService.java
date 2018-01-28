package cn.jianyu.spring3.demo3;

public interface AccountService {
	/**
	 * 转账的方法
	 * @param from 转出账户
	 * @param to 转入账户
	 * @param money 转账金额
	 */
	public void transfer(String from, String to ,Double money);
	
}
