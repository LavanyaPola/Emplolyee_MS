package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	

}
