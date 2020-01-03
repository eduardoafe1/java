package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "prea";
		
		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei fazer o Jion");
		case "marrom":
			System.out.println("Sei fazer o Shodan");
		case "roxa": 
			System.out.println("Sei fazer o Godan");
		case "verde":
			System.out.println("Sei fazer o Yondan");
		case "laranja": 
			System.out.println("Sei fazer o Sandan");
		case "vermelha":
			System.out.println("Sei fazer o Nidan");
		case "amarela":
			System.out.println("Sei fazer o Heian Shodan");
		default: 
			System.out.println("ME AJUDA!");
			
		}
	}
}
