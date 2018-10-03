package urlopy.app.model;

public class Worker {
	
	private String id;
	private String Imię;
	private String Nazwisko;
	private String username;
	private String password;
	private String role;
	private Integer dniUrlopu;
	private Integer dniUrlopuTenRok;
	private Integer dniUrlopuLataWstecz;

	public Worker() {

	}
	
	public Worker(String id, String Imię, String Nazwisko, String username, String password,
			String role, Integer dniUrlopu, Integer dniUrlopuTenRok, Integer dniUrlopuLataWstecz) {
		this.id = id;
		this.Imię = Imię;
		this.Nazwisko = Nazwisko;
		this.username = username;
		this.password = password;
		this.role = role; 
		this.dniUrlopu = dniUrlopu;
		this.dniUrlopuTenRok = dniUrlopuTenRok;
		this.dniUrlopuLataWstecz = dniUrlopuLataWstecz;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImię() {
		return Imię;
	}

	public void setImię(String imię) {
		Imię = imię;
	}

	public String getNazwisko() {
		return Nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getDniUrlopu() {
		return dniUrlopu;
	}

	public void setDniUrlopu(Integer dniUrlopu) {
		this.dniUrlopu = dniUrlopu;
	}

	public Integer getDniUrlopuTenRok() {
		return dniUrlopuTenRok;
	}

	public void setDniUrlopuTenRok(Integer dniUrlopuTenRok) {
		this.dniUrlopuTenRok = dniUrlopuTenRok;
	}

	public Integer getDniUrlopuLataWstecz() {
		return dniUrlopuLataWstecz;
	}

	public void setDniUrlopuLataWstecz(Integer dniUrlopuLataWstecz) {
		this.dniUrlopuLataWstecz = dniUrlopuLataWstecz;
	}

	
}
