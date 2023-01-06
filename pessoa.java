 class Pessoa{
   private String cpf;
   
   public Pessoa(String cpf){
     
     this.cpf = cpf;
   }
   
   private boolean validarDigito1(String cpf){
     //validar o primeiro digito
     char cpfChar [] = cpf.toCharArray();
		 int valor1 = 10 * Integer.parseInt("" + cpfChar[0]);
		 int valor2= 9 * Integer.parseInt("" + cpfChar[1]);
	 	 int valor3 = 8 * Integer.parseInt("" + cpfChar[2]);
		 int valor4 = 7 * Integer.parseInt("" + cpfChar[3]);									
			int valor5 = 6 * Integer.parseInt("" + cpfChar[4]);
			int valor6 = 5 * Integer.parseInt("" + cpfChar[5]);
			int valor7 = 4 * Integer.parseInt("" + cpfChar[6]);
			int valor8 = 3 * Integer.parseInt("" + cpfChar[7]);
			int valor9 = 2 * Integer.parseInt("" + cpfChar[8]);
															
			int resultado = ((valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9) *10)  % 11;
			
			if(resultado == Integer.parseInt("" + cpfChar[9])){
				return true;																			
			  
			}
			else{
				return false;
				}
     
   }
   
   private boolean validarDigito2(String cpf){
     //validar o primeiro digito
		char cpfChar [] = cpf.toCharArray();
		int valor1 = 11 * Integer.parseInt("" + cpfChar[0]);
		int valor2=10 * Integer.parseInt("" + cpfChar[1]);
		int valor3 = 9 * Integer.parseInt("" + cpfChar[2]);
		int valor4 = 8 * Integer.parseInt("" + cpfChar[3]);									
		int valor5 = 7 * Integer.parseInt("" + cpfChar[4]);
		int valor6 = 6 * Integer.parseInt("" + cpfChar[5]);
		int valor7 = 5 * Integer.parseInt("" + cpfChar[6]);
		int valor8 = 4 * Integer.parseInt("" + cpfChar[7]);
		int valor9 = 3 * Integer.parseInt("" + cpfChar[8]);
		int valor10 = 2 * Integer.parseInt("" + cpfChar[9]);
															
		int resultado = ((valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9+ valor10) * 10) % 11;
	
		if(resultado == Integer.parseInt("" + cpfChar[10])){
			return true;																			
		  
		}
		else{
			return false;
			}
   }
			
		public boolean validarCPF( String cpf ){
			  if(validarDigito1(cpf) && validarDigito2(cpf)){
			    return true;
			    
			  }
			  
			  else{
			    return false;			  
			    
			  }
			  
			  
			}
     
   }
 