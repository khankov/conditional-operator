public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Поздравлем с совершеннолетием!");
        }
        if (age1 < 18)  {
            System.out.println("Информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int age2 = 10;
        if (age2 >= 7 && age2 < 18){
            System.out.println("Ребёнок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24){
            System.out.println("Человек ходит в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек ходит на работу");
        }

        // Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int capacity = 102;
        int seatPlace = 60;
        int standingRoom = capacity - seatPlace;
        int seatus = 50;
        int standus = 20;
        if(seatus < seatPlace){
            System.out.println("Свободных сидячих мест  " + (seatPlace - seatus) );
        }
        if (seatus >= seatPlace){
            System.out.println("Сидячих мест нет");
        }
        if (standus < standingRoom){
            System.out.println("Свободных стоячих мест " + (standingRoom - standus));
        }
        if(standus >= standingRoom){
            System.out.println("Стоячих мест нет");
        }

        // Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int age3 = 17;
        if (age3 >= 18) {
            System.out.println("Поздравлем с совершеннолетием!");
        }
        else   {
            System.out.println("Информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        // Задание 5
        System.out.println();
        System.out.println("Задание 5");
        int age4 = 20;
        if (age4 >= 7 && age4 < 18){
            System.out.println("Ребёнок ходит в школу");
        } else if (age4 >= 18 && age4 < 24){
            System.out.println("Человек ходит в университет");
        } else if (age4 >= 24) {
            System.out.println("Человек ходит на работу");
        }
        // Задание 6
        System.out.println();
        System.out.println("Задание 6");
        int capacity2 = 102;
        int seatPlace2 = 60;
        int standingRoom2 = capacity2 - seatPlace2;
        int seatus2 = 60;
        int standus2 = 42;
        if(seatus2 < seatPlace2){
            System.out.println("Свободных сидячих мест  " + (seatPlace2 - seatus2) );
        } else{
            System.out.println("Сидячих мест нет");
        }
        if (standus2 < standingRoom2){
            System.out.println("Свободных стоячих мест " + (standingRoom2 - standus2));
        }else{
            System.out.println("Стоячих мест нет");
        }

        // Задание 7
        System.out.println();
        System.out.println("Задание 7");
        int age5 = 15;
        if (age5 >= 2 && age5 <=6){
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
        }
        else if (age5 >= 7 && age5 <=18){
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        }
        else if (age5 >= 18 && age5 < 24){
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в университет");
        } else if (age5 > 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
        }

        // Задание 8
        System.out.println();
        System.out.println("Задание 8");
        int age6 = 16;
        if (age6 < 5){
            System.out.println("Ребёнок не может кататься на атракционе");
        }else if (age6 > 5 && age6 < 14){
            System.out.println("Ребёнок может кататься на атракционе только в сопровождении взрослого");
        }
        else {
            System.out.println("Ребенок может кататься на атракционе");
        }

        // Задание 9
        System.out.println();
        System.out.println("Задание 9");
        int one = 10;
        int two = 11;
        int three = 21;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число = " + one);
            } else {
                System.out.println("Максимальное число = " + three);
            }
        }else if (two > one){
           if (two >= three){
               System.out.println("Максимальное число = " + two);
           } else{
               System.out.println("Максимальное число = " + three);
           }
        }else {
            if (one > three){
                System.out.println("Максимальное число = " + one);
            }else if (three > one){
                System.out.println("Максимальное число = " + three);
            }else {
                System.out.println("Все 3 числа равны");
            }
        }

    }
}