package cn.mldn.dibmp.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.dibmp.dao.ICitemDAO;
import cn.mldn.dibmp.dao.ICityDAO;
import cn.mldn.dibmp.dao.ICsourceDAO;
import cn.mldn.dibmp.dao.ICustomerDAO;
import cn.mldn.dibmp.dao.IProvinceDAO;
import cn.mldn.dibmp.service.ICustomerService;
import cn.mldn.dibmp.vo.Citem;
import cn.mldn.dibmp.vo.City;
import cn.mldn.dibmp.vo.Csource;
import cn.mldn.dibmp.vo.Customer;
import cn.mldn.dibmp.vo.Province;
import cn.mldn.util.service.abs.AbstractService;
@Service
public class CustomerServiceImpl extends AbstractService implements ICustomerService {
	@Resource
	private ICustomerDAO customerDAO;
	@Resource
	private IProvinceDAO provinceDAO;
	@Resource
	private ICsourceDAO csourceDAO;
	@Resource
	private ICitemDAO citemDAO;
	@Resource
	private ICityDAO cityDAO;
	@Override
	public List<Customer> listAll() {
		return customerDAO.listAll();
	}

	
/**
 * 	预加载处理,增加客户前 获取客户来源,所在省份,客户重要性,分别于三组list中存储,
 *  需要三张表一张为csrouce,province,citem三组表
 */
	@Override
	public Map<String, Object> preAdd() {
		List<Csource> allCsources = csourceDAO.listAll();
		List<Province> allProvinces = provinceDAO.listAll();
		List<Citem> allCitems = citemDAO.listAll();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("allCsources", allCsources);
		map.put("allProvinces", allProvinces);
		map.put("allCitems", allCitems);
		return map;
	}

	@Override
	/**
	 * 通过省份获取城市内容
	 */
	public List<City> listCity(Long pid) {
		return cityDAO.listCity(pid);
	}
	@Override
	public boolean add(Customer customer) {

		customer.setindate(new Date());
		customer.setConnum(1);
		return customerDAO.add(customer);
	}


	@Override
	public Map<String, Object> listAllCustomers(String column, String keyWord, long currentPage, int lineSize) {
		Map<String,Object> map = super.forSearch(column, keyWord, currentPage, lineSize);
		List<Customer> list = customerDAO.findBySplit(map);
		Long allCounts = customerDAO.getAllCounts(map);
		Map<String,Object> result = new HashMap<>();
		result.put("allCustomers", list);
		result.put("allCounts", allCounts);
		return result;
	}

}
