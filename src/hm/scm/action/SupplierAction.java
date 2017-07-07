package hm.scm.action;

import hm.scm.entity.Supplier;
import hm.scm.service.SupplierService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/supplier")
public class SupplierAction extends BaseAction {

	@Resource
	private SupplierService supplierService;

	@RequestMapping(value = "/insert")
	public String insert(Supplier supplier) {
		System.out.println("---action.supplier:" + supplier);

		try {
			supplierService.insert(supplier);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "forward:/jsp/main.jsp";
	}

	@RequestMapping(value = "/update")
	public String update(Supplier supplier) {
		System.out.println("---action.supplier:" + supplier);

		try {
			supplierService.update(supplier);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "forward:/jsp/main.jsp";
	}

	@RequestMapping("/doAjax")
	@ResponseBody
	public Object doAjax(Supplier supplier) {

		System.out.println("==supplier==" + supplier);

		supplier.setSupName("supName1");
		return supplier;

	}

}
