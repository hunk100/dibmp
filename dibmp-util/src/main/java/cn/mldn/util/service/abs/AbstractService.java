package cn.mldn.util.service.abs;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务层继承的公共父类
 * @author YOOTK
 */
public abstract class AbstractService {
	/**
	 * 检测这个数据是否为用于查询
	 * @param args 字符串
	 * @return 返回boolean
	 */
	public boolean isLikeSearch(String args) {
		if(args == null  || args == "") {
			return false;
		}
		return true;
	}
	
	
	
	public Map<String,Object> forSearch(String column,String keyWord,Long currentPage,Integer lineSize) {
		Map<String,Object> map = new HashMap<>();
		map.put("column", column);
		map.put("keyWord", "%"+keyWord+"%");
		map.put("start", (currentPage -1) * lineSize);
		map.put("lineSize", lineSize);
		return map;
	}
}
