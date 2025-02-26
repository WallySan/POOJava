package exercicio03;

public class Empregado {

	private String nome;
	private double salario;
	private Empresa empresa;
	
	
	public void setNome(String n)
	{
		nome =n;
	}
	
	public void setSalario(double sal)
	{
	
		salario = sal;
		
	}
	
	public void setEmpresa(Empresa e)
	{
		empresa = e;
	}
	
	public String getNome()
	{
		
		return nome;
	}
	
	
	public double getSalario()
	{
		
		return salario;
	}
	
	public Empresa getEmpresa()
	{
		return empresa;
		
	}
	
	
	
}
