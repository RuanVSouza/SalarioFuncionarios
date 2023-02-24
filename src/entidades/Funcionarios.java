package entidades;

public class Funcionarios {

	private Integer Id;
	private String name;
	private Double salary;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(Integer id, String name, Double salary) {
		super();
		this.Id = id;
		this.name = name;
		this.salary = salary;
	}



	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return "Id:" + Id + " , " + "Nome:" + name + " , " + "Salario:"+ String.format("%.2f", salary);
	}
	
	
}
