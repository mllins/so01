package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void operacaoString() {
		String valor="";
		double tempoInicial=System.nanoTime();
		for(int i=0;i<32768;i++) {
			valor=valor+"a";
		}
		double tempoFinal=System.nanoTime();
		double tempoDecorrido=tempoFinal-tempoInicial;
		tempoDecorrido=tempoDecorrido/10E9;// Math.pow(10,9)
		System.out.println("Tempo decorrido (String com adição):" + tempoDecorrido + "segundos.");
	}
	
	public void operacaoBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial=System.nanoTime();
		for(int i=0;i<32768;i++) {
			buffer=buffer.append("a");
		}
		double tempoFinal=System.nanoTime();
		double tempoDecorrido=tempoFinal-tempoInicial;
		tempoDecorrido=tempoDecorrido/10E9;// Math.pow(10,9)
		System.out.println("Tempo decorrido (String com StringBuffer):" + tempoDecorrido + "segundos.");
	}
	
	public void operacaoFrase(String frase) {
		String[] palavras = frase.split(" ");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
