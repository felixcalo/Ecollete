package com.apiEcollete.apiEcollete.apiControllers;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.apiEcollete.apiEcollete.pointsModel.Items;
import com.apiEcollete.apiEcollete.pointsModel.Points;
import com.apiEcollete.apiEcollete.pointsRepository.PointsRepository;
import com.apiEcollete.apiEcollete.pointsRepository.ItemsRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/api")
@Api(value="API points")
@CrossOrigin(origins ={ "http://localhost:3000" })
public class ControllersPoints {

	@Autowired
	PointsRepository PointsRepository;

	@Autowired
	ItemsRepository ItemsRepository;
	
	@GetMapping("/points")
	@ApiOperation(value="list all points")
	public List<Points> listPoints() {
		return PointsRepository.findAll();
	}	
	@GetMapping("/points/{id}")
	@ApiOperation(value="filtre a point")
	public Points FiltrePoints(@PathVariable(value="id") long id)
	{
		return PointsRepository.findById(id);
	}
	@DeleteMapping("/points/{id}")
	@ApiOperation(value="kill a point")
	public Points DeletePoints(@PathVariable(value="id") long id)
	{		
		return PointsRepository.deleteById(id);
	}
	
	@PostMapping("/points/inscrire")
	@ApiOperation(value="save a point")
	public Points SavePoints(@RequestBody Points points)
	{  
		return PointsRepository.save(points);
	}
	
	@GetMapping("/items")
	@ApiOperation(value="list all Items")
	public List<Items> listItems() {
		return ItemsRepository.findAll();
	}	

}
