
public class Direccion{

  private String NombreCalle;
  private String Comuna;
  private int NumCalle;
  private int NumDepto;

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
}

