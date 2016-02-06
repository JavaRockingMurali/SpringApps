package com.shop.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_products")
public class shop_Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4089885517135471935L;
	private int pid;
	private String pname;
	private String pbrand;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRO_Id",nullable=false,unique=true)
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Column(name="PRO_Name")
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Column(name="PRO_Brand",nullable=false,unique=true)
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	
	

}
