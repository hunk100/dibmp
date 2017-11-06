package cn.mldn.dibmp.service;

import java.util.Set;

import cn.mldn.dibmp.vo.Goods;

public interface ISaleService {
	public Set<Goods> getAllGoods() ;
	/**
	 * 根据商品编号添加至redis数据库中
	 * @return
	 */
	public boolean preDelivery(String mid,Long gid);
}
