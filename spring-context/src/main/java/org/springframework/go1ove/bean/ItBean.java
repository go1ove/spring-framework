package org.springframework.go1ove.bean;

/**
 * @author go1ove
 */
public class ItBean {

	private Bean bean;

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}
