
package beans;

import java.sql.Date;

public class Cotizacion {
    private int id_cotizacion;
    private Date fecha;
    private int tiempo_solh; //horas de sol al dia
    private double precio_kwh;
    private double promedio_consumo;
    private String username;
    private int id_producto;

    public Cotizacion(int id_cotizacion, Date fecha, int tiempo_solh, double precio_kwh, double promedio_consumo, String username, int id_producto) {
        this.id_cotizacion = id_cotizacion;
        this.fecha = fecha;
        this.tiempo_solh = tiempo_solh;
        this.precio_kwh = precio_kwh;
        this.promedio_consumo = promedio_consumo;
        this.username = username;
        this.id_producto = id_producto;
    }

    public int getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(int id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTiempo_solh() {
        return tiempo_solh;
    }

    public void setTiempo_solh(int tiempo_solh) {
        this.tiempo_solh = tiempo_solh;
    }

    public double getPrecio_kwh() {
        return precio_kwh;
    }

    public void setPrecio_kwh(double precio_kwh) {
        this.precio_kwh = precio_kwh;
    }

    public double getPromedio_consumo() {
        return promedio_consumo;
    }

    public void setPromedio_consumo(double promedio_consumo) {
        this.promedio_consumo = promedio_consumo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "id_cotizacion=" + id_cotizacion + ", fecha=" + fecha + ", tiempo_solh=" + tiempo_solh + ", precio_kwh=" + precio_kwh + ", promedio_consumo=" + promedio_consumo + ", username=" + username + ", id_producto=" + id_producto + '}';
    }

    
    
    
}