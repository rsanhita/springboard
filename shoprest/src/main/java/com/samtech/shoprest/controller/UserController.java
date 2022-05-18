
package com.samtech.shoprest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samtech.shoprest.comperator.DobComparator;
import com.samtech.shoprest.comperator.FirstNameComparator;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.model.Student;
import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.AccountRepository;
import com.samtech.shoprest.repository.UserRepository;
import com.samtech.shoprest.service.AcctMgmtService;
import com.samtech.shoprest.service.StudentService;
import com.samtech.shoprest.service.UserMngtService;

@Controller
public class UserController {

	// TODO excellent example of final
	private final UserMngtService userMgmtService;

	private final AcctMgmtService acctMgmtService;

	private final StudentService studentService;

	// private final AccountRepository accountRepository;

	// TODO - Through Autowire we are creating objects
	@Autowired
	public UserController(UserMngtService userMgmtService,
			// AccountRepository accountRepository,
			AcctMgmtService acctMgmtService, StudentService studentService) {

		System.out.println("****************************");
		System.out.println("INSIDE CONSTRUCTOR FOR User Controller.");
		System.out.println("****************************");

		this.userMgmtService = userMgmtService;
		this.acctMgmtService = acctMgmtService;
		this.studentService = studentService;

	}

	/*
	 * @GetMapping("/index") public String showUserList(Model model) {
	 * 
	 * System.out.println("***  Inside showUserList()....*");
	 * 
	 * // get the list of users from DB Iterable<User> users =
	 * userMgmtService.retrieveUserList();
	 * 
	 * // set the list of users in Model model.addAttribute("users", users);
	 * 
	 * // redirect to the intended page return "index"; }
	 * 
	 * @GetMapping("/signup") public String showSignUpForm(User user) {
	 * System.out.println("***  Inside showSignUpForm()....*"); return "add-user"; }
	 * 
	 * @PostMapping("/adduser") public String addUser(@Validated User user,
	 * BindingResult result, Model model) {
	 * 
	 * System.out.println("***  Inside addUser()....*"); if (result.hasErrors()) {
	 * return "add-user"; }
	 * 
	 * User savedUser = userMgmtService.addUser(user);
	 * 
	 * // userRepository.save(user); return "redirect:/index"; }
	 * 
	 * @GetMapping("/edit/{id}") public String showUpdateForm(@PathVariable("id")
	 * long id, Model model) {
	 * 
	 * // User user = userRepository.findById(id).orElseThrow(() -> new //
	 * IllegalArgumentException("Invalid user Id:" + id));
	 * 
	 * // retrieve the user from DB if it exists Optional<User> user =
	 * userMgmtService.findUserByID(id); if (user.isEmpty()) { throw new
	 * IllegalArgumentException("Invalid user Id:" + id); }
	 * 
	 * // set the user in the model model.addAttribute("user", user);
	 * 
	 * return "home"; }
	 * 
	 * @PostMapping("/update/{id}") public String updateUser(@PathVariable("id")
	 * long id, @Validated User user, BindingResult result, Model model) {
	 * 
	 * if (result.hasErrors()) { // user.setId(id); return "update-user"; }
	 * 
	 * userMgmtService.addUser(user);
	 * 
	 * return ("redirect:/index"); }
	 * 
	 * @GetMapping("/delete/{id}") public String deleteUser(@PathVariable("id") long
	 * id, Model model) { // User user = userRepository.findById(id).orElseThrow(()
	 * -> new // IllegalArgumentException("Invalid user Id:" + id)); // retrieve the
	 * user from DB if it exists
	 * 
	 * Optional<User> user = userMgmtService.findUserByID(id); if (user.isEmpty()) {
	 * throw new IllegalArgumentException("Invalid user Id:" + id); } else {
	 * 
	 * // userRepository.delete(user); userMgmtService.deleteUser(user.get());
	 * 
	 * }
	 * 
	 * return "redirect:/index"; }
	 */

	////////////// ACCTS realted mappings /////////////////////////

	// @GetMapping("/accts")
	/*
	 * public String showAccounts(Model model) {
	 * 
	 * 
	 * System.out.println("***  Inside showAccount()....*");
	 * 
	 * String[] acctNumbers = {"80539765","98765432","34568743","987543"};
	 * 
	 * //this is a dummycall Iterable<Account> accountlist =
	 * acctMgmtService.findByAcctNameandNumber("tuttu", Arrays.asList(acctNumbers));
	 * 
	 * //todo - change the call to repository //Iterable<Account> accounts =
	 * accountRepository.findAll(); List<Account> accounts =
	 * acctMgmtService.findAllNonBlankAccts();
	 * 
	 * // set the list of users in Model model.addAttribute("accounts", accounts);
	 * 
	 * // redirect to the intended page return "accts1"; }
	 */

	/*
	 * @GetMapping("/acct/{id}") public String showAccountsList(@PathVariable("id")
	 * long id, Model model) {
	 * 
	 * System.out.println("***  Inside showAccountsList()....id =*" +id);
	 * 
	 * Iterable<Account> accounts = acctMgmtService.retriveAccountById(id);
	 * 
	 * // set the list of users in Model // model.addAttribute("account", accounts);
	 * model.addAttribute("accounts", accounts);
	 * 
	 * // redirect to the intended page return "accts1"; }
	 * 
	 * @GetMapping("/exp/accts") public String doExperiemnts(Model model) {
	 * 
	 * System.out.println("***  Inside doExperiemnts()....*");
	 * 
	 * //todo - change the call to repository
	 * 
	 * List<Account> accounts = acctMgmtService.findAllNonBlankAccts();
	 * 
	 * List<Account> result = StreamSupport.stream(accounts.spliterator(), false)
	 * .collect(Collectors.toList());
	 * 
	 * for ( int i =0; i<result.size(); i++) {
	 * 
	 * System.out.println("email id :" + result.get(i).getEmail());
	 * 
	 * }
	 * 
	 * for (Account account : accounts) { System.out.println("email id :" +
	 * account.getEmail()); }
	 * 
	 * 
	 * model.addAttribute("accounts", accounts);
	 * 
	 * return "accts1"; }
	 * 
	 * //this endpoint will exclude non blank entries
	 * 
	 * @GetMapping("/exp/accts/nb") // Spring is using this model parameter. public
	 * String doEshowNonBlank(Model model) {
	 * 
	 * System.out.println("***  Inside doEshowNonBlank()....*");
	 * 
	 * 
	 * //get the list from DB Iterable<Account> accountsIterable =
	 * accountRepository.findAll();
	 * 
	 * //Create a place holder for the accountlist to be created List<Account>
	 * acctsList = new ArrayList<Account>();
	 * 
	 * //foreach loop for(Account account:accountsIterable) {
	 * 
	 * //add only the records that has valid name and number
	 * 
	 * if(StringUtils.isNotBlank(account.getAcctName()) &&
	 * StringUtils.isNotBlank(account.getAcctNumber())) { //add to the arraylist to
	 * be returned acctsList.add(account);
	 * 
	 * 
	 * } }
	 * 
	 * 
	 * //List<Account> acctsList = new ArrayList<Account>();
	 * 
	 * List<Account> acctsList = acctMgmtService.findAllNonBlankAccts(); // set the
	 * list of users in Model model.addAttribute("accounts", acctsList);
	 * 
	 * // redirect to the intended page return "accts1"; }
	 * 
	 * 
	 * @PostMapping("/addacct") public String addAcct(@Validated Account account,
	 * BindingResult result, Model model) {
	 * 
	 * System.out.println("***  Inside add Acct()....*");
	 * 
	 * if (result.hasErrors()) { return "add-acct"; }
	 * 
	 * //Account savedAccount = accountRepository.save(account);
	 * acctMgmtService.saveAccount(account);
	 * 
	 * System.out.println("Redirectring..########.."); // userRepository.save(user);
	 * return "redirect:/accts"; //return "home"; }
	 * 
	 * 
	 * @GetMapping("/acct/signup") public String showSignUpForm1(Account account) {
	 * 
	 * return "add-acct"; }
	 * 
	 * 
	 * @GetMapping("/acct/edit/{id}") public String editAccount(@PathVariable("id")
	 * long id, Model model) {
	 * 
	 * // User user = userRepository.findById(id).orElseThrow(() -> new //
	 * IllegalArgumentException("Invalid user Id:" + id));
	 * 
	 * // retrieve the user from DB if it exists //Optional<User> user =
	 * userMgmtService.findUserByID(id); Optional<Account> acct =
	 * acctMgmtService.retriveAccounts(id);
	 * 
	 * if (acct.isEmpty()) { throw new IllegalArgumentException("Invalid acct Id:" +
	 * id); }
	 * 
	 * // set the user in the model model.addAttribute("account", acct);
	 * System.out.println("redirecting to ");
	 * 
	 * return "update-acct"; }
	 * 
	 * @PostMapping("/editacct") public String editAcct(@Validated Account account,
	 * BindingResult result, Model model) {
	 * 
	 * System.out.println("***  Inside edit Acct()....*");
	 * 
	 * if (result.hasErrors()) { return "add-acct"; }
	 * 
	 * //Account savedAccount = accountRepository.save(account);
	 * acctMgmtService.saveAccount(account);
	 * 
	 * System.out.println("Redirectring..########.."); // userRepository.save(user);
	 * return "redirect:/accts"; //return "home"; }
	 */
///////	/ student related mapping/////////////////////

