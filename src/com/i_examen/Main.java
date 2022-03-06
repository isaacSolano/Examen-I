package com.i_examen;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static boolean repeat = true;
    private static final CryptorHandler cHandler = new CryptorHandler();

    public static void main(String[] args) throws Exception {
        showMenu();
    }

    private static void showMenu() {
        while (repeat) {
            print("<<-- Bienvenido a Cryptor -->>\n" +
                    "Seleccione una de las siguientes opciones:\n" +
                    "1) Encriptar texto.\n" +
                    "2) Desencriptar texto.");
            String option = sc.next();
            processOption(option);
        }

    }

    private static void processOption(String option) {
        switch (option) {
            case "1":
                print("Ingrese el texto a encriptar:");
                String text = sc.next(), encrypted = cHandler.encrypt(text);
                print("Su texto encriptado es " + "<< " + encrypted + " >>");
                break;
            case "2":
                print("Ingrese el texto a desencriptar:");
                String crypted = sc.next(), decrypted = cHandler.decrypt(crypted);
                print("Su texto desencriptado es " + "<<" + decrypted + ">>");
                break;
            default:
                System.err.println("La opcion ingresada es invalida.");
        }
    }

    private static void print(String out) {
        System.out.println(out);
    }
}
