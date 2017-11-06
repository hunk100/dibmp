package cn.mldn.dibmp.dao;

import java.util.List;

import cn.mldn.dibmp.vo.Customer;

public interface ICustomerDAO {
	/**
	 * 数据层返回 客户集合
	 * @return 客户集合
	 */
	public List<Customer> listAll() ;
}
