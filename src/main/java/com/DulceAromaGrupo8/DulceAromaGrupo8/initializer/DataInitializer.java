package com.DulceAromaGrupo8.DulceAromaGrupo8.initializer;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.*;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.Estado;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.FormaPago;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.TipoEnvio;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.TipoPromocion;
import com.DulceAromaGrupo8.DulceAromaGrupo8.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ArticuloRepository articuloRepository;
    private final ArticuloInsumoRepository articuloInsumoRepository;
    private final ArticuloManufacturadoRepository articuloManufacturadoRepository;
    private final ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
    private final CategoriaRepository categoriaRepository;
    private final ClienteRepository clienteRepository;
    private final DetallePedidoRepository detallePedidoRepository;
    private final DomicilioRepository domicilioRepository;
    private final EmpleadoRepository empleadoRepository;
    private final EmpresaRepository empresaRepository;
    private FacturasRepository facturasRepository = null;
    private final ImagenArticuloRepository imagenArticuloRepository;
    private final ImagenClienteRepository imagenClienteRepository;
    private final ImagenEmpleadoRepository imagenEmpleadoRepository;
    private final ImagenPromocionRepository imagenPromocionRepository;
    private final LocalidadRepository localidadRepository;
    private final PaisRepository paisRepository;
    private final PedidoRepository pedidoRepository;
    private final PromocionRepository promocionRepository;
    private final PromocionDetalleRepository promocionDetalleRepository;
    private final ProvinciaRepository provinciaRepository;
    private final SucursalRepository sucursalRepository;
    private final UnidadMedidaRepository unidadMedidaRepository;
    private final UsuarioClienteRepository usuarioClienteRepository;
    private final UsuarioEmpleadoRepository usuarioEmpleadoRepository;

    public DataInitializer(ArticuloRepository articuloRepository, ArticuloInsumoRepository articuloInsumoRepository, ArticuloManufacturadoRepository articuloManufacturadoRepository, ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository, CategoriaRepository categoriaRepository, ClienteRepository clienteRepository, DetallePedidoRepository detallePedidoRepository, DomicilioRepository domicilioRepository, EmpleadoRepository empleadoRepository, EmpresaRepository empresaRepository, FacturasRepository facturasRepository, ImagenArticuloRepository imagenArticuloRepository, ImagenClienteRepository imagenClienteRepository, ImagenEmpleadoRepository imagenEmpleadoRepository, ImagenPromocionRepository imagenPromocionRepository, LocalidadRepository localidadRepository, PaisRepository paisRepository, PedidoRepository pedidoRepository, PromocionRepository promocionRepository, PromocionDetalleRepository promocionDetalleRepository, ProvinciaRepository provinciaRepository, SucursalRepository sucursalRepository, UnidadMedidaRepository unidadMedidaRepository, UsuarioClienteRepository usuarioClienteRepository, UsuarioEmpleadoRepository usuarioEmpleadoRepository) {
        this.articuloRepository = articuloRepository;
        this.articuloInsumoRepository = articuloInsumoRepository;
        this.articuloManufacturadoRepository = articuloManufacturadoRepository;
        this.articuloManufacturadoDetalleRepository = articuloManufacturadoDetalleRepository;
        this.categoriaRepository = categoriaRepository;
        this.clienteRepository = clienteRepository;
        this.detallePedidoRepository = detallePedidoRepository;
        this.domicilioRepository = domicilioRepository;
        this.empleadoRepository = empleadoRepository;
        this.empresaRepository = empresaRepository;
        this.facturasRepository = facturasRepository;
        this.imagenArticuloRepository = imagenArticuloRepository;
        this.imagenClienteRepository = imagenClienteRepository;
        this.imagenEmpleadoRepository = imagenEmpleadoRepository;
        this.imagenPromocionRepository = imagenPromocionRepository;
        this.localidadRepository = localidadRepository;
        this.paisRepository = paisRepository;
        this.pedidoRepository = pedidoRepository;
        this.promocionRepository = promocionRepository;
        this.promocionDetalleRepository = promocionDetalleRepository;
        this.provinciaRepository = provinciaRepository;
        this.sucursalRepository = sucursalRepository;
        this.unidadMedidaRepository = unidadMedidaRepository;
        this.usuarioClienteRepository = usuarioClienteRepository;
        this.usuarioEmpleadoRepository = usuarioEmpleadoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Ejemplo de precarga de datos para cada entidad

        // UnidadMedida
        UnidadMedida unidadMedida = new UnidadMedida();
        unidadMedida.setDenominacion("Kilogramo");
        unidadMedidaRepository.save(unidadMedida);

        // ArticuloInsumo
        ArticuloInsumo insumo = new ArticuloInsumo();
        insumo.setDenominacion("Azúcar");
        insumo.setPrecioVenta(50.0);
        insumo.setPrecioCompra(30.0);
        insumo.setStockActual(100);
        insumo.setStockMaximo(200);
        insumo.setEsParaElaborar(true);
        insumo.setUnidadMedida(unidadMedida);
        articuloInsumoRepository.save(insumo);

        // Categoria
        Categoria categoria = new Categoria();
        categoria.setDenominacion("Postres");
        categoria.setEsInsumo(true);
        categoriaRepository.save(categoria);


        // ArticuloManufacturado
        ArticuloManufacturado manufacturado = new ArticuloManufacturado();
        manufacturado.setDenominacion("Tarta de Manzana");
        manufacturado.setPrecioVenta(300.0);
        manufacturado.setDescripcion("Deliciosa tarta de manzana casera");
        manufacturado.setTiempoEstimadoMinutos(60);
        manufacturado.setPreparacion("Preparar la masa, cortar las manzanas...");
        manufacturado.setUnidadMedida(unidadMedida);
        articuloManufacturadoRepository.save(manufacturado);

        ArticuloManufacturadoDetalle detalle1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .articuloInsumo(insumo)
                .articuloManufacturado(manufacturado)
                .build();
        articuloManufacturadoDetalleRepository.save(detalle1);

        // Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Pérez");
        cliente.setTelefono("123456789");
        cliente.setEmail("juan.perez@example.com");
        cliente.setFechaNacimiento(LocalDate.of(1990, 1, 1));
        clienteRepository.save(cliente);

        // Domicilio
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Calle Falsa");
        domicilio.setNumero(123);
        domicilio.setCp(5000);
        domicilioRepository.save(domicilio);

        // Agregar domicilios al cliente
        Set<Domicilio> domicilios = new HashSet<>();
        domicilios.add(domicilio);
        cliente.setDomicilios(domicilios);
        clienteRepository.save(cliente);
        // Empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Carlos");
        empleado.setApellido("Gómez");
        empleado.setTelefono("987654321");
        empleado.setEmail("carlos.gomez@example.com");
        empleado.setFechaNacimiento(LocalDate.of(1985, 5, 15));
        empleadoRepository.save(empleado);

        // Empresa
        Empresa empresa = new Empresa();
        empresa.setNombre("Dulce Aroma S.A.");
        empresa.setRazonSocial("Dulce Aroma Sociedad Anónima");
        empresa.setCuil(307080123);
        empresaRepository.save(empresa);

        // Factura
        Factura factura = new Factura();
        factura.setFechaFacturacion(LocalDate.now());
        factura.setMpPaymentId(12345);
        factura.setMpMerchantOrderId(67890);
        factura.setMpPreferenceId("pref_123456");
        factura.setMpPaymentType("credit_card");
        factura.setFormaPago(FormaPago.MERCADOPAGO);
        factura.setTotalVenta(500.0);
        facturasRepository.save(factura);

        // ImagenArticulo
        ImagenArticulo imagenArticulo = new ImagenArticulo();
        imagenArticulo.setDenominacion("imagen1.jpg");
        imagenArticuloRepository.save(imagenArticulo);

        // ImagenCliente
        ImagenCliente imagenCliente = new ImagenCliente();
        imagenCliente.setDenominacion("cliente1.jpg");
        imagenClienteRepository.save(imagenCliente);
        // ImagenEmpleado
        ImagenEmpleado imagenEmpleado = new ImagenEmpleado();
        imagenEmpleado.setDenominacion("empleado1.jpg");
        imagenEmpleadoRepository.save(imagenEmpleado);

        // ImagenPromocion
        ImagenPromocion imagenPromocion = new ImagenPromocion();
        imagenPromocion.setDenominacion("promo1.jpg");
        imagenPromocionRepository.save(imagenPromocion);

        // Localidad
        Localidad localidad = new Localidad();
        localidad.setNombre("Córdoba");
        localidadRepository.save(localidad);

        // Pais
        Pais pais = new Pais();
        pais.setNombre("Argentina");
        paisRepository.save(pais);

        // Crear instancia de DetallePedido
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setCantidad(2); // Establecer la cantidad
        detallePedido.setSubTotal(50.0); // Establecer el subtotal
        Articulo articulo = articuloRepository.findById(1L).orElse(null);
        detallePedido.setArticulo(articulo);

        // Pedido
        Pedido pedido = new Pedido();
        pedido.setHoraEstimadaFinalizacion(LocalTime.of(14, 30));
        pedido.setTotal(1000.0);
        pedido.setTotalCosto(800.0);
        pedido.setEstado(Estado.PREPARACION);
        pedido.setTipoEnvio(TipoEnvio.DELIVERY);
        pedido.setFormaPago(FormaPago.EFECTIVO);
        pedido.setFechaPedido(LocalDate.now());
        pedido.setFactura(factura);
        pedido.setEmpleado(empleado);
        pedido.setDomicilio(domicilio);
        pedido.setSucursal(null);  // Asignar sucursal apropiada
        pedido.setCliente(cliente);
        pedido.getDetallePedidoSet().add(detallePedido);
        pedidoRepository.save(pedido);

        
        // Promocion
        Promocion promocion = new Promocion();
        promocion.setDenominacion("Promo Verano");
        promocion.setDescripcionDescuento("Descuento del 20% en postres de verano");
        promocion.setFechaDesde(LocalDate.of(2023, 1, 1));
        promocion.setFechaHasta(LocalDate.of(2023, 3, 31));
        promocion.setTipoPromocion(TipoPromocion.PROMOCION);
        promocion.setPrecioPromocional(20.0);
        promocionRepository.save(promocion);

        // Sucursal
        Sucursal sucursal = new Sucursal();
        sucursal.setNombre("Sucursal Centro");
        sucursal.setCasaMatriz(true);
        sucursal.setHorarioApertura(10,00);
        sucursal.setHorarioCierre(23,00);
        sucursal.setDomicilio(domicilio);
        pedido.setSucursal(sucursal);
        sucursalRepository.save(sucursal);


        // UsuarioCliente
        UsuarioCliente usuarioCliente = new UsuarioCliente("auth0|123456", "juanperez");
        usuarioClienteRepository.save(usuarioCliente);


        // UsuarioEmpleado
        UsuarioEmpleado usuarioEmpleado = new UsuarioEmpleado("auth0|789012", "carlosgomez");
        usuarioEmpleadoRepository.save(usuarioEmpleado);
    }
}
