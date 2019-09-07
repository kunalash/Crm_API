package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class organizationWorkersControllerImpl {

	@RequestMapping("rest")
	public String getOrganization() {
		return "dsfk";
	}
}