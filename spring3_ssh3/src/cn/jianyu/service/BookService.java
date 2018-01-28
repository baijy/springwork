package cn.jianyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jianyu.dao.BookDao;
import cn.jianyu.vo.Book;

@Transactional
@Service("bookService")
public class BookService {
	@Autowired
	@Qualifier("bookDao")
	private BookDao bookDao;
	
	public void add(Book book) {
		System.out.println("Service层的add方法执行了");
		bookDao.save(book);
	}

}
