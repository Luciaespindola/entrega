import domain.Tarjeta;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        Tarjeta tarjeta1 = new Tarjeta("VISA", "4517696986248030", "María Gonzalez", new Date(124,02,21)); //vencimiento 2024
        Tarjeta tarjeta2 = new Tarjeta("NARA", "5895789403004499", "Juan Pérez", new Date(125,00,15)); //vencimiento 2025
        Tarjeta tarjeta3 = new Tarjeta("AMEX", "376694038475845", "Luciana Gutierrez", new Date(123,05,23)); //vencimiento 2023
        Tarjeta tarjeta4 = new Tarjeta("VISA", "4517994005045545", "Brenda Guzmán", new Date(121,04,16)); //vencimiento 2021

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
        System.out.println("La tarjeta de " + tarjeta1.getCardholder() + "es igual a la de " + tarjeta2.getCardholder() +
                "?");
        System.out.println(tarjeta1.equals(tarjeta2));
        //verificar validez para operar

        tarjeta1.verificarValidez( 1000);
        tarjeta2.verificarValidez( 1100);
        tarjeta3.verificarValidez( 958.23);
        tarjeta4.verificarValidez( 223);



    }
}
