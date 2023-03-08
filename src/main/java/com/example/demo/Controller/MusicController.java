package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProductMusic;
import com.example.demo.Repository.MusicRepository;



@CrossOrigin(origins="http://localhost:3002")
@RestController
@RequestMapping("/")
public class MusicController {
	@Autowired
	MusicRepository repo;
	
	@GetMapping("/")
	public List<ProductMusic> getAllEmp(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public ProductMusic createEmployee(@RequestBody ProductMusic x) {
		return repo.save(x);
	}
	
	@GetMapping("/{id}")
	public Optional<ProductMusic> getEmpbyId(@PathVariable int id){
		Optional<ProductMusic> temp=repo.findById(id);
		return temp;
	}
	
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody ProductMusic upd) {
		if(repo.existsById(id)) {
			ProductMusic t=new ProductMusic();
			t.setId(id);
			t.setCustomerId(upd.getCustomerId());
			t.setItemName(upd.getItemName());
			t.setPrice(upd.getPrice());
			t.setQuantity(upd.getQuantity());
			repo.save(t);
		}
		return " ";
	}
	@DeleteMapping("/{id}")
	public String removeEmp(@PathVariable int id) {
		if(repo.existsById(id)) 
		{
			repo.deleteById(id);
		    return "Id deleted";
			}
			else
			{
				return "Id not exists";
			}
		}
	}