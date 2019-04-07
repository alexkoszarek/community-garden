package communitygarden.web.controllers.account;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;

import communitygarden.datamodel.account.*;

<<<<<<< HEAD
@Controller /** Found via {@link WebConfig} ComponentScan */
@RequestMapping("/a") /** No one wants to have to type out 'account' */
=======
@Controller
@RequestMapping("/account")
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
public class AccountController {
	
//	private AccountRepository accountRepository;
	List<Account> accounts = new ArrayList<Account>();
	
	@GetMapping(value = "/register")
	public String showRegistrationForm( Model model )
	{	
		// Return the view named '/WEB-INF/views/registerForm.jsp'
		model.addAttribute( new Account() );
<<<<<<< HEAD
		return "a/registerForm"; // src\main\webapp\WEB-INF\views\account\registerForm.jsp
=======
		return "account/registerForm";
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
	}
	
	@PostMapping(value = "/register")
	public String processRegistration( @Valid Account account, Errors errors )
	{
		// If there are errors
		if ( errors.hasErrors() )
		{
			System.out.println("ERROR: " + errors.toString());
<<<<<<< HEAD
			return "account/registerForm"; // src\main\webapp\WEB-INF\views\account\registerForm.jsp
=======
			return "account/registerForm";
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
		}
		
		accounts.add(account);
		
<<<<<<< HEAD
		return "redirect:/a/" + account.getAccountName();
=======
		return "redirect:/account/" + account.getAccountName();
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
	}
	
	@GetMapping(value="/{accountName}")
	public String showAccountProfile( @PathVariable String accountName, Model model )
	{
		// TODO: Add ID to account and lookup functionality
		Account account = accounts.get(0);
		
		model.addAttribute(account);
		
<<<<<<< HEAD
		return "a/profile"; // src\main\webapp\WEB-INF\views\account\profile.jsp
		
=======
		return "account/profile";
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
	}
}
