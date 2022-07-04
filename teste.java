package helo;

public class teste {
 public static void main(String[] args) {
	
	 int[] numero = {1,2,3,5,7,10,11,12,13,20};

	String ordenacao = obterSequenciaFormatada(numero);

	System.out.println(ordenacao);
  }
 
 public static String obterSequenciaFormatada(int[] valores){
	 String primeiroElemento = null;
	 boolean tudoIgual = true;
	 int numeroPercorrido = 0;
	     for (int i = 0 ; i < valores.length; i++) {
	         if(i==0) {
	    	 primeiroElemento = Integer.toString(valores[i])+"-";
	         }
	         if(tudoIgual == false) {
	        	 primeiroElemento = primeiroElemento+","+numeroPercorrido+"-";
	        	 tudoIgual =true;
	         }
	         
	         if (valores[i] - numeroPercorrido == 1){
	            numeroPercorrido = valores[i];  
	            if(tudoIgual == false) {
	            	 primeiroElemento = primeiroElemento+"-"+numeroPercorrido;
	            }
	         } else {
	        	 primeiroElemento = primeiroElemento+""+numeroPercorrido;
	        	 numeroPercorrido = valores[i];	        	
	        	 tudoIgual = false;
	         }
	         
	      
	     }
	     
	     if (tudoIgual) {
        	 primeiroElemento = primeiroElemento+""+numeroPercorrido; 
         }
		return primeiroElemento;
	}
}
