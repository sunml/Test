package ml.mvc.controler;

import java.io.IOException;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ml.model.Product;
import ml.model.User;
import ml.services.ProductService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired(required = true)
	@Qualifier("bikeService")
	private ProductService productService;

	@RequestMapping("/contro1")
	public void contro1(Writer writer) {
		try {
			User user = productService.getUserById(1);
			Product product = productService.getProduct();
			writer.write("<div><h1>mvc1</h1></div>");
			writer.write("<div>" + product.getType() + "</div>");
			writer.write("<div>" + user.getUsername() + "</div>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(path = "/contro2", method = RequestMethod.GET)
	public String contro2() {
		return "mvc";
	}

	@RequestMapping("/contro3")
	public String contro3(Model model) {
		// @RequestParam, @RequestHeader, @PathVariable
		model.addAttribute("message", "Hello World!");
		return "mvc";
	}

	/**
	 * params will narrowing the primary mapping. eg:"myParam", "!myParam",
	 * "myParam=myValue","myParam!=myValue"
	 * 
	 * @return
	 */
	@RequestMapping(path = "/contro4", params = "username", method = RequestMethod.GET)
	public String contro4() {
		return "mvc";
	}

	@RequestMapping(path = "/contro5", method = RequestMethod.GET)
	public String contro5() {
		return "mvc";
	}

	/** getter setter */

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
