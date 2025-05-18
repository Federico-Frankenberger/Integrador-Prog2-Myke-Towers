import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
    //Empresa
        Empresa empresa  = new Empresa("Todo Rico","TodoRico s.r.l",33270072);

    //Domicilio
        Pais pais = new Pais("Argentina");
        Provincia provincia = new Provincia("Mendoza",pais);
        Localidad localidad = new Localidad("Godoy Cruz",provincia);
        Domicilio domicilio = new Domicilio("Güemes",243,5501,localidad);

    //Sucursal
        LocalTime horarioApertura = LocalTime.of(8,30);
        LocalTime horarioCierre = LocalTime.of(21,30);
        Sucursal sucursal = new Sucursal("Sucursal-1",horarioApertura,horarioCierre,domicilio);

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

    //Articulo Insumo
        //Insumo Pancho
        ArticuloInsumo insumo1 = new ArticuloInsumo("Pan Bimbo Pancho",1000.00,800.00,10,100,false);
        ArticuloInsumo insumo2 = new ArticuloInsumo("Salchica Fate",500.00,400.00,10,100,false);
        ArticuloInsumo insumo3 = new ArticuloInsumo("Lluvia de papas",100.00,50.00,10,100,false);
        //Insumo Hamburguesa
        ArticuloInsumo insumo4 = new ArticuloInsumo("Pan Bimbo Hamburguesa",500.00,400.00,10,100,false);
        ArticuloInsumo insumo5 = new ArticuloInsumo("Hamburguesa Paty",1000.00,800.00,10,100,false);
        ArticuloInsumo insumo6 = new ArticuloInsumo("Tomate",500.00,400.00,10,100,false);
        ArticuloInsumo insumo7 = new ArticuloInsumo("Lechuga",1000.00,800.00,10,100,false);
        ArticuloInsumo insumo8 = new ArticuloInsumo("Huevo",500.00,400.00,10,100,false);


    //Articulo manufacturado
        //Pancho
        ArticuloManufacturado articulo1 = new ArticuloManufacturado("Pancho",2000.00,"Tipo simple",10,"Receta panchito");

        ArticuloManufacturadoDetalle detalle1 = new ArticuloManufacturadoDetalle(1,insumo1);
        ArticuloManufacturadoDetalle detalle2 = new ArticuloManufacturadoDetalle(1,insumo2);
        ArticuloManufacturadoDetalle detalle3 = new ArticuloManufacturadoDetalle(1,insumo3);

        articulo1.addInsumo(detalle1);
        articulo1.addInsumo(detalle2);
        articulo1.addInsumo(detalle3);

        subCategoria.addArticulo(articulo1);
        //Hamburguesa
        ArticuloManufacturado articulo2 = new ArticuloManufacturado("Hamburguesa",10000.00,"Tipo simple",10,"Receta Hamburguesa");

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

            Promocion promocion1 = new Promocion("Promo panchos",desde,hasta,horaInicial,horaFinal,"Dos X Unos",3000.00,TipoPromocion.PROMOCION1);

            promocion1.addImagenesPromo(imgComida);
            promocion1.addImagenesPromo(imgComida2);
            // Articulo Promocion
            ArticuloPromocion articuloPromo = new ArticuloPromocion(articulo1,2);
            promocion1.addArticulo(articuloPromo);

    }
}