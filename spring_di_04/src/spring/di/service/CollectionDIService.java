package spring.di.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionDIService {
	public static final int BLACK=0;
	public static final String MALE = "남성";
	
	private List list;
	private Map map;
	private Properties props;
	
	public CollectionDIService(){}
	public CollectionDIService(List list){
		this.list = list;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
}
