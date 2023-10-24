public class Main {
    //    static void sekwencja(int[] args) {
//        for (int i = 0; i < args.length - 2; i++) {
//            if (args[i] == 1 && args[i + 1] == 2 && args[i + 2] == 3) {
//                System.out.println(true);
//            }
//        }
//    }
    public static void main(String[] args) {
//        TODO 3) Utwórz tablicę przynajmniej 6 nazwisk i miejscowości kolegów z twojej grupy i
//                wydrukuj informację - "Uczeń ... pochodzi z ..." sposród wszystkich elementów wydrukuj
//                tylko te, które pochodzą z Tarnobrzega
        String[][] ludzie = {{"Jan Kowalski","Karol Wójcik","Adam Nowak","Henryk Czech","Krystian Wiśniewski","Bartosz Dąbrowski"},{"Tarnobrzeg","Tarnobrzeg","Warszawa","Gdańsk","Tarnobrzeg","Kraków"}};
        int ludzie1 = 0;
        for (int i = 0; i < ludzie[1].length; i++ ) {
            if (ludzie[1][i].equals("Tarnobrzeg")) {
                System.out.printf("Uczeń %s pochodzi z %s\n",ludzie[0][ludzie1], ludzie[1][i]);
                ludzie1++;
            }
        }
//        TODO 4) Biorąc pod uwagę dowolną tablicę int, ile razy występuje w niej liczba 7
        int[] liczby = {2,7,3,7,1,8,9,7,0,2};
        int count = 0;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] == 7) {
                count += 1;
            }
        }
//        count = 0;
//        for (int i : liczby) {
//            if (i == 7) {
//                count += 1;
//            }
//        }
        System.out.printf("Liczba 7 występuje w tabeli %d razy.\n", count);
//        TODO 5) Wypisz true, gdy w tablicy pojawi się sekwencja kolejnych liczb 1,2,3
        int[] liczby4 = {0,0,0,0,0,0,0,1,2,3};
        for (int i = 0; i < liczby4.length - 2; i++) {
            if (liczby4[i] == 1 && liczby4[i + 1] == 2 && liczby4[i + 2] == 3) {
                System.out.println(true);
            }
        }
//        int[] liczby1 = {8,0,3,9,2,1,2,3,5,3};
//        int[] liczby2 = {1,3,3,4,8,0,9,5,2,6};
//        int[] liczby3 = {0,0,0,0,0,0,0,1,2,3};
//        sekwencja(liczby1);
//        sekwencja(liczby2);
//        sekwencja(liczby3);


    }
}