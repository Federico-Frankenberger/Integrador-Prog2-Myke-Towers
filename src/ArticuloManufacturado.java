import java.util.HashSet;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private HashSet<ArticuloManufacturadoDetalle> Insumos;

    public ArticuloManufacturado(String denominacion, Double precioVenta, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public void addInsumo(ArticuloManufacturadoDetalle articuloInsumo) {
        if (Insumos == null) {
            Insumos = new HashSet<>();
        }
        Insumos.add(articuloInsumo);
    }

    public void removeInsumo(ArticuloManufacturadoDetalle articuloInsumo) {
        if (Insumos != null) {
            Insumos.remove(articuloInsumo);
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}
