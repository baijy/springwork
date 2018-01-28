package cn.jianyu.spring3.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	/**
	 * 转出方法
	 * @param from
	 * @param money
	 */
	public void out(String from, Double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, from);
		System.out.println("转出方法已执行");
	}
	/**
	 * 转入方法
	 * @param to
	 * @param money
	 */
	public void in(String to, Double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money,to);
		System.out.println("转入方法已执行");
	}
	
}
