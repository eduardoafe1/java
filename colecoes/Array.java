package colecoes;

public class Array {
	public static void main(String[] args) {
		double [] notasJ = {2.3,5.4,6.8,7,8};
		
		double[] notasP = new double [5];
		notasP[0] = 2.3;
		notasP[1] = 4.5;
		notasP[2] = 3.3;
		notasP[3] = 7.5;
		notasP[4] = 8.4;
		
		double totalJ = 0;
		for(double nota: notasJ){
			totalJ+=nota;
		}
		
		/*for(int i=0; i< notasJ.length; i++){
			totalJ+=notasJ[i];	
		}*/
		
		double totalP = 0;
		for(double nota: notasP){
			totalP+=nota;
		}
		
		/*for(int i=0; i< notasP.length; i++){
			totalP+=notasP[i];	
		}*/
		
		System.out.println(totalJ/notasJ.length);
		System.out.println(totalP/notasP.length);
	}
}
