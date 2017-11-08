package cn.mldn.dibmp.dao;

import java.util.List;

import cn.mldn.dibmp.vo.Province;

public interface IProvinceDAO {
	/**
	 * 显示所有的省份的信息
	 * @return
	 */
	public List<Province> listAll() ;
}	
