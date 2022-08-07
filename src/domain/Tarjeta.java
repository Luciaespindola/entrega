package domain;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class Tarjeta {

    private String marca;
    //el nro de tarjeta al ser un valor de identificación, lo declaro como String
    private String numeroTarjeta;
    private String cardholder;
    private LocalDateTime fechaVencimiento;

    //paso como constantes los valores de la tasa de las tarjetas
    //Visa: se toman dia y mes de vencimiento en formato AA y MM ,y se dividen
    private double VISA = 24 / 5;
    //Nara: se toma el dia del vencimiento y se multiplica por 0.5
    private double NARA = 10 * 0.5;
    //Amex: se toma el mes de vencimiento y se multiplica por 0.1
    private double AMEX = 5 * 0.1;


    //constructor para instanciar los obj.
    public Tarjeta(String marca, String numeroTarjeta, String cardholder, LocalDateTime fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    //get para que me retorne los valores del atributo
    //set para modificar los valores del objeto
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

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //método para verificar el vencimiento de la tarj.
    public void verificarVencimiento() {
        if (fechaVencimiento.compareTo(LocalDateTime.now()) > 0) {
            System.out.println("La tarjeta de " + cardholder + " está en vigencia.");
        } else {
            System.out.println("La tarjeta de " + cardholder + " se encuentra vencida.");
        }
    }

    //método para verificar validez de la tarj.
    public void verificarValidez(double consumo) {

        if (consumo < 1000) {
            System.out.println("La operación es de: $" + consumo);
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

    //sobreescribo el metodo equals para comparar las tarjetas y saber si son distintas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) o;
        return Objects.equals(numeroTarjeta, tarjeta.numeroTarjeta);
    }

    //método para saber la tasa de interés de la tarjeta
    public double TasaTarjeta(double tasa) {

        if (this.marca.equals(VISA)) {
            this.VISA = tasa;

        } else if (this.marca.equals(NARA)) {
           this.NARA = tasa;

        }if (this.marca.equals(AMEX)) {
            this.AMEX = tasa;

        } return tasa;
    }
}