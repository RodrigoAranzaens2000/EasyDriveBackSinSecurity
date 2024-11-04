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
    @ManyToOne
    @JoinColumn
    private Promocion prom;
    @Column(name = "ImgEscuela",length = 255)
    private String ImgEscuela;

    public Escuelas() {
    }

    public Escuelas(int IDEscuela, String nombre, Promocion prom, Long ruc, String imgEscuela) {
        this.IDEscuela = IDEscuela;
        this.nombre = nombre;
        this.prom = prom;
        Ruc = ruc;
        ImgEscuela = imgEscuela;
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

    public Promocion getProm() {
        return prom;
    }

    public void setProm(Promocion prom) {
        this.prom = prom;
    }

    public String getImgEscuela() {
        return ImgEscuela;
    }

    public void setImgEscuela(String imgEscuela) {
        ImgEscuela = imgEscuela;
    }
}
