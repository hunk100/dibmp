package cn.mldn.dibmp.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.dibmp.dao.ISaleDAO;
import cn.mldn.dibmp.service.ISaleService;
import cn.mldn.dibmp.vo.Goods;
@Service
public class SaleServiceImpl implements ISaleService{
	@Resource
	private ISaleDAO saleDAO;
	
	@Override
	public Set<Goods> getAllGoods() {
		return saleDAO.getAllGoods();
	}

}
