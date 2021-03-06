package org.yhb.util;

import org.springframework.context.ApplicationContext;

public class BeanFactory{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static BeanFactory factory=null;
	private static ApplicationContext context=null;
	
	private BeanFactory(){
		
	}
	
	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		BeanFactory.context = context;
	}

	public static Object getBean(String name){
		return context.getBean(name);
	}
	public static <T> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
	public static BeanFactory getInstance(){
		return Inner.getInstance();
	}
	private static class Inner{
		public static BeanFactory getInstance(){
			factory=new BeanFactory();
			return factory;
		}
	}
}
