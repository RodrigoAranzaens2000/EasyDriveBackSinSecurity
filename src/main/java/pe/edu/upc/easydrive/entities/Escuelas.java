package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Escuelas")
public class Escuelas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDEscuela;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "Ruc", nullable = false)
    private Long Ruc;
    @Column(name = "ImgEscuela",length = 255)
    private String ImgEscuela;
    @Column(name = "Direccion" , nullable = false , length = 500)
    private String Direccion;
    @Column(name = "NumeroTelefono" , nullable = false , length = 30)
    private String NumeroTelefono;
    @ManyToOne
    @JoinColumn
    private Promocion prom;

    public Escuelas() {
    }

    public Escuelas(int IDEscuela, String nombre, Long ruc, String imgEscuela, String direccion, String numeroTelefono, Promocion prom) {
        this.IDEscuela = IDEscuela;
        this.nombre = nombre;
        Ruc = ruc;
        ImgEscuela = imgEscuela;
        this.Direccion = direccion;
        NumeroTelefono = numeroTelefono;
        this.prom = prom;
    }

    public int getIDEscuela() {
        return IDEscuela;
    }

    public void setIDEscuela(int IDEscuela) {
        this.IDEscuela = IDEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getRuc() {
        return Ruc;
    }

    public void setRuc(Long ruc) {
        Ruc = ruc;
    }

    public String getImgEscuela() {
        return ImgEscuela;
    }

    public void setImgEscuela(String imgEscuela) {
        ImgEscuela = imgEscuela;
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

    public Promocion getProm() {
        return prom;
    }

    public void setProm(Promocion prom) {
        this.prom = prom;
    }
}
