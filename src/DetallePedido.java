public class DetallePedido {
    private Integer cantidad;
    private Articulo articulo;
    private Double subTotal;

    public DetallePedido(Integer cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public DetallePedido(Integer cantidad, Articulo articulo, Double subTotal) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.subTotal = subTotal;
    }

    public Double calcularSubTotal() {
        Double total = 0.0;
        if (cantidad != null && articulo != null && articulo.getPrecioVenta() != null) {
            total = cantidad * articulo.getPrecioVenta();
        }
        return total;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
