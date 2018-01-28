package cn.jianyu.spring3.demo3;

public interface AccountDao {
	/**
	 * 转出方法
	 * @param from
	 * @param money
	 */
	public void out(String from ,Double money);
	/**
	 * 转入方法
	 * @param to
	 * @param money
	 */
	public void in(String to,Double money);
	
	
}
