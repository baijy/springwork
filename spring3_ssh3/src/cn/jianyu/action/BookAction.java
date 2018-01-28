package cn.jianyu.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.jianyu.service.BookService;
import cn.jianyu.vo.Book;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace("/")
@ParentPackage("struts-default")
@Controller("bookAction")
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book>{
	private Book book = new Book();
	public Book getModel() {
		return book;
	}
	
	//在Action中注入Service
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Action(value="book_add")
	public String add(){
		System.out.println("web层的add方法执行了");
		bookService.add(book);
		return NONE;
	}
}
