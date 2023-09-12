package gondolatolvaso2;

import java.util.Scanner;

public class GondolatOlvaso2 {

    private static String[] pakli = new String[22];

    public static void main(String[] args) {
        Kirak();
        Megjelenit();
        int valasztott_oszlop = Melyik();
        Kever(valasztott_oszlop);
        EzVolt();
    }

    private static String[] Kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "XIII"};

        int index = 0;
        for (String szin : szinek) {
            for (int ertek = 0; index < 22 && ertek < ertekek.length; ertek++) {
                pakli[index++] = szin + "_" + ertekek[ertek];
            }
        }

        return pakli;
    }

    private static String[] Megjelenit() {
        for (int szamlalo = 1; szamlalo < pakli.length; szamlalo++) {
            String lap = pakli[szamlalo];
            System.out.printf("%-8s", lap);
            if (szamlalo % 3 == 0) {
                System.out.println("");
            }
        }
        return pakli;

    }

    private static int Melyik() {
        Scanner sc = new Scanner(System.in);
        boolean jo;
        int kimeno;
        do {
            System.out.println("\nKérem adja meg melyik oszlopot választja:");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
            kimeno = oszlop;
        } while (!jo);

        return kimeno;
    }

    private static void Kever(int valasztott_oszlop) {
        System.out.println("");
        String helytarto;

        switch (valasztott_oszlop) {
            case 1:
                for (int i = 1; i < 7; i++) {

                    helytarto = pakli[i];
                    pakli[i] = pakli[20 - (i - 1) * 3];
                    pakli[20 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 7];
                    pakli[i + 7] = pakli[19 - (i - 1) * 3];
                    pakli[19 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 14];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                    pakli[21 - (i - 1) * 3] = helytarto;
                }
                break;

            case 2:
                for (int i = 1; i <= 7; i++) {

                    helytarto = pakli[i];
                    pakli[i] = pakli[19 - (i - 1) * 3];
                    pakli[19 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 7];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[20 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 14];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                    pakli[21 - (i - 1) * 3] = helytarto;
                }
                break;

            case 3:
                for (int i = 1; i <= 7; i++) {

                    helytarto = pakli[i];
                    pakli[i] = pakli[21 - (i - 1) * 3];
                    pakli[21 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 7];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[20 - (i - 1) * 3] = helytarto;

                    helytarto = pakli[i + 14];
                    pakli[i + 14] = pakli[19 - (i - 1) * 3];
                    pakli[19 - (i - 1) * 3] = helytarto;
                }
                break;

            default:
                throw new AssertionError();
        }
        Megjelenit();

    }

    private static boolean EzVolt() {
        boolean ezVolt = false;
        return ezVolt;
    }

}
