public class ConversionDeDivisas {

    private String monedaBase;
    private String monedaCambio;
    private double cantidadBase;
    private double cantidadCambio;
    private double cantidadConvertida;


    public ConversionDeDivisas(String monedaBase, String monedaCambio, double cantidadBase) {
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.cantidadBase = cantidadBase;
        ConsultaDeDivisas divisas = new ConsultaDeDivisas();
        Monedas consultarMonedas = divisas.buscarTipoMoneda(monedaBase,monedaCambio);
        System.out.println("La conversion para hoy de:"+monedaBase+" a "+monedaCambio+" es de: "+consultarMonedas.conversion_rate());
        this.cantidadCambio = consultarMonedas.conversion_rate();
        this.cantidadConvertida = (this.cantidadBase)*(this.cantidadCambio);

    }



    public double getCantidadConvertida() {
        return cantidadConvertida;
    }
}
