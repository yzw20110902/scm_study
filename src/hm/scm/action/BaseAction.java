package hm.scm.action;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseAction {

	@Resource
	ServletContext application;

	@RequestMapping("/goURL/{folder}/{file}")
	public String goURL(@PathVariable String folder, @PathVariable String file) {

		System.out.println("goURL.folder|file===" + folder + "/" + file);
		return "forward:/WEB-INF/" + folder + "/" + file + ".jsp";

	}

}
