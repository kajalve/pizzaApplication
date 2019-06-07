package in.ac.sharda.Demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productlistcontroller {
	public class ProductListController{
		@GetMapping("/products/list")
		public List<Products> products(){
			List<Products>products=new ArrayList();
			for(int i=1;i<20;i++){
				products.add(
						new Products(i,i*10,"Name"+i,"Desc"+i));
			}
			return products;
	
		}
	}
}