	@GetMapping("/students")
	public String showStudents(Model model) {

		System.out.println(" students");

//studentService.findAllStudents();

		Iterable<Student> studentList = studentService.findAllStudents();

		model.addAttribute("students", studentList);

		return "students";
	}

	@GetMapping("/stud/signup")
	public String addNewStudent(Student student) {

		return "add-stud";
	}

	@GetMapping("/stud/edit/{id}")
	public String editStudent(@PathVariable("id") long id, Model model) {

		Optional<Student> student1 = studentService.findStudentById(id);

		if (student1.isEmpty()) {
			throw new IllegalArgumentException();
		}

		model.addAttribute("students", student1);

		return "update-stud";

	}

	@PostMapping("/addstud")
	public String addstud(@Validated Student student, BindingResult result, Model model) {

		System.out.println("***  Inside add student()....*");

		if (result.hasErrors()) {
			return "add-stud";
		}

		studentService.saveStudent(student);

		// Account savedAccount = accountRepository.save(account);

		System.out.println("Redirectring..########..");
		// userRepository.save(user);
		return "redirect:/students";
		// return "home";
	}

	@PostMapping("/editstud")
	public String editStudent(@Validated Student student, BindingResult result, Model model) {

		if (result.hasErrors()) {

			return "add-stud";

		}
		studentService.saveStudent(student);

		return "redirect:/students";
	}

	@GetMapping("/stud/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id, Model model) {

		Optional<Student> student1 = studentService.findStudentById(id);
		if (student1.isEmpty()) {

			throw new IllegalArgumentException("invaid is---" + id);

		}

		studentService.deleteStudent(id);

		return "redirect:/students";

	}

	@GetMapping("/combined1")
	public String getAccountAndStudentVer1(Model model) {

		Iterable<Student> studentList = studentService.findAllStudents();

		List<Account> accountlist = acctMgmtService.findAllNonBlankAccts();

		List<Student> studs = new ArrayList<Student>();
		List<Account> accts = new ArrayList<Account>();

		for (Student student : studentList) {

			for (Account account : accountlist) {

				System.out.println("matching " + student.getId() + " with " + account.getId());
				if (student.getId() == account.getId()) {

					System.out.println("******match***** " + student.getId());

					studs.add(student);
					accts.add(account);
				}
			}
		}

		model.addAttribute("students", studs);
		model.addAttribute("accounts", accts);
		return "combo";

	}

	@GetMapping("/combined")
	public String getAccountAndStudent(Model model) {

		Iterable<Student> studentList = studentService.findAllStudents();

		List<Account> accountlist = acctMgmtService.findAllNonBlankAccts();

		model.addAttribute("students", studentList);
		model.addAttribute("accounts", accountlist);
		return "combo";

	}

	@GetMapping("/combined2")
	public String getAccountAndStudent2(Model model) {

		Iterable<Student> studentList = studentService.findAllStudents();

		List<Account> accountlist = acctMgmtService.findAllNonBlankAccts();

		ArrayList<Student> studs = new ArrayList<Student>();
		ArrayList<Account> accts = new ArrayList<Account>();

		for (Student student : studentList) {

			for (Account account : accountlist) {

				if (student.getEmail().equalsIgnoreCase(account.getEmail())) {

					studs.add(student);
					accts.add(account);
				}
			}

		}

		model.addAttribute("students", studs);
		model.addAttribute("accounts", accts);
		return "combo";

	}
	// this method will show the studentlist sorted by firstname

	@GetMapping("/students1")
	public String showStudents1(Model model) {

		System.out.println(" students");
		

		Iterable<Student> students = studentService.findAllStudents();

		// convert iterable to arraylist
		List<Student> studentList = StreamSupport.stream(students.spliterator(), false).collect(Collectors.toList());

		//Collections.sort(studentList, new FirstNameComparator());
		
		Collections.sort(studentList, new  DobComparator());

		model.addAttribute("students", studentList);

		return "students";
	}

}
