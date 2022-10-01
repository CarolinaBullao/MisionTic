
package beans;

public class Producto {
    private int id_producto;
    private String tipo;
    private String vatios;
    private String voltaje;
    private int cantidad;
    private int valor;

    public Producto(int id_producto, String tipo, String vatios, String voltaje, int cantidad, int valor) {
        this.id_producto = id_producto;
        this.tipo = tipo;
        this.vatios = vatios;
        this.voltaje = voltaje;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVatios() {
        return vatios;
    }

    public void setVatios(String vatios) {
        this.vatios = vatios;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", tipo=" + tipo + ", vatios=" + vatios + ", voltaje=" + voltaje + ", cantidad=" + cantidad + ", valor=" + valor + '}';
    }
    
    

}
