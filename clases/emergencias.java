//va con txt
import java.util.Scanner;

public class emergencias{
  
  private String Nombre; 
  private int Numero;
  private Scanner Entrada;


  emergencias(){
    Entrada= new Scanner(System.in);
  }
  
  emergencias(String nombre, int numero){
    this.Nombre = nombre;
    this.Numero = numero;
  }

  public String getNombre(){
    return this.Nombre;
  }
  public int getNumero(){
    return this.Numero;
  }

  //set
  public void setNombre(String nombre){
    this.Nombre = nombre;
  }

  public void setNumero(int numero){
    this.Numero = numero;
  }

  public void crearDato(){
    System.out.println("Ingrese el Nombre de Emergencia");
    Nombre=Entrada.nextLine();

    System.out.println("Ingrese el tipo de Emergencia");
    numero=Entrada.nextLine();

  }
}

