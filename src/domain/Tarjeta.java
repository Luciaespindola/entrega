package domain;

import java.util.Date;
import java.util.Objects;

public class Tarjeta {

    private String marca;
    //el nro de tarjeta al ser un valor de identificación, lo declaro como String
    private String numeroTarjeta;
    private String cardholder;
    private Date fechaVencimiento;

    public Tarjeta(String marca, String numeroTarjeta, String cardholder, Date fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void verificarVencimiento () {

        if (fechaVencimiento.compareTo(new Date()) > 0 ) {
            System.out.println("La tarjeta de " + cardholder + " está en vigencia.");
        } else {
            System.out.println("La tarjeta de " + cardholder + " se encuentra vencida.");
        }
    }

    public void verificarValidez (double consumo) {

        if (consumo < 1000) {
            System.out.println("La operación es de: $" + consumo );
        } else {
            System.out.println("La operación excede el límite de $1000");
        }
    }

    //sobreescribo el método toString para que me muestre los atributos de la tarjeta
    @Override
    public String toString() {
        return numeroTarjeta + ", " + cardholder + ", fecha de vencimiento: " + fechaVencimiento +
                ", " + marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) o;
        return Objects.equals(numeroTarjeta, tarjeta.numeroTarjeta);
    }
}
