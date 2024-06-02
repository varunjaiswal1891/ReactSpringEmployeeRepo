package io.javabrains.springreactemployeeapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.javabrains.springreactemployeeapp.models.Employee;
import io.javabrains.springreactemployeeapp.repository.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository empRepository;

    DatabaseLoader(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
        
    }

    @Override
    public void run(String... args) throws Exception {
        this.empRepository.save(new Employee("Shanvika", "Jaiswal", "ring bearer"));
        this.empRepository.save(new Employee("Amit", "Sahu", "sales person"));
    }
    
}
