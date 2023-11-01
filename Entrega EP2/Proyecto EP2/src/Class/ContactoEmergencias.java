package Class;

//va con txt
import java.util.Scanner;

public class ContactoEmergencias{
  
  private String Nombre; 
  private int Numero;
  private Scanner Entrada=new Scanner(System.in);
  
  ContactoEmergencias(String Nombre, int Numero){
    this.Nombre = Nombre;
    this.Numero = Numero;
  }

  public String getNombre(){
    return this.Nombre;
  }
  public int getNumero(){
    return this.Numero;
  }

  //set
  public void setNombre(String Nombre){
    this.Nombre = Nombre;
  }

  public void setNumero(int Numero){
    this.Numero = Numero;
  }

  public void setEmergencia(String Nombre){
    System.out.println("Ingrese el tipo de Emergencia");
    Numero=Entrada.nextInt();
  }
  
  public void setEmergencia(int Numero){
    System.out.println("Ingrese el Nombre de Emergencia");
    Nombre=Entrada.nextLine();
  }
  
  public void mostraremergencia(){
    System.out.println(this.Nombre);
    System.out.println("Teléfono: " + this.Numero);
  }
}

