package cn.mldn.dibmp.service;

import java.util.List;

import cn.mldn.dibmp.vo.Customer;

public interface ICustomerService {
	/**
	 * 返回list集合 客户信息
	 * @return 客户信息
	 */
	public List<Customer> listAll() ;

}
