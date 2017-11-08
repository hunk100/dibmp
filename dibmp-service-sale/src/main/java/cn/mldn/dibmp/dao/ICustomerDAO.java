package cn.mldn.dibmp.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.dibmp.vo.Customer;

public interface ICustomerDAO {
	/**
	 * 数据层返回 客户集合
	 * @return 客户集合
	 */
	public List<Customer> listAll() ;
	

	public List<Customer> findBySplit(Map<String,Object> splitField) ;
	
	/**
	 * 增加雇员
	 * @param customer  雇员vo
	 * @return 返回true和false
	 */
	public boolean add(Customer customer);
	
	/**
	 * 分页的总数
	 * @param splitField
	 * @return
	 */
	public Long getAllCounts(Map<String,Object> splitField) ;
}
