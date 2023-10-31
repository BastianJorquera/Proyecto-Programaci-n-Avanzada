
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Persona {

  private String Nombre;
  private String Apellido;
  private String Rut;
  private Int IdUsuario;
  private Date FechaNaci;
  private Int nTelefono;
  private Scanner Entrada;

  Persona() {
    Entrada = new Scanner(System.in);
  }

  Persona(String nombre, String apellido, String rut, Int idUsuario, Int nCelular, Date fechaNaci) {
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
  public Int getnIdUsuario() {
    return this.IdUsuario;
  }
  //nCelular
  public Int getnTelefono() {
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
  public void getnIdUsuario(Int idUsuario) {
    this.IdUsuario=idUsuario;
  }
  //nCelular
  public void setRut(Int nCelular) {
    this.nTelefono = nCelular;
  }
  //fecha de nacimiento
  public void setFecaNacimiento(Date fechaNaci) {
    this.FechaNaci = fechaNaci;
  }


  public Persona crearDato() throws ParseException{

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

  return new Persona(this.Nombre, this.Apellido, this.Rut, this.nTelefono, this.FechaNaci);
}

public void leerDatos(){
  
}

}