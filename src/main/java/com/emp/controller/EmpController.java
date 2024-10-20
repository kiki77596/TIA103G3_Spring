package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.EmpVo;

@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RestController
public class EmpController {

	@Autowired
	EmpService eService;

	@GetMapping("/getEmps")
	public ResponseEntity<List<EmpVo>>getEmps() {
	  return ResponseEntity.ok(eService.getEmps());
	}
	@PostMapping("/getEmp")
	public ResponseEntity<EmpVo> getEmp(@RequestBody Integer id){
		return ResponseEntity.ok(eService.getEmp(id));
	}
}
