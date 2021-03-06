package spring.main;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.service.CollectionDIService;

public class TestCollectionDI {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/di/config/collection.xml");
		System.out.println("--list--");
		CollectionDIService service = (CollectionDIService)ctx.getBean("collection1");
		for(Object o:service.getList()){
			System.out.println(o);
		}
		System.out.println("--map--");
		service = (CollectionDIService)ctx.getBean("collection2");
		Map map = service.getMap();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+"-"+value);
		}
		
		System.out.println("--properties--");
		Properties props = service.getProps();
		Enumeration en = props.propertyNames();
		while(en.hasMoreElements()){
			String key = (String)en.nextElement();
			String value = props.getProperty(key);
			System.out.println(key+" - "+value);
		}
		
		System.out.println("--util list--");
		service = (CollectionDIService)ctx.getBean("collection3");
		List list = service.getList();
		System.out.println(list);
	}
}
