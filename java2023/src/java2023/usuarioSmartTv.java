package java2023;

public class usuarioSmartTv {

	public static void main(String[] args) throws Exception {
		smartTv SmartTv = new smartTv();
		
		System.out.println("A TV está ligada ?" + SmartTv.ligada);
		System.out.println("Canal: " + SmartTv.canal);
		System.out.println("Volume: " + SmartTv.volume);
		
		SmartTv.ligar();
		System.out.println("E agora a TV está ligada ?" + SmartTv.ligada);
		
		SmartTv.aumentarVolume();
		System.out.println("E agora qual é o volume? : " + SmartTv.volume);
		
		SmartTv.mudarCanalAnterior();
		System.out.println("E agora qual é o Canal: " + SmartTv.canal);
		
		SmartTv.mudarCanal(10);
		System.out.println("E agora qual é o Canal: " + SmartTv.canal);
		
		

		

		
		
		

	}

}
