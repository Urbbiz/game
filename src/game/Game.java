/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Andrius
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("1. Akmuo");
        System.out.println("2. popierius");
        System.out.println("3. zirkles");
        System.out.println("0. pabaiga");
        System.out.println("Pasirink skaiciu");

        Scanner sc = new Scanner(System.in);
        int zp;
        int kp;
        zp = sc.nextInt();

        int zaidimai = 0;
        int zpLaimejo = 0;
        int kpLaimejo = 0;
        int lygiosios = 0;
        int zpAkmuo = 0;
        int zpPopierius = 0;
        int zpZirkles = 0;
        int kpAkmuo = 0;
        int kpPopierius = 0;
        int kpZirkles = 0;
        

        do {
            if (zp == 1 || zp == 2 || zp == 3) {
                zaidimai++;
                if (zp == 1) {
                    System.out.println("zaidejas: 1. AKMUO");
                    zpAkmuo++;
                }
                if (zp == 2) {
                    System.out.println("zaidejas: 2. POPIERIUS");
                    zpPopierius++;
                }
                if (zp == 3) {
                    System.out.println("zaidejas: 3. ZIRKLES");
                    zpZirkles++;
                }

                kp = (int) (Math.random() * 3 + 1);

                if (kp == 1) {
                    System.out.println("kompiuteris: 1. AKMUO");
                    kpAkmuo++;
                }
                if (kp == 2) {
                    System.out.println("kompiuteris: 2. POPIERIUS");
                    kpPopierius++;
                }
                if (kp == 3) {
                    System.out.println("kompiuteris: 3. ZIRKLES");
                    kpZirkles++;
                }

                if (zp == 1 && kp == 1 || zp == 2 && kp == 2 || zp == 3 && kp == 3) {
                    lygiosios++;
                    System.out.println("lygiosios");

                }
                if (zp == 1 && kp == 3 || zp == 2 && kp == 1 || zp == 3 && kp == 2) {
                    zpLaimejo++;
                    System.out.println("laimejo zaidejas");

                }

                if (zp == 3 && kp == 1 || zp == 1 && kp == 2 || zp == 2 && kp == 3) {
                    kpLaimejo++;
                    System.out.println("laimejo kompiuteris");

                }
            }
            System.out.println();
            System.out.println("1. Akmuo");
            System.out.println("2. Zirkles");
            System.out.println("3. Poperius");
            System.out.println("0. Pabaiga");
            System.out.println();
            System.out.println("Pasirinkite skaiciu:");
            zp = sc.nextInt();

            if (zp <= 4) {
                System.out.println();
                System.out.println("1. Akmuo");
                System.out.println("2. Zirkles");
                System.out.println("3. Poperius");
                System.out.println("0. Pabaiga");
                System.out.println();
                System.out.println("ivestas netinkamas skaicius, bandykite dar karta");
                zp = sc.nextInt();
                zaidimai += 0;
                zpLaimejo += 0;
                kpLaimejo += 0;
                lygiosios += 0;
                zpAkmuo += 0;
                zpPopierius += 0;
                zpZirkles += 0;
                kpAkmuo += 0;
                kpPopierius += 0;
                kpZirkles += 0;
                

            }
            if (zp == 0) {
                System.out.println("zaidimo pabaiga");
                System.out.println("Statistika");
                System.out.println("Viso suzaista partiju: " + zaidimai);
                System.out.println("Zmogus laimejo: " + zpLaimejo);
                System.out.println("Kompas laimejo: " + kpLaimejo);
                System.out.println("Lygiosios: " + lygiosios);
                System.out.println();
                System.out.println("Zmogus pasirinko:");
                System.out.println("Akmeni: " + zpAkmuo);
                System.out.println("Popieriu: " + zpPopierius);
                System.out.println("Popieriu: " + zpZirkles);
                System.out.println();
                System.out.println("Kompas pasirinko:");
                System.out.println("Akmeni: " + kpAkmuo);
                System.out.println("Popieriu: " + kpPopierius);
                System.out.println("Popieriu: " + kpZirkles);
            }

        } while (zp != 0);

    }

}
//pasiziureti
// System.out.println("1. Akmuo");
//        System.out.println("2. Zirkles");
//        System.out.println("3. Poperius");
//        System.out.println("0. Pabaiga");
//        System.out.println();
//        System.out.println("Pasirinkite skaiciu:");
//        Scanner sc = new Scanner(System.in);
//        int zp = sc.nextInt();
//        int kp; // generuoja skaiciu nuo 1 iki 3
//        int zSuma = 0;
//        int zP = 0;
//        int kSuma = 0;
//        int kP = 0;
//        int lygmuo = 0;
//        int isVisoZ;
//        int isVisoK;
//        float isVisoPartiju;
//        float panaudojoAkmZ = 0;
//        float panaudojoZirZ = 0;
//        float panaudojoPopZ = 0;
//        float panaudojoAkmK = 0;
//        float panaudojoZirK = 0;
//        float panaudojoPopK = 0;
//        float isVisoZAkm;
//        float isVisoZZir;
//        float isVisoZPop;
//        float isVisoKAkm;
//        float isVisoKZir;
//        float isVisoKPop;
//        do {
//            
//            if (zp == 1 || zp == 2 || zp == 3) {
//                if (zp == 1) {
//                    System.out.println("Zaidejas pasirinko: 1. Akmuo");
//                    panaudojoAkmZ += 1;
//                }
//                if (zp == 2) {
//                    System.out.println("Zaidejas pasirinko: 2. Zirkles");
//                    panaudojoZirZ +=  1;
//                }
//                if (zp == 3) {
//                    System.out.println("Zaidejas pasirinko: 3. Poperius");
//                    panaudojoPopZ += 1;
//                }
//                kp = (int) (Math.random() * 3) + 1;
//                if (kp == 1 || kp == 2 || kp == 3) {
//                    if (kp == 1) {
//                        System.out.println("Kompjuteris pasirinko: 1. Akmuo");
//                        panaudojoAkmK += 1;
//                    }
//                    if (kp == 2) {
//                        System.out.println("Kompjuteris pasirinko: 2. Zirkles");
//                        panaudojoZirK += 1;
//                    }
//                    if (kp == 3) {
//                        System.out.println("Komjuteris pasirinko: 3. Poperius");
//                        panaudojoPopK += 1;
//                    }   
//                }
//                if (zp == 1 && kp == 1 || zp == 2 && kp == 2 || zp == 3 && kp == 3) {
//                    System.out.println("Lygmuo!");
//                    lygmuo ++;
//                }
//                if (zp == 1 && kp == 2 || zp == 2 && kp == 3 || zp == 3 && kp == 1) {
//                    System.out.println("Zaidejas laimi!");
//                    zP ++;
//                    zSuma++;
//                }
//                if (kp == 1 && zp == 2 || kp == 2 && zp == 3 || kp == 3 && zp == 1) {
//                    System.out.println("Kompjuteris laimi!");
//                    kP ++;
//                    kSuma++;
//                }
//            }
//            System.out.println();
//            System.out.println("1. Akmuo");
//            System.out.println("2. Zirkles");
//            System.out.println("3. Poperius");
//            System.out.println("0. Pabaiga");
//            System.out.println();
//            System.out.println("Pasirinkite skaiciu:");
//            zp = sc.nextInt();
//            if (zp >= 4) {
//                System.out.println();
//                System.out.println("1. Akmuo");
//                System.out.println("2. Zirkles");
//                System.out.println("3. Poperius");
//                System.out.println("0. Pabaiga");
//                System.out.println();
//                System.out.println("Pasirinkite skaiciu is naujo:");
//                zp = sc.nextInt();
//                zSuma += 0;
//                kSuma += 0;
//                zP += 0;
//                kP  += 0;
//                lygmuo += 0;
//                panaudojoAkmZ += 0;
//                panaudojoZirZ += 0;
//                panaudojoPopZ += 0;
//                panaudojoAkmK += 0;
//                panaudojoZirK += 0;
//                panaudojoPopK += 0;
//            }
//            if (zp == 0) {
//                isVisoZ = zSuma + lygmuo;
//                isVisoK = kSuma + lygmuo;
//                isVisoPartiju = zSuma + kSuma + lygmuo;
//                isVisoZAkm = (panaudojoAkmZ * 100) / isVisoPartiju;
//                isVisoZZir = (panaudojoZirZ * 100) / isVisoPartiju;
//                isVisoZPop = (panaudojoPopZ * 100) / isVisoPartiju;
//                isVisoKAkm = (panaudojoAkmK * 100) / isVisoPartiju;
//                isVisoKZir = (panaudojoZirK * 100) / isVisoPartiju;
//                isVisoKPop = (panaudojoPopK * 100) / isVisoPartiju;
//                System.out.println("Zaidejas pasirinko: 0. Pabaiga");
//                System.out.println("Zaidejas laimejo: " + zSuma + " ir lygmuo:" + lygmuo + ". Is viso: " + isVisoZ);
//                System.out.println("Panaudojo Akmuo: " + isVisoZAkm + "%");
//                System.out.println("Panaudojo Zirkles: " + isVisoZZir + "%");
//                System.out.println("Panaudojo Poperi: " + isVisoZPop + "%");
//                System.out.println("Komjuteris laimejo: " + kSuma + " ir lygmuo:" + lygmuo + ". Is viso: " + isVisoK);
//                System.out.println("Panaudojo Akmuo: " + isVisoKAkm + "%");
//                System.out.println("Panaudojo Zirkles: " + isVisoKZir + "%");
//                System.out.println("Panaudojo Poperi: " + isVisoKPop + "%");
//            }
//
//        } while (zp != 0);
//        
//    }
//
//}
