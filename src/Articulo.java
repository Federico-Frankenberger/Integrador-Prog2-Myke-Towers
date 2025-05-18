import java.util.HashSet;

public abstract class Articulo {
    private  String denominacion;
    private Double precioVenta;
    private UnidadMedida unidadMedida;
    private HashSet<ImagenComida> imagenesArticulo;



    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public void addImagenArticulo(ImagenComida imagenComida) {
        if (imagenesArticulo == null) {
            imagenesArticulo = new HashSet<>();
        }
        this.imagenesArticulo.add(imagenComida);
    }

    public void removeImagenArticulo(ImagenComida imagenComida) {
        if (imagenesArticulo != null) {
            this.imagenesArticulo.remove(imagenComida);
        }
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
