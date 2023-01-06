import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Pessoa people = new Pessoa("");
    Scanner sc = new Scanner(System.in);
    
    System.out.print(" digite o seu cpf: ");
    String cpf = sc.next();
    boolean valido = people.validarCPF(cpf);
    System.out.println("O seu cpf é: " + valido);
    
  }
}