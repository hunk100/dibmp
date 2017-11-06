package cn.mldn.dibmp.dao;

import java.util.Set;

import cn.mldn.dibmp.vo.Goods;

public interface ISaleDAO {
	
	public Set<Goods> getAllGoods();
	/**
	 * 根据gid 去查询对应的商品详细信息
	 * @param gid 商品编号
	 * @return goods对象
	 */
	public Goods getByGid(Long gid);
	
}
