package cn.jianyu.springmvc.first;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.jianyu.springmvc.po.Items;

public class ItemController1 implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		List<Items> itemsList=new ArrayList<Items>();
		Items items_1 = new Items();
		items_1.setName("ThinkPad");
		items_1.setPrice(9700f);
		items_1.setDetail("ThinkPad 2784a34");
		
		Items items_2 = new Items();
		items_2.setName("iPhone");
		items_2.setPrice(6600f);
		items_2.setDetail("最新一代iPhone");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");
		
		return modelAndView;
	}
	
}
