//clase comunas
//va con .txt
import java.util.Scanner;


public class Comunas{
  private String Nombre;
  private String NombreProvincia;
  private String NombreRegion;
  private int NUsuarios;
  private Scanner Entrada;

  public Comunas(String nombre, String nombreRegion, String nombreProvincia, int nUsuarios){

    this.Nombre = nombre;
    this.NombreProvincia= nombreProvincia;
    this.NombreRegion = nombreRegion;
    this.NUsuarios = nUsuarios;
  }

  //get
  public String getNombre(){
    return this.Nombre;
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
  public void setNombre(String nombre){
    this.Nombre = nombre;
  }

  public void setNombreRegion(String nombreRegion){
    this.NombreRegion = nombreRegion;
  }

  public void setNombreProvincia(String nombreProvincia){
    this.NombreProvincia = nombreProvincia;
  }

  public void setnUsuarios(int nUsuarios){
    this.NUsuarios = nUsuarios;
  }

  public void crearDato(){
    System.out.println("Ingrese Nombre de la Comuna");
    this.Nombre=Entrada.nextLine();
    
    System.out.println("Ingrese Nombre de la Provincia");
    this.NombreProvincia=Entrada.nextLine();

    System.out.println("Ingrese Nombre de la Región");
    this.NombreRegion=Entrada.nextLine();
    
    System.out.println("Ingrese Numero de usuarios");
    this.NUsuarios=Entrada.nextInt();

    
  }
}