package cn.mldn.dibmp.web.action.hjj;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.mldn.dibmp.service.ISaleService;
import cn.mldn.util.action.abs.AbstractAction;
@Controller
@RequestMapping("/pages/back/admin/goods/")
public class SaleAction extends AbstractAction{
	private static final String TITLE = "商品" ;
	@Resource
	private ISaleService saleService;
	
	@ResponseBody
	@RequestMapping("preDelivery")
	public Object preDelivery(Long gid) {
		 String mid = (String) SecurityUtils.getSubject().getSession().getAttribute("mid");
		 System.err.println(mid);
		 boolean flag = saleService.preDelivery(mid, gid);
		 return flag;
	}
}
