package webadv.s16202231.p6.entity;

public class Teacher {
	private int id;
	private String account;
	private String password;
	private String name;
	public Teacher(int id, String account, String password, String name) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
