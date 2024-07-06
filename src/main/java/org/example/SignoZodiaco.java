package org.example;
import java.util.Scanner;

public class SignoZodiaco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Introduce tu día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        String signoZodiaco = "";

        switch (mes) {
            case 1: // Enero
                if (dia >= 1 && dia <= 19) {
                    signoZodiaco = "Capricornio";
                } else if (dia >= 20 && dia <= 31) {
                    signoZodiaco = "Acuario";
                }
                break;
            case 2: // Febrero
                if (dia >= 1 && dia <= 18) {
                    signoZodiaco = "Acuario";
                } else if (dia >= 19 && dia <= 29) {
                    signoZodiaco = "Piscis";
                }
                break;
            case 3: // Marzo
                if (dia >= 1 && dia <= 20) {
                    signoZodiaco = "Piscis";
                } else if (dia >= 21 && dia <= 31) {
                    signoZodiaco = "Aries";
                }
                break;
            case 4: // Abril
                if (dia >= 1 && dia <= 19) {
                    signoZodiaco = "Aries";
                } else if (dia >= 20 && dia <= 30) {
                    signoZodiaco = "Tauro";
                }
                break;
            case 5: // Mayo
                if (dia >= 1 && dia <= 20) {
                    signoZodiaco = "Tauro";
                } else if (dia >= 21 && dia <= 31) {
                    signoZodiaco = "Géminis";
                }
                break;
            case 6: // Junio
                if (dia >= 1 && dia <= 20) {
                    signoZodiaco = "Géminis";
                } else if (dia >= 21 && dia <= 30) {
                    signoZodiaco = "Cáncer";
                }
                break;
            case 7: // Julio
                if (dia >= 1 && dia <= 22) {
                    signoZodiaco = "Cáncer";
                } else if (dia >= 23 && dia <= 31) {
                    signoZodiaco = "Leo";
                }
                break;
            case 8: // Agosto
                if (dia >= 1 && dia <= 22) {
                    signoZodiaco = "Leo";
                } else if (dia >= 23 && dia <= 31) {
                    signoZodiaco = "Virgo";
                }
                break;
            case 9: // Septiembre
                if (dia >= 1 && dia <= 22) {
                    signoZodiaco = "Virgo";
                } else if (dia >= 23 && dia <= 30) {
                    signoZodiaco = "Libra";
                }
                break;
            case 10: // Octubre
                if (dia >= 1 && dia <= 22) {
                    signoZodiaco = "Libra";
                } else if (dia >= 23 && dia <= 31) {
                    signoZodiaco = "Escorpio";
                }
                break;
            case 11: // Noviembre
                if (dia >= 1 && dia <= 21) {
                    signoZodiaco = "Escorpio";
                } else if (dia >= 22 && dia <= 30) {
                    signoZodiaco = "Sagitario";
                }
                break;
            case 12: // Diciembre
                if (dia >= 1 && dia <= 21) {
                    signoZodiaco = "Sagitario";
                } else if (dia >= 22 && dia <= 31) {
                    signoZodiaco = "Capricornio";
                }
                break;
            default:
                signoZodiaco = "Mes no válido";
        }

        if (signoZodiaco.equals("")) {
            signoZodiaco = "Día no válido para el mes ingresado";
        }

        System.out.println("Tu signo del zodíaco es: " + signoZodiaco);

        scanner.close();
    }
}
