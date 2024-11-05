package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "CentrosMedicos")
public class CentrosMedicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDCentro;
    @Column(name = "Nombre" , nullable = false , length = 100)
    private String Nombre;
    @Column(name = "RUC" , nullable = false)
    private long RUC;
    @Column(name = "ImgCentro",length = 255)
    private String ImgCentro;
    @Column(name = "Direccion" , nullable = false , length = 500)
    private String Direccion;
    @Column(name = "NumeroTelefono" , nullable = false , length = 30)
    private String NumeroTelefono;

    public CentrosMedicos() {
    }

    public CentrosMedicos(int IDCentro, String nombre, long RUC, String imgCentro, String direccion, String numeroTelefono) {
        this.IDCentro = IDCentro;
        Nombre = nombre;
        this.RUC = RUC;
        ImgCentro = imgCentro;
        Direccion = direccion;
        NumeroTelefono = numeroTelefono;
    }

    public int getIDCentro() {
        return IDCentro;
    }

    public void setIDCentro(int IDCentro) {
        this.IDCentro = IDCentro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getRUC() {
        return RUC;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }

    public String getImgCentro() {
        return ImgCentro;
    }

    public void setImgCentro(String imgCentro) {
        ImgCentro = imgCentro;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        NumeroTelefono = numeroTelefono;
    }
}
