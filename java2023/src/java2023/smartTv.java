package java2023;

public class smartTv {

		boolean ligada = false;
		int canal = 1;
		int volume = 15;
		
		public void ligar() {
			ligada = true;
		}
		
		public void desligar() {
			ligada = false;
		}
		
		public void aumentarVolume() {
			volume ++;
			if (volume > 30 || volume == 30) {
				System.out.println("Volume maximo");
			}
		}
		
		public void diminuirVolume() {
			volume --;
			
			if (volume < 0 || volume == 0) {
				System.out.println("Mudo");
			}
		}
		
		public void mudarCanalPosterior() {
			canal ++;
			if (canal > 15 ) {
				System.out.println("Canal não existe.");
			}
		}
		
		public void mudarCanalAnterior() {
			canal --;
			if (canal < 1 ) {
				System.out.println("Canal não existe.");
			}
		}
		
		public void mudarCanal(int novoCanal) {
			canal = novoCanal;
		}

}
