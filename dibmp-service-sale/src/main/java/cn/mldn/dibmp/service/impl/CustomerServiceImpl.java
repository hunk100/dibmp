package cn.mldn.dibmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.dibmp.dao.ICustomerDAO;
import cn.mldn.dibmp.service.ICustomerService;
import cn.mldn.dibmp.vo.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Resource
	private ICustomerDAO customerDAO;
	@Override
	public List<Customer> listAll() {
		return customerDAO.listAll();
	}

}
