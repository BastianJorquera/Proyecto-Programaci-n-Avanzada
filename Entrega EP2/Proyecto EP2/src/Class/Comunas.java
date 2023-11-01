package Class;

//clase comunas
//va con .txt
import java.util.Scanner;


public class Comunas{
  private String NombreComuna;
  private String NombreProvincia;
  private String NombreRegion;
  private int NUsuarios;
  private Scanner Entrada;

  public Comunas(String Nombre, String NombreRegion, String NombreProvincia, int NUsuarios){

    this.NombreComuna = Nombre;
    this.NombreProvincia= NombreProvincia;
    this.NombreRegion = NombreRegion;
    this.NUsuarios = NUsuarios;
  }

  //get
  public String getNombre(){
    return this.NombreComuna;
  }

  public String getNombreRegion(){
    return this.NombreRegion;
  }
  
  public String getNombreProvincia(){
    return this.NombreProvincia;
  }
  
  public int getNUsuarios(){
    return this.NUsuarios;
  }

  //set
  public void setNombre(String Nombre){
    this.NombreComuna = Nombre;
  }

  public void setNombreRegion(String NombreRegion){
    this.NombreRegion = NombreRegion;
  }

  public void setNombreProvincia(String NombreProvincia){
    this.NombreProvincia = NombreProvincia;
  }

  public void setnUsuarios(int NUsuarios){
    this.NUsuarios = NUsuarios;
  }
  
  public void setUsuarios(String NombreComuna, String NombreRegion, String NombreProvincia){
      System.out.println("Ingrese número de Usuarios");
      this.NUsuarios = Entrada.nextInt();
  }
  
  public void setUsuarios(String NombreComuna, String NombreRegion, int NUsuarios){
      System.out.println("Ingrese nombre de la Provincia");
      this.NombreProvincia = Entrada.nextLine();
  }
  
  public void setUsuarios(){
    System.out.println("Ingrese Nombre de la Comuna");
    this.NombreComuna=Entrada.nextLine();
    
    System.out.println("Ingrese Nombre de la Provincia");
    this.NombreProvincia=Entrada.nextLine();

    System.out.println("Ingrese Nombre de la Región");
    this.NombreRegion=Entrada.nextLine();
    
    System.out.println("Ingrese Numero de usuarios");
    this.NUsuarios=Entrada.nextInt();
  }
  
  public void mostrarDatosComunas(){
    System.out.println("Región: " + this.NombreComuna);
    System.out.println("Provincia: " + this.NombreProvincia);
    System.out.println("Comuna: " + this.NombreComuna);
    System.out.println("Número de usuarios en la comuna: " + this.NUsuarios);
  }
}