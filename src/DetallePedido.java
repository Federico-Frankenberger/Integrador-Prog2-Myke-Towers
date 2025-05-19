public class DetallePedido {
    private Integer cantidad;
    private Articulo articulo;
    private Double subTotal;

    public DetallePedido(Integer cantidad, Articulo articulo, Double subTotal) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.subTotal = subTotal;
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
