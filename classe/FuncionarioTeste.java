package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.cod = 11752;
		func.nom = "Jilson dos Santos";
		func.sal = 1450.00;
		func.ddd = 11;
		func.tel = 37818853;
		
		Funcionario func1 = new Funcionario(11324, "Lalao Silva Saurus", 2000.00, 11, 40028922);
		System.out.println(func.formatar());
		System.out.println(func1.formatar());
		

	}

}
