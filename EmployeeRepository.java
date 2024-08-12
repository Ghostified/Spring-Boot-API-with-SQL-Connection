package FinalProjectSQL.demo;

import FinalProjectSQL.demo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Custom query methods (if needed) can be defined here
}