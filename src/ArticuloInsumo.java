public class ArticuloInsumo {
    private Double precioCompra;
    private Integer stockAtcual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(Double precioCompra, Integer stockAtcual, Integer stockMaximo, Boolean esParaElaborar) {
        this.precioCompra = precioCompra;
        this.stockAtcual = stockAtcual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockAtcual() {
        return stockAtcual;
    }

    public void setStockAtcual(Integer stockAtcual) {
        this.stockAtcual = stockAtcual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
}
