import domain.Tarjeta;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class App {


    public static void main(String[] args) {

        Tarjeta tarjeta1 = new Tarjeta("VISA", "4517696986248030", "María Romero", LocalDateTime.of(2024, 8, 21, 0, 0)); //vencimiento 2024
        Tarjeta tarjeta2 = new Tarjeta("NARA", "5895789403004499", "Juan Pérez", LocalDateTime.of(2025, 06, 10, 0, 0)); //vencimiento 2025
        Tarjeta tarjeta3 = new Tarjeta("AMEX", "376694038475845", "Luciana Gutierrez", LocalDateTime.of(2023, 05, 23, 0, 0)); //vencimiento 2023
        Tarjeta tarjeta4 = new Tarjeta("VISA", "4517994005045545", "Brenda Guzmán", LocalDateTime.of(2021, 04, 16, 0, 0)); //vencimiento 2021

        //mostrar información de la tarjeta

        System.out.println(tarjeta1.toString());
        System.out.println(tarjeta2.toString());
        System.out.println(tarjeta3.toString());
        System.out.println(tarjeta4.toString());

        //informar si la tarjeta es válida

        tarjeta1.verificarVencimiento();
        tarjeta2.verificarVencimiento();
        tarjeta3.verificarVencimiento();
        tarjeta4.verificarVencimiento();

        //identificar si una tarjeta es distinta a otra
        System.out.println("La tarjeta de " + tarjeta1.getCardholder() + " es igual a la de " + tarjeta2.getCardholder() +
                "?");
        System.out.println(tarjeta1.equals(tarjeta2));

        //verificar validez para operar
        tarjeta1.verificarValidez(1000);
        tarjeta2.verificarValidez(1100);
        tarjeta3.verificarValidez(958.23);
        tarjeta4.verificarValidez(223);


        LocalDateTime currentDate = LocalDateTime.now();
        int currentDay = currentDate.getDayOfMonth();
        Month currentMonth = currentDate.getMonth();
        int currentYear = currentDate.getYear();


        //mostrar la tasa de las tarjetas
        int getYear = 24;
        int getMonthOfYear = 8;
        System.out.println("La tasa de la tarjeta " + tarjeta1.getMarca() + " es: " + tarjeta1.TasaTarjeta(getYear / getMonthOfYear) + "%");
        int getDayOfMonth = 10;
        System.out.println("La tasa de la tarjeta " + tarjeta2.getMarca() + " es: " + tarjeta2.TasaTarjeta(getDayOfMonth * 0.5) + "%");
        getMonthOfYear = 5;
        System.out.println("La tasa de la tarjeta " + tarjeta3.getMarca() + "es: " + tarjeta3.TasaTarjeta(getMonthOfYear * 0.1) + "%");


    }
}
