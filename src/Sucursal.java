import java.time.LocalTime;
import java.util.HashSet;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private HashSet<Promocion> promociones;
    private HashSet<Categoria> categorias;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    public void addPromocion(Promocion promocion) {
        if (this.promociones == null) {
            this.promociones = new HashSet<>();
        }
        promociones.add(promocion);
    }

    public void removePromocion(Promocion promocion) {
        if(this.promociones != null) {
            this.promociones.remove(promocion);
        }
    }

    public void addCategoria(Categoria categoria) {
        if (this.categorias == null) {
            this.categorias = new HashSet<>();
        }
        this.categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        if (this.categorias != null) {
            this.categorias.remove(categoria);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {return domicilio;}

    public void setDomicilio(Domicilio domicilio) {this.domicilio = domicilio;}
}
