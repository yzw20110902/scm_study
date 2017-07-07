package hm.scm.action;

import hm.scm.entity.Account;
import hm.scm.entity.Supplier;
import hm.scm.service.AccountService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountAction extends BaseAction {

	@Resource
	private AccountService accountService;

	@RequestMapping(value = "/login")
	public String login(Account account, HttpServletRequest request,
			HttpSession session) {
		System.out.println("--account--" + account);
		Account acc = accountService.login(account);
		if (acc != null) {
			session.setAttribute("account", acc);

			return "forward:/WEB-INF/main/main.jsp";
		} else {
			request.setAttribute("msg", "用户名或密码错误");

			return "forward:/login.jsp";
		}

	}

	@RequestMapping("/doAjax")
	@ResponseBody
	public Object doAjax(Supplier supplier) {

		System.out.println("--doAjax--" + supplier);
		supplier.setSupName("supName1");

		return supplier;
	}
}
