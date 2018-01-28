package cn.jianyu.service;

import org.springframework.transaction.annotation.Transactional;

import cn.jianyu.dao.BookDao;
import cn.jianyu.vo.Book;

@Transactional
public class BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void add(Book book) {
		System.out.println("service层的add方法执行了");
		bookDao.save(book);
	}
	
}
