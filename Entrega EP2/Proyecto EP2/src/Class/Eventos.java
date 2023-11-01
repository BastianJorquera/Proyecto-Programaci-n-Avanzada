package Class;

//denuncias
//direccion (calle y numero), nivel de peligro, usuario que denuncia, hora de denuncia
//
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Eventos{

  private int NivelPeligro; //1: bajo, 2:moderado, 3: alto
  private String Calle;
  private int nCalle;
  private int Usuario;
  private int HoraDenuncia;
  private Date FechaDenuncia;
  private Scanner Entrada = new Scanner(System.in);
  private String fechaentrada;
 

  Eventos(int nivelPeligro, String calle, int ncalle, int usuario, int horaDenuncia, Date fechaDenuncia){
    this.NivelPeligro = nivelPeligro;
    this.Calle = calle;
    this.nCalle = ncalle;
    this.Usuario = usuario;
    this.HoraDenuncia = horaDenuncia;
    this.FechaDenuncia = fechaDenuncia;
    
  }
  //get
  public int getNivelPeligro(){
    return this.NivelPeligro;
  }

  public String getCalle(){
    return this.Calle;
  }

  public int getnCalle(){
    return this.nCalle;
  }

  public int getUsuario(){
    return this.Usuario;
  }

  public int getHoraDenuncia(){
    return this.HoraDenuncia;
  }

  public Date getFechaDenuncia(){
    return this.FechaDenuncia;
  }

  //set
  public void setNivelPeligro(int nivelPeligro) {
    this.NivelPeligro = nivelPeligro;
  }

  public void setCalle(String calle){
    this.Calle = calle;
  }

  public void setnCalle(int ncalle){
    this.nCalle = ncalle;
  }

  public void setUsuario(int usuario){
    this.Usuario = usuario;
  }

  public void setHoraDenuncia(int horaDenuncia){
    this.HoraDenuncia = horaDenuncia;
  }

  public void setFechaDenuncia(Date fechaDenuncia){
    this.FechaDenuncia = fechaDenuncia;
  }
  
  public void setDenuncia(int Usuario)throws ParseException{
    System.out.println("Indique Nivel de peligro (1-4): ");
    NivelPeligro=Entrada.nextInt();
    
    System.out.println("Ingrese el nombre de la calle: ");
    Calle=Entrada.nextLine();
    System.out.println("Ingrese número de calle: ");
    nCalle=Entrada.nextInt();
    
    System.out.println("Digite la fecha y hora de la denuncia");
    fechaentrada=Entrada.next();

    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy hh:mm");
    FechaDenuncia=formato.parse(fechaentrada);
  }
  
  public void setDenuncia(int NivelPeligro, String Calle, int nCalle, int Usuario) throws ParseException{
    System.out.println("Digite la fecha y hora de la denuncia");
    fechaentrada=Entrada.next();

    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy hh:mm");
    FechaDenuncia=formato.parse(fechaentrada);
   }
  public void setDenuncia(String Calle, int nCalle, int Usuario, Date FechaDenuncia){
    System.out.println("Ingrese nivel de peligro: ");
    this.NivelPeligro = Entrada.nextInt();
    }
  public void mostrarDenuncia(){
    System.out.println("nivel de peligrosidad: " + this.NivelPeligro);
    System.out.println("Dirección: " + this.Calle + this.nCalle);
    System.out.println("Fecha y hora de la denuncia: " + this.FechaDenuncia);
    System.out.println("Id del usuario que realizó la denuncia: " + this.Usuario);
  }
}