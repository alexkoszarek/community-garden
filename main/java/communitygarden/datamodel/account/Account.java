package communitygarden.datamodel.account;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:Account.properties")
public class Account {

	private int accountId;
	
	@NotNull
	@Size(min=5, max=20, message="{accountName.size}")
	private String accountName;
	
	@NotNull
	@Size(min=6, message="{password.size}")
	private String password;
	
	@Email(message="{email.size}")
	private String email;
	
	@Size(min=0, max=40, message="{addressLine1.size}")
	private String addressLine1;
	
	@Size(min=0, max=40, message="{addressLine2.size}")
	private String addressLine2;
	
	@Size(min=0, max=20, message="{city.size}")
	private String city;
	
	@Size(min=0, max=20, message="{state.size}")
	private String state;
	
	@Digits(integer=6, fraction=0, message="{zipcode.size}")
	private int zipcode;
	
	@Size(min=0, max=200, message="{bio.size}")
	private String bio;
	
	public Account()
	{
		
	}
	
	public Account(String accountName, String password, String email, String addressLine1, String addressLine2,
			String city, String state, int zipcode, String bio) {
		super();
		this.accountId = getAccountId();
		this.accountName = accountName;
		this.password = password;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.bio = bio;
	}
	public int getAccountId() {
<<<<<<< HEAD
		// TODO: Hook into DB w/ a sequence
=======
>>>>>>> 40bed8515c779a417ca0647465343aee1af6e978
		return ((int)Math.random() *1000);
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
}
