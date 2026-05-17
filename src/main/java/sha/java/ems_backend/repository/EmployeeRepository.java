package sha.java.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sha.java.ems_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
