package cn.jianyu.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jianyu.vo.Book;

public class BookDao extends HibernateDaoSupport {
	public void save(Book book) {
		System.out.println("DAO层的保存图书");
		this.getHibernateTemplate().save(book);
	}
	
}
