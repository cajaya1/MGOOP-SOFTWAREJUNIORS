package ec.edu.espe.BethsabeBoutique.controller.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author caeta
 */

public class BetterScanner {
    private Scanner scanner;

    public BetterScanner() {
        scanner = new Scanner(System.in);
    }

    public int getValidInt() {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Ingrese solamente valores enteros");
            System.out.print("Ingrese el número nuevamente: ");
            scanner.nextLine(); // Limpiar el búfer del scanner
            number = getValidInt(); // Llamada recursiva para solicitar el número nuevamente
        }
        return number;
    }

    public float getValidFloat() {
        float number = 0;
        try {
            number = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Ingrese solamente valores numéricos");
            System.out.print("Ingrese el número nuevamente: ");
            scanner.nextLine(); // Limpiar el búfer del scanner
            number = getValidFloat(); // Llamada recursiva para solicitar el número nuevamente
        }
        return number;
    }

    public String getNoSpacedString() {
        String text = "";
        try {
            text = scanner.next();
        } catch (InputMismatchException e) {
            System.err.println("Ingrese solamente texto");
            System.out.print("Ingrese el texto nuevamente: ");
            scanner.nextLine(); // Limpiar el búfer del scanner
            text = getNoSpacedString(); // Llamada recursiva para solicitar el texto nuevamente
        }
        return text;
    }
}
