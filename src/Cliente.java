import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Cliente{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fehcaNacimiento;
    private Usuario usuario;
    private ImagenPersona imagenPersona;
    private Domicilio domicilio;
    private HashSet<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fehcaNacimiento, Domicilio domicilio, Usuario usuario, ImagenPersona imagenPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fehcaNacimiento = fehcaNacimiento;
        this.usuario = usuario;
        this.domicilio = domicilio;
        this.imagenPersona = imagenPersona;
    }

    public void addPedido (Pedido pedido){
        if(pedidos == null){
            pedidos = new HashSet<>();
        }
        this.pedidos.add(pedido);
    }
    public void removePedido (Pedido pedido){
        if(pedidos != null){
            this.pedidos.remove(pedido);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFehcaNacimiento() {
        return fehcaNacimiento;
    }

    public void setFehcaNacimiento(LocalDate fehcaNacimiento) {
        this.fehcaNacimiento = fehcaNacimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ImagenPersona getImagenPersona() {
        return imagenPersona;
    }

    public void setImagenPersona(ImagenPersona imagenPersona) {
        this.imagenPersona = imagenPersona;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public HashSet<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
