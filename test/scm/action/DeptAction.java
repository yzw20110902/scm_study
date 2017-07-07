package scm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scm.dao.Impl.DeptDaoImpl;
import scm.entity.Dept;

@Controller
@RequestMapping(value = "/dept")
public class DeptAction {

	@Resource
	private DeptDaoImpl deptDao;

	@RequestMapping(value = "/insert")
	public String insert(Dept dept) {

		deptDao.insertDept(dept);
		return "forward:/jsp/main.jsp";
	}
}
