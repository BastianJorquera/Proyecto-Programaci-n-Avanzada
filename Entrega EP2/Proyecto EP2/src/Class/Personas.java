package Class;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Personas {

  private String Nombre;
  private String Apellido;
  private String Rut;
  private int IdUsuario;
  private Date FechaNaci;
  private int nTelefono;
  private Scanner Entrada= new Scanner(System.in);



  Personas(String nombre, String apellido, String rut, int idUsuario, int nCelular, Date fechaNaci) {
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Rut = rut;
    this.IdUsuario = idUsuario;
    this.nTelefono= nCelular;
    this.FechaNaci = fechaNaci;
  }

  // get
  //nombre
  public String getNombre() {
    return this.Nombre;
  }
  //Apellido
  public String getApellido() {
    return this.Apellido;
  }
  //rut
  public String getRut() {
    return this.Rut;
  }
  //idusuario
  public int getnIdUsuario() {
    return this.IdUsuario;
  }
  //nCelular
  public int getnTelefono() {
    return this.nTelefono;
  }
  //fecha de nacimiento
  public Date getFechaNaci() {
    return this.FechaNaci;
  }

  // set
  //nombre
  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }
  //Apellido
  public void setApellido(String apellido) {
    this.Apellido = apellido;
  }
  //rut
  public void setRut(String rut) {
    this.Rut = rut;
  }
  //idusuario
  public void getnIdUsuario(int idUsuario) {
    this.IdUsuario=idUsuario;
  }
  //nCelular
  public void setRut(int nCelular) {
    this.nTelefono = nCelular;
  }
  //fecha de nacimiento
  public void setFecaNacimiento(Date fechaNaci) {
    this.FechaNaci = fechaNaci;
  }


  public void setPersonas() throws ParseException{

    System.out.println("Ingrese su Nombre");
    this.Nombre=Entrada.nextLine();

    System.out.println("Ingrese su Apellido");
    this.Apellido=Entrada.nextLine();

    System.out.println("Ingrese su Rut");
    this.Rut=Entrada.nextLine();

    System.out.println("Ingrese su número de telefono");
    this.nTelefono=Entrada.nextInt();

    System.out.println("Ingrese su fecha de nacimiento"); 
    this.FechaNaci= new SimpleDateFormat("dd/mm/YYYY").parse(Entrada.next());
  }
  
  public void setPersonas(String Nombre, String Apellido, String Rut, Date FechaNaci){
    System.out.println("Ingrese su número de telefono");
    this.nTelefono=Entrada.nextInt();
  }
  
  public void mostrarDatosPersonas(){
    System.out.println("Su nombre completo es: " + this.Nombre + this.Apellido);
    System.out.println("Rut: " + this.Rut);
    System.out.println("Teléfono: " + this.nTelefono);
    System.out.println("Fecha de nacimiento: " + this.FechaNaci);
    }

}