package com.example.annotations;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/product")
public class demo {
	
	List<Helper> l = new ArrayList<Helper>();
	
	@GetMapping("/demo")
	public String method() {
		return "Through rest";
	}
	
	@GetMapping("/default")
	public Helper defaultMethod() {
		Helper p = new Helper();
		p.setId(2);
		p.setName("Product 1");
		p.setPrice(23);
		l.add(p);
		return p;
}
	
	@GetMapping("/list")
	public List getList() {
		return l;
	}
	
	@PostMapping("/add")
	public List getList(@RequestBody Helper h) {
		l.add(h);
		return l;
	}
	
	
	private Helper getProduct(int id) {
		
		for(int i=0; i<l.size(); i++) {
			Helper h = l.get(i);
			if(h.getId() == id) {
				return h;
			}
		}
		
		return null;
	}
	@PutMapping("/put/{id}")
	public List putList(@PathVariable int id, @RequestBody Helper h) {
		Helper product = getProduct(id);
		product.setId(2);
		product.setName("dsf");
		product.setPrice(625);
		return l;
	}
}

