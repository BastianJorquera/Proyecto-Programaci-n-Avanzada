//denuncias
//direccion (calle y numero), nivel de peligro, usuario que denuncia, hora de denuncia
//
import java.util.Date;
import java.util.Scanner;

public class Denuncia{

  private Int NivelPeligro; //1: bajo, 2:moderado, 3: alto
  private String Calle;
  private Int nCalle;
  private Int Usuario;
  private Int HoraDenuncia;
  private Date FechaDenuncia;
  private Scanner Entrada;

  Denuncia(){
    Entrada = new Scanner(System.in);
  }

  Denuncia(Int nivelPeligro, String calle, Int ncalle, Int usuario, Int horaDenuncia, Date fechaDenuncia){
    this.NivelPeligro = nivelPeligro;
    this.Calle = calle;
    this.nCalle = ncalle;
    this.Usuario = usuario;
    this.HoraDenuncia = horaDenuncia;
    this.FechaDenuncia = fechaDenuncia;
    
  }
  //get
  public Int getNivelPeligro(){
    return this.NivelPeligro;
  }

  public String getCalle(){
    return this.Calle;
  }

  public Int getnCalle(){
    return this.nCalle;
  }

  public Int getUsuario(){
    return this.Usuario;
  }

  public Int getHoraDenuncia(){
    return this.HoraDenuncia;
  }

  public Date getFechaDenuncia(){
    return this.FechaDenuncia;
  }

  //set
  public void setNivelPeligro(Int nivelPeligro) {
    this.NivelPeligro = nivelPeligro;
  }

  public void setCalle(String calle){
    this.Calle = calle;
  }

  public void setnCalle(Int ncalle){
    this.nCalle = ncalle;
  }

  public void setUsuario(int usuario){
    this.Usuario = usuario;
  }

  public void setHoraDenuncia(Int horaDenuncia){
    this.HoraDenuncia = horaDenuncia;
  }

  public void setFechaDenuncia(Date fechaDenuncia){
    this.FechaDenuncia = fechaDenuncia;
  }


  
}