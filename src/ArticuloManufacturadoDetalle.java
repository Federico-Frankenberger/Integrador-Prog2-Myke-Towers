public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloInsumo insumo;

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo insumo) {
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public ArticuloInsumo getInsumo() {return insumo;}

    public void setInsumo(ArticuloInsumo insumo) {this.insumo = insumo;}

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
