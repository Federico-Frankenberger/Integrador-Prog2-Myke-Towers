import java.util.HashSet;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private HashSet<Sucursal> sucursales;


    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    public void addSucursar(Sucursal sucu){
        if(this.sucursales == null) {
            this.sucursales = new HashSet<>();
        }
        sucursales.add(sucu);
    }

    public void removeSucursar(Sucursal sucu){
        if(this.sucursales != null) {
            this.sucursales.remove(sucu);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }


}
