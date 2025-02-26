package exercicio03;

public class Empresa {

	private String razaoSocial;
	private String cnpj;
	private String fone;
	
	
	public void setRazaoSocial(String rs){
		razaoSocial = rs;
	}
	public void setFone(String f){
		fone = f;
	}
	public void setCNPJ(String c){
		
		cnpj = c;
	}
	
	public String getRazaoSocial(){
		
		return razaoSocial;
	}
	public String getCNPJ() {
		
		return cnpj;
	}
	public String getFone() {
		
		return fone;
	}
	
	
	
	
}
