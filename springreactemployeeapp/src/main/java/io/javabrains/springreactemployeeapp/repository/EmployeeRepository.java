package io.javabrains.springreactemployeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springreactemployeeapp.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
