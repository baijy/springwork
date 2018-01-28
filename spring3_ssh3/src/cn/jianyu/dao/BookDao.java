package cn.jianyu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.jianyu.vo.Book;

@Repository("bookDao")
public class BookDao {
	
	@Autowired
	@Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save(Book book) {
		System.out.println("DAO层的save方法执行了");
		hibernateTemplate.save(book);
	}

}
