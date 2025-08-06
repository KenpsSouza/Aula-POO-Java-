package conta;

public class ContaBancaria {

   private double saldo;
   
  
	   public ContaBancaria(double saldo) {
	super();
	this.saldo = saldo;
}


	   public double getSaldo() {
	return saldo;
}


	   public double depositar (double deposito) {
    	   return saldo = saldo + deposito;

	}
         
       public void sacar (double saque) {
    	   if (saldo >= saque) {
    		   saldo = saldo - saque;
    		   System.out.println("Seu saldo atual é: " + saldo);
    	   }else {
    		   System.out.println("Saldo insuficiente");
    	   }
    	   
      }

}

