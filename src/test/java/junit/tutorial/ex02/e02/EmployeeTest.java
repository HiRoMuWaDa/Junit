package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() throws FileNotFoundException {
		InputStream input = new FileInputStream("C:\\env\\springworkspace\\junit\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");
		List<Employee> employeeList = Employee.load(input);
		Employee emp = employeeList.get(0);
		
		assertAll(
			() -> assertEquals("Ichiro", emp.getFirstName(), "FirstName"),
			() -> assertEquals("Tanaka", emp.getLastName(), "LastName"),
			() -> assertEquals("ichiro@example.com", emp.getEmail(), "email")
		);
	}

}
