package cn.mldn.dibmp.service;

import java.util.List;
import java.util.Map;

import cn.mldn.dibmp.vo.City;
import cn.mldn.dibmp.vo.Customer;

public interface ICustomerService {
	/**
	 * 返回list集合 客户信息
	 * @return 客户信息
	 */
	public List<Customer> listAll() ;
	

	/**
	 * 预加载 增加页面所需要的信息内容
	 * @return   返回与之对应的三大内容   重要性,省份 ,客户来源
	 */
	public Map<String,Object> preAdd() ;
	
	/**
	 * 根据省份pid列出所有的城市
	 * @param pid 省份pid
	 * @return
	 */
	public List<City> listCity(Long pid);
	
	
	public boolean add(Customer vo);
	/**
	 * 分页查询
	 * @param column
	 * @param keyWord
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public Map<String, Object> listAllCustomers(String column, String keyWord, long currentPage, int lineSize);
}
