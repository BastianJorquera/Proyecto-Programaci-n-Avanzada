package Class;


import java.util.Scanner;


public class Direccion{

  private String NombreCalle;
  private String Comuna;
  private int NumCalle;
  private int NumDepto =0;
  private Scanner Entrada=new Scanner(System.in);

  public Direccion(String nombreCalle, String comuna, int numCalle, int numDepto){
    this.NombreCalle = nombreCalle;
    this.Comuna = comuna;
    this.NumCalle = numCalle;
    this.NumDepto = numDepto;
  }

  public String getNombreCalle(){
    return this.NombreCalle;
  }
  public String getComuna(){
    return this.Comuna;
  }
  public int getNumCalle(){
    return this.NumCalle;
  }
  public int getNumDepto(){
    return this.NumDepto;
  }

  public void setNombreCalle(String nombreCalle){
    this.NombreCalle = nombreCalle;
}
  public void setComuna(String comuna){
    this.Comuna = comuna;
  }
  public void setNumCalle(int numCalle){
    this.NumCalle = numCalle;
  }
  public void setNumDepto(int numDepto){
    this.NumDepto = numDepto;
  }
  
  public void setDireccion(String nombreCalle, String comuna , int numCalle){
      System.out.println("Ingrese número de departamento");
      NumDepto=Entrada.nextInt();
  }
  
  public void setDireccion(String nombreCalle, int numDepto){
      System.out.println("Ingrese nombre de la comuna");
      Comuna=Entrada.nextLine();
      System.out.println("Ingrese número de calle");
      NumCalle=Entrada.nextInt();
  }
  
  public void mostrarDireccion(){
      System.out.println("La direccion es: " + this.NombreCalle + this.NumCalle);
      if (NumDepto != 0){
          System.out.println(this.NumDepto);
      }
      System.out.println("Comuna: " + this.Comuna);
  }
}