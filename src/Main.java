import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
    //Empresa
        Empresa empresa  = new Empresa("Todo Rico","TodoRico s.r.l",33270072);

    //Domicilio
        Pais Argentina = new Pais("Argentina");
        Provincia provincia = new Provincia("Mendoza",Argentina);
        Localidad GodoyCruz = new Localidad("Godoy Cruz",provincia);
        Domicilio domicilio = new Domicilio("Güemes",243,5501,GodoyCruz);

    //Sucursal
        LocalTime horarioApertura = LocalTime.of(8,30);
        LocalTime horarioCierre = LocalTime.of(21,30);
        Sucursal sucursal = new Sucursal("Sucursal-1",horarioApertura,horarioCierre,domicilio);

        empresa.addSucursal(sucursal);

    //Categorias Padres
        Categoria padre = new Categoria("Panchos");
        Categoria padre2 = new Categoria("Hamburguesas");

    //Subcategorias
        Categoria subCategoria = new Categoria("Panchos Simples");
        Categoria subCategoria2 = new Categoria("Panchos Completos");
        Categoria subCategoria3 = new Categoria("Hamburguesas simples");
        Categoria subCategoria4 = new Categoria("Hamburguesas completas");

    //Relación Pardre / Sub
        padre.addSubcategoria(subCategoria);
        padre.addSubcategoria(subCategoria2);
        padre2.addSubcategoria(subCategoria3);
        padre2.addSubcategoria(subCategoria4);

    // Unidad de Medida
        UnidadMedida unidades = new UnidadMedida("unidades");
        UnidadMedida gramos = new UnidadMedida("gramos");
        UnidadMedida mililitros = new UnidadMedida("mililitros");

    //Articulo Insumo
        //Insumo Pancho
        ArticuloInsumo insumo1 = new ArticuloInsumo("Pan Bimbo Pancho",1000.00, unidades, 800.00, 10, 100, false);
        ArticuloInsumo insumo2 = new ArticuloInsumo("Salchica Fate",500.00, unidades, 400.00, 10, 100, false);
        ArticuloInsumo insumo3 = new ArticuloInsumo("Lluvia de papas",100.00, gramos, 50.00, 10, 100, false);
        //Insumo Hamburguesa
        ArticuloInsumo insumo4 = new ArticuloInsumo("Pan Bimbo Hamburguesa",500.00, unidades, 400.00, 10, 100, false);
        ArticuloInsumo insumo5 = new ArticuloInsumo("Hamburguesa Paty",1000.00, unidades, 800.00, 10, 100, false);
        ArticuloInsumo insumo6 = new ArticuloInsumo("Tomate",500.00, gramos, 400.00, 10, 100, false);
        ArticuloInsumo insumo7 = new ArticuloInsumo("Lechuga",1000.00, gramos, 800.00, 10, 100, false);
        ArticuloInsumo insumo8 = new ArticuloInsumo("Huevo",500.00, gramos, 400.00, 10, 100, false);
        //Coca Cola 500ml
        ArticuloInsumo insumo9 = new ArticuloInsumo("CocaCola 500ml",1500.00, mililitros, 1000.00, 10, 100, false);

    //Articulo manufacturado
        //Pancho
        ArticuloManufacturado articulo1 = new ArticuloManufacturado("Pancho",2000.00, unidades,"Tipo simple",10,"Receta panchito");

        ArticuloManufacturadoDetalle detalle1 = new ArticuloManufacturadoDetalle(1,insumo1);
        ArticuloManufacturadoDetalle detalle2 = new ArticuloManufacturadoDetalle(1,insumo2);
        ArticuloManufacturadoDetalle detalle3 = new ArticuloManufacturadoDetalle(1,insumo3);

        articulo1.addInsumo(detalle1);
        articulo1.addInsumo(detalle2);
        articulo1.addInsumo(detalle3);

        subCategoria.addArticulo(articulo1);
        //Hamburguesa
        ArticuloManufacturado articulo2 = new ArticuloManufacturado("Hamburguesa",10000.00, unidades,"Tipo simple",10,"Receta Hamburguesa");

        ArticuloManufacturadoDetalle detalle4 = new ArticuloManufacturadoDetalle(1,insumo1);
        ArticuloManufacturadoDetalle detalle5 = new ArticuloManufacturadoDetalle(1,insumo2);
        ArticuloManufacturadoDetalle detalle6 = new ArticuloManufacturadoDetalle(1,insumo3);
        ArticuloManufacturadoDetalle detalle7 = new ArticuloManufacturadoDetalle(1,insumo1);
        ArticuloManufacturadoDetalle detalle8 = new ArticuloManufacturadoDetalle(1,insumo2);

        articulo2.addInsumo(detalle4);
        articulo2.addInsumo(detalle5);
        articulo2.addInsumo(detalle6);
        articulo2.addInsumo(detalle7);
        articulo2.addInsumo(detalle8);

        subCategoria3.addArticulo(articulo2);


    //Promoción
        //Promo panchos
            LocalDate desde = LocalDate.of(2025, 5, 18);
            LocalDate hasta = desde.plusDays(10);
            LocalTime horaInicial = LocalTime.of(11, 30);
            LocalTime horaFinal = LocalTime.of(12, 30);
            ImagenComida imgComida = new ImagenComida("www.imgPanchoComida.com");
            ImagenComida imgComida2 = new ImagenComida("www.imgPanchoConPonchoComida.com");

            Promocion promocion1 = new Promocion("Promo 2 panchos + coca 500ml",desde,hasta,horaInicial,horaFinal,"2 panchos simples - 1 Coca 500ml",5000.00,TipoPromocion.PROMOCION1);

            promocion1.addImagenesPromo(imgComida);
            promocion1.addImagenesPromo(imgComida2);
            // Articulo Promocion
            ArticuloPromocion articuloPromo = new ArticuloPromocion(articulo1,2);
            ArticuloPromocion articuloPromo2 = new ArticuloPromocion(articulo2,1);
            promocion1.addArticulo(articuloPromo);
            promocion1.addArticulo(articuloPromo2);

    //Pedido
            DetallePedido detallePedido1 = new DetallePedido(2, articulo1);
            detallePedido1.setSubTotal(detallePedido1.calcularSubTotal());
            DetallePedido detallePedido2 = new DetallePedido(1, articulo2);
            detallePedido2.setSubTotal(detallePedido2.calcularSubTotal());

            LocalTime horafin1 = LocalTime.of(15, 30);
            LocalDate fechapedido1 = LocalDate.of(2025, 5, 18);
            Pedido pedido1 = new Pedido(Estado.PENDIENTE, TipoEnvio.TAKEAWAY, FormaPago.MERCADOPAGO, fechapedido1, sucursal, domicilio);

            pedido1.addDetallePedido(detallePedido1);
            pedido1.addDetallePedido(detallePedido2);

            pedido1.setTotal(pedido1.calcularTotal());

            pedido1.setHoraEstimadaFinalizacion(horafin1);

            Factura factura1 = new Factura(pedido1.getFechaPedido(),1,1,"xxxx", "xx", pedido1.getFormaPago(), pedido1.getTotal());

            pedido1.setFactura(factura1);


        //Usuario
            Usuario usuarioCliente = new Usuario("1", "usuario1");


        //Imagen
            ImagenPersona imagenPersona1= new ImagenPersona("www.imgPersona1.com");

        //Domicilio Persona
            Provincia Mendoza = new Provincia("Mendoza", Argentina);
            Localidad CiudadDeMendoza = new Localidad("Ciudad de Mendoza", Mendoza);
            Domicilio domicilio1 = new Domicilio("Calle1", 123, 5500, CiudadDeMendoza);

        //Cliente
            Cliente cliente1 = new Cliente("Pepito", "Programa", "261895326", "pepitoprograma@gmial.com", LocalDate.of(2000,06,03), domicilio1, usuarioCliente, imagenPersona1);


            cliente1.addPedido(pedido1);




    }
}