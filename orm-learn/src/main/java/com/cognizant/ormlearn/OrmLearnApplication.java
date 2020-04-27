package com.cognizant.ormlearn;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.Service.DepartmentService;
import com.cognizant.ormlearn.Service.EmployeeService;
import com.cognizant.ormlearn.Service.SkillService;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.Service.AttemptService;
import com.cognizant.ormlearn.Service.CountryService;
import com.cognizant.ormlearn.Service.StockService;
import com.cognizant.ormlearn.Service.Exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.model.AttemptQuistion;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Stock;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	private static StockService stockService;
	
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	private static AttemptService attemptService;
	public static void main(String[] args) throws CountryNotFoundException{
		
		ApplicationContext context =  SpringApplication.run(OrmLearnApplication.class, args);
		countryService =  context.getBean(CountryService.class);
		
		stockService = context.getBean(StockService.class);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		attemptService = context.getBean(AttemptService.class);
		
		//testGetAllCountries();
		//testGetCountry();
		//testAddCountry();
		//testUpdateCountry();
		//testDeleteCountry();
		//testFindByNameOrderBy();
		//testFindByAlphaOrderBy();

// Stock Function Test IN main
		//testFindAllFBStockTillSep();
		//testFindGoogleStockGT1250();
		//testFindTop3ByOrderByVolumeDesc();
		//testFindTop3ByCodeOrderByClose();
// Payroll Table Test
		  //testGetEmployee();
//		  testSaveEmployee();
		  //testUpdateEmployee();
		  //testGetDepartment();
		  //testAddSkillToEmployee();
		//testGetAllPermanentEmployees();
//			testAverageSalary();
//			testGetAverageSalary();
//			testGetAllEmployeesNative();
		testAttemptServiceGetAttempt();
		LOGGER.info("Inside main");
	}
		

	public static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> c = countryService.getAllCountries();
		LOGGER.debug("countries={}", c);
		LOGGER.info("End");
	}
	
	public static void testGetCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country c= countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", c);
		LOGGER.info("End");
	}
	
	public static void testAddCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country c= new Country("KD", "KANISHKA DAS");
		countryService.addCountry(c);
		Country con = countryService.findCountryByCode("KD");
		LOGGER.debug("Country:{}", con);
		LOGGER.info("End");
	}
	
	public static void testUpdateCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		countryService.updateCountry("KD", "KRISHNA DAS");
		Country c= countryService.findCountryByCode("KD");
		LOGGER.debug("Country:{}", c);
		LOGGER.info("End");
	}
	
	public static void testDeleteCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		countryService.deleteCountry("IN");
		LOGGER.info("IN Deleted");
		testGetAllCountries();
		LOGGER.info("End");
	}

	public static void testFindByNameOrderBy() {
		LOGGER.info("Start");
		List<Country> c =  countryService.findByNameOrderBy("ou");
		LOGGER.debug("countries={}", c);
		LOGGER.info("End");
	}
	
	public static void testFindByAlphaOrderBy() {
		LOGGER.info("Start");
		List<Country> c  = countryService.findByAlphaOrderBy("Z");
		LOGGER.debug("countries={}", c);
		LOGGER.info("End");
	}
// Stock Functions:
	public static void testFindAllFBStockTillSep() {
		LOGGER.info("Start");
		List<Stock> s = stockService.findAllFBStockTillSep();
		LOGGER.debug("Stocks={}", s);
		LOGGER.info("End");
	}
	
	public static void testFindGoogleStockGT1250() {
		LOGGER.info("Start");
		List<Stock> s = stockService.findGoogleStockGT1250();
		LOGGER.debug("Stocks={}", s);
		LOGGER.info("End");
	}
	
	public static void testFindTop3ByOrderByVolumeDesc() {
		LOGGER.info("Start");
		List<Stock> s = stockService.findTop3ByOrderByVolumeDesc();
		LOGGER.debug("Stocks={}", s);
		LOGGER.info("End");
	}
	
	public static void testFindTop3ByCodeOrderByClose() {
		LOGGER.info("Start");
		List<Stock> s= stockService.findTop3ByCodeOrderByClose("FB");
		LOGGER.debug("Stocks= {}", s);
		LOGGER.info("End");
	}
	
	public static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		LOGGER.debug("Emplyee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}
	
	public static void testSaveEmployee() {
		LOGGER.info("Start");
		Department d = departmentService.getId(1);
		//Employee e = employeeService.get(1);
		Employee e = new Employee();
		e.setName("Kanishka");
		e.setPermanent(true);
		e.setDateOfBirth(new Date());
		e.setSalary(5000.00);
		e.setDepartment(d);
		employeeService.save(e);
		LOGGER.debug("Emplyee={}", e);
		LOGGER.debug("Department={}", e.getDepartment());
		LOGGER.info("End");
	}
	
	private static void testUpdateEmployee() {
		LOGGER.info("Start");
		Department d = departmentService.getId(2);
		Employee e = employeeService.get(1);
		e.setName("Akash Das");
		e.setPermanent(true);
		e.setDateOfBirth(new Date());
		e.setSalary(3000.00);
		e.setDepartment(d);
		LOGGER.debug("Employee:{}", e);
		LOGGER.debug("Department:{}",e.getDepartment());
		LOGGER.info("End");
	}
	
	private static void testGetDepartment() {
		LOGGER.info("Start");
		Department department = departmentService.getId(2);
		LOGGER.debug("Department:{}", department);
		LOGGER.debug("Department:{}", department.getEmployeeList());
		LOGGER.info("End");
	}

	private static void testAddSkillToEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		Skill skill = skillService.getId(3);
		Set<Skill> skillList = employee.getSkillList();
		skillList.add(skill);
		employee.setSkillList(skillList);
		System.out.println(employee.getSkillList());
		employeeService.save(employee);
		LOGGER.info("End");
	}
	
	public static void testGetAllPermanentEmployees() {
		LOGGER.info("Start");
		List<Employee> e = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}", e);
		e.forEach(emp -> LOGGER.debug("Skills:{}", emp.getSkillList()));
		LOGGER.info("End");

		}
	
	public static void testAverageSalary() {
		LOGGER.info("Start");
		double sal = employeeService.getAvgSalary();
		LOGGER.debug("Average Salary:{}", sal);
		LOGGER.info("End");
	}
	public static void testGetAverageSalary() {
		LOGGER.info("Start");
		double sal = employeeService.getAvgSalary(1);
		LOGGER.debug("Average Salary:{}", sal);
		LOGGER.info("End");
	}

	public static void testGetAllEmployeesNative() {
		LOGGER.info("Start");
		List<Employee> e = employeeService.getAllEmployeesNative();
		LOGGER.debug("Employees:{}", e);
		LOGGER.info("End");
	}

	
	public static void testAttemptServiceGetAttempt() {
		LOGGER.info("Start");
		Attempt attempt = attemptService.getAttempt(1, 1);
		LOGGER.debug("Attempt:{}", attempt);
		Set<AttemptQuistion> attemptQuestionList = attempt.getAttemptQuistionList();
		LOGGER.debug("AttemptQuestions:{}", attemptQuestionList);
		attemptQuestionList.forEach((x)->LOGGER.debug("AttemptQuestions:{}", x.getAttemptOption()));
		LOGGER.info("End");
	}

}
