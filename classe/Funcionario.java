package classe;

public class Funcionario {
	int cod;
	String nom;
	double sal;
	int ddd;
	int tel;
	
	Funcionario(){
		
	}
	
	Funcionario(int c, String n, double s, int d, int t){
		cod = c;
		nom = n;
		sal = s;
		ddd = d;
		tel = t;
		
		
	}
	
	
	String formatar(){
		return String.format("%d - %s - R$ %.2f -> %d-%d " , cod, nom, sal, ddd, tel);
	}
}
