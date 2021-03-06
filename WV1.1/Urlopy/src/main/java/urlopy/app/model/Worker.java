package urlopy.app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Worker {
	
	private String id;
	private String imie;
	private String nazwisko;
	
	@NotNull
	@Size(min=2, max=10, message= "{username.size}")
	private String username;
	
	private String password;
	
	@NotNull
	@Pattern(regexp = "(USER|ADMIN)",message="{role.size}")
	private String role;
	
	@NotNull(message= "{liczba.size}")
	private Integer dniUrlopu;
	
	@NotNull(message= "{liczba.size}")
	private Integer dniUrlopuTenRok;
	
	@NotNull(message= "{liczba.size}")
	private Integer dniUrlopuLataWstecz;

	public Worker() {

	}
	
	public Worker(String id, String imie, String Nazwisko, String username, String password,
			String role, Integer dniUrlopu, Integer dniUrlopuTenRok, Integer dniUrlopuLataWstecz) {
		this.id = id;
		this.imie = imie;
		this.nazwisko = Nazwisko;
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

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
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
