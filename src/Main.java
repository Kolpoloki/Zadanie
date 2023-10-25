public class Main {
//        static void sekwencja(int[] args) {
//        for (int i = 0; i < args.length - 2; i++) {
//            if (args[i] == 1 && args[i + 1] == 2 && args[i + 2] == 3) {
//                System.out.println(true);
//            }
//        }
//    }
//    static void sekwencja1(int[] args) {
//        for (int i = 0; i < args.length - 2; i++) {
//            if (args[i] != args[i + 1] || args[i]  != args[i + 2]) {
//                if (i == args.length - 3) {
//                    System.out.println(true);
//                }
//            } else {
//                break;
//            }
//        }
//    }
//    static void sekwencja2(int[] args) {
//        if (args.length < 4) {
//        for (int i = 0; i < args.length; i++) {
//            if (args[i] == 5) {System.out.println(true);}
//        }
//    } else {
//        for (int i = 0; i < 3; i++) {
//            if (args[i] == 5) {System.out.println(true);}
//        }
//    }
//    }
//    static void sekwencja3(int[] args) {
//        int count1 = 0;
//        for (int i = 0; i < args.length - 1; i++) {
//            if (args[i] == 6 && args[i + 1] == 6 || args[i] == 6 && args[i + 1] == 7) {
//                count1++;
//            }
//        }
//        System.out.printf("Sekwencja liczb 6-6 lub 6-7 wystepuje w tabeli %d razy\n", count1);
//    }
    public static void main(String[] args) {

//        TODO 3) Utwórz tablicę przynajmniej 6 nazwisk i miejscowości kolegów z twojej grupy i
//                wydrukuj informację - "Uczeń ... pochodzi z ..." sposród wszystkich elementów wydrukuj
//                tylko te, które pochodzą z Tarnobrzega
        System.out.println("Zadanie 3");

        String[][] ludzie = {{"Jan Kowalski","Karol Wójcik","Adam Nowak","Henryk Czech","Krystian Wiśniewski","Bartosz Dąbrowski"},{"Tarnobrzeg","Tarnobrzeg","Warszawa","Gdańsk","Tarnobrzeg","Kraków"}};
        int ludzie1 = 0;
        for (int i = 0; i < ludzie[1].length; i++ ) {
            if (ludzie[1][i].equals("Tarnobrzeg")) {
                System.out.printf("Uczeń %s pochodzi z %s\n",ludzie[0][ludzie1], ludzie[1][i]);
                ludzie1++;
            } else {
                ludzie1++;
            }
        }

//        TODO 4) Biorąc pod uwagę dowolną tablicę int, ile razy występuje w niej liczba 7
        System.out.println("Zadanie 4");
        int[] liczby = {2,7,3,7,1,8,9,7,0,2};
        int count = 0;
//        for (int i = 0; i < liczby.length; i++) {
//            if (liczby[i] == 7) {
//                count += 1;
//            }
//        }
        for (int i : liczby) {
            if (i == 7) {
                count += 1;
            }
        }
        System.out.printf("Liczba 7 występuje w tabeli %d razy.\n", count);

//        TODO 5) Wypisz true, gdy w tablicy pojawi się sekwencja kolejnych liczb 1,2,3
        System.out.println("Zadanie 5");
        int[] liczby4 = {0,0,0,0,0,0,0,1,2,3};
        for (int i = 0; i < liczby4.length - 2; i++) {
            if (liczby4[i] == 1 && liczby4[i + 1] == 2 && liczby4[i + 2] == 3) {
                System.out.println(true);
                break;
            }
        }
//        int[] liczby1 = {8,0,3,9,2,1,2,3,5,3};
//        int[] liczby2 = {1,3,3,4,8,0,9,5,2,6};
//        int[] liczby3 = {0,0,0,0,0,0,0,1,2,3};
//        sekwencja(liczby1);
//        sekwencja(liczby2);
//        sekwencja(liczby3);

//        TODO 6) wypisz true gdy tablica nie zawiera żadnych trójek identycznych liczb po kolei
        System.out.println("Zadanie 6");
        int[] numberArray = {0,2,0,0,8,0,0,1,2,3};
        for (int i = 0; i < numberArray.length - 2; i++) {
            if (numberArray[i] != numberArray[i + 1] || numberArray[i]  != numberArray[i + 2]) {
                if (i == numberArray.length - 3) {
                    System.out.println(true);
                }
            } else {
                break;
            }
        }
//        int[] numberArray1 = {0,0,0,0,8,0,0,1,2,3};
//        int[] numberArray2 = {0,2,2,0,8,9,0,7,2,3};
//        sekwencja1(numberArray1);
//        sekwencja1(numberArray2);

//        TODO 7) wypisz true, gdy jeden z pierwszych 4 elementów tablicy wynosi 5 (tablica może mieć mniejszy rozmiar)
        System.out.println("Zadanie 7");
        int[] intArray = {1,5};
        if (intArray.length < 4) {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == 5) {System.out.println(true);}
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (intArray[i] == 5) {System.out.println(true);}
            }
        }
//        int[] intArray1 = {0,8,0,1,2,7};
//        int[] intArray2 = {0,2,5,0,8,9,0,7,2,3};
//        int[] intArray3 = {0,2,5};
//        sekwencja2(intArray1);
//        sekwencja2(intArray2);
//        sekwencja2(intArray3);

//        TODO 8) biorąc pod uwagę tablicę policz ile razy wystapi w niej sekwencja cyfry 6 i kolejnej 6 bądź 7
        System.out.println("Zadanie 8");
        int[] Array = {6,6,3,4,6,7,6,5,5,7};
        int count1 = 0;
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] == 6 && Array[i + 1] == 6 || Array[i] == 6 && Array[i + 1] == 7) {
                count1++;
            }
        }
        System.out.printf("Sekwencja liczb 6-6 lub 6-7 wystepuje w tabeli %d razy\n", count1);

//        int[] Array1 = {6,6,3,4,6,7,6,5,5,7};
//        int[] Array2 = {6,6,6,6,3,6,7,7,6,5};
//        int[] Array3 = {6,6,8};
//        sekwencja3(Array1);
//        sekwencja3(Array2);
//        sekwencja3(Array3);


    }
}