package gondolatolvaso2;

import java.util.Scanner;

public class GondolatOlvaso2 {

    private static String[] pakli = new String[21];

    public static void main(String[] args) {
        Kirak();
        Megjelenit();
        int valasztott_oszlop = Melyik();
        Kever(valasztott_oszlop);
        EzVolt();
    }

    private static String[] Kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int index = 0;
        for (int szin = 0; szin < szinek.length; szin++) {
            for (int ertek = 0; ertek < ertekek.length - 1; ertek++) {
                pakli[index] = szinek[szin] + "_" + ertekek[ertek];
                index++;
            }
        }
        return pakli;
    }

    private static String[] Megjelenit() {
        for (int szamlalo = 0; szamlalo < pakli.length; szamlalo++) {
            if (szamlalo % 3 == 0) {
                System.out.println(" ");
                System.out.printf("%-8s", pakli[szamlalo]);
            } else {
                System.out.printf("%-8s", pakli[szamlalo]);
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
        //int oszlop = 1;        
        int helytarto = 0;

        switch (valasztott_oszlop) {
            case 1:
                for (int i = 1; i < 7; i++) {

                    helytarto = i;
                    pakli[i] = pakli[19 - (i - 1) * 3];
                    pakli[19 - (i - 1) * 3] = pakli[helytarto];

                    helytarto = i + 7;
                    pakli[i + 7] = pakli[18 - (i - 1) * 3];
                    pakli[18 - (i - 1) * 3] = pakli[helytarto];

                    helytarto = i + 14;
                    pakli[i + 14] = pakli[20 - (i - 1) * 3];
                    pakli[20 - (i - 1) * 3] = pakli[helytarto];

                }
                break;

            case 2:
                for (int i = 1; i <= 7; i++) {
                    //keplet (pakli.length-1)-(i-1)*3
                    /*
                    csereHely = pakli[i];
                    int pakliIndex = (pakli.length - 1) - (i - 1) * 3;
                    pakli[i] = pakli[pakliIndex];
                     */
                    pakli[i] = pakli[19 - (i - 1) * 3];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
//            case 3:
//                for (int i = 1; i <= 7; i++) {
//                     pakli[i] = pakli[20 - (i - 1) * 3];
//                    pakli[i + 7] = pakli[21 - (i - 1) * 3];
//                    pakli[i + 14] = pakli[19 - (i - 1) * 3];
//                }
//                break;
            case 3:
                for (int i = 1; i <= 7; i++) {

                    pakli[i] = pakli[21 - (i - 1) * 3];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[i + 14] = pakli[19 - (i - 1) * 3];
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
