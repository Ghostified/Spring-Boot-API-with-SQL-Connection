package FinalProjectSQL.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Endpoint to retrieve a specific employee by employee_number
    //http://localhost:8080/api/employees/1
    @GetMapping("/{employee_number}")
    public Employee getEmployeeByNumber(@PathVariable("employee_number") int employee_number) {
        Optional<Employee> employee = employeeRepository.findById(employee_number);
        return employee.orElse(null); // Return null if not found, or handle as needed
    }

    // Endpoint to retrieve all employees
    //http://localhost:8080/api/employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
