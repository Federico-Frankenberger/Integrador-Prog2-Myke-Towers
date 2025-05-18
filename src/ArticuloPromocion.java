public class ArticuloPromocion {
    private Promocion promocion;
    private Articulo articulo;
    private int Cantidad;

    public ArticuloPromocion( Articulo articulo, int cantidad) {
        this.promocion = null;
        this.articulo = articulo;
        Cantidad = cantidad;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
