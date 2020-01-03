package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		this(01,06,2017);
	}
	
	Data(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.ano = a;
		
	}
	
	String formatar(){
		return String.format("%d/%d/%d ", dia, mes, ano);
	}
}
