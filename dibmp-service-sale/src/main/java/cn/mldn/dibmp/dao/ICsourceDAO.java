package cn.mldn.dibmp.dao;

import java.util.List;

import cn.mldn.dibmp.vo.Csource;

public interface ICsourceDAO {
	/**
	 * 显示所有的客户来源
	 * @return  返回客户来源信息
	 */ 
	public List<Csource> listAll() ;
}
