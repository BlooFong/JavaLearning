package relaciones;

import java.util.List;

public class Auto {

    private Long id;
    private String marca;
    private String modelo;

    private List<Propietario> listapropietarios;
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listapropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listapropietarios = listapropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listapropietarios=" + listapropietarios +
                '}';
    }

    public List<Propietario> getListapropietarios() {
        return listapropietarios;
    }

    public void setListapropietarios(List<Propietario> listapropietarios) {
        this.listapropietarios = listapropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
