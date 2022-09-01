import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task2_1();
//        task2_2();
//        task2_3();
//
//        task3_1();
//        task3_2();
//        task3_3();
//
//
//        my1();                    // Это мой вариант решения
//        my2();                    // Это мой вариант решения
//        my3();                    // Это мой вариант решения
//        my4();                    // Это мой вариант решения
    }


    //Задание 2.1

    private static void task2_1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        } else System.out.println("Возраст совршеннолетия еще не наступил!");
    }
    //Задание 2.2

    private static void task2_2() {
        int age = 6;

        if (age >= 7 & age < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (age >= 18 & age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else System.out.println("ERROR");
    }

    //Задание 2.3
    private static void task2_3() {
        int passengers = 77;
        int capacityVan = 102;
        int seats = 60;
        int remainder = capacityVan - passengers;
        int remainingSeats = seats - passengers;

        if (passengers <= capacityVan && passengers <= seats) {
            System.out.printf("Всего мест в вагоне осталось: %d\nСтоячих: %d\nСидячих: %d", remainder, remainder - remainingSeats, remainingSeats);
        } else if (passengers <= capacityVan && passengers >= seats) {
            System.out.printf("Всего мест в вагоне осталось: %d\nСтоячих: %d\nСидячих: 0", remainder, remainder);
        } else System.out.println("Мест в вагоне нет!");


    }

    //Задание 3.1
    private static void task3_1() {
        int age = 34;
        if (age >= 2 & age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 & age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age > 18 & age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

    }

    //Задание 3.2
    private static void task3_2() {
        int age = 66;
        if (age >= 0 && age <= 5) {
            System.out.println("Полных лет ребенку - " + age + ". Он не может кататься на аттракционе.");
        }
        if (age > 5 && age < 14) {
            System.out.println("Полных лет ребенку - " + age + ". Он может кататься на аттракционе в сопровождении взрослого.");
        } else
            System.out.println("Полных лет человеку - " + age + ". Он может кататься на аттракционе без сопровождения взрослого.");
    }

    //Задание 3.3
    private static void task3_3() {
        int one = 999;
        int two = 888;
        int free = 786;
        if (one <= two & two < free) {
            System.out.println("переменная free(" + free + ") больше, чем переменные two(" + two + ") и one(" + one + ").");
        } else if (one <= free & free < two) {
            System.out.println("переменная two(" + two + ") больше, чем переменные free(" + free + ") и one(" + one + ").");
        } else
            System.out.println("переменная one(" + one + ") больше, чем переменные free(" + free + ") и two(" + two + ").");

    }
    //Задание my1

    private static void my1() {
        System.out.print("Укажите свой возраст:");
        Scanner in = new Scanner(System.in);
        if (in.nextInt() >= 18) {
            System.out.println("Поздравляем, вы совершеннолетный!");
        } else System.out.println("Возраст совршеннолетиия еще не наступил, нужно немного подождать.");

    }
    //Задание my2

    private static void my2() {
        System.out.print("Укажите возраст человека:");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age >= 24) {
            System.out.println("Кожаному мешку пора искать работу");
        } else if (age >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (age >= 7) {
            System.out.println("Человек ходит в школу.");
        } else System.out.println("Вероятно его водят в садик");


    }

    //Задание my3

    private static void my3() {
        int capacityVan = 102;
        int seats = 60;
        Scanner in = new Scanner(System.in);
        int totalPassengers = in.nextInt();
        int remainingSeats = seats - totalPassengers;


        if (totalPassengers <= capacityVan) {
            System.out.printf("Всего мест в вагоне осталось %d из них сидячих %d \n", capacityVan - totalPassengers, Math.max(0, remainingSeats));
            if (totalPassengers == capacityVan) {
                System.out.println("Вагон полностью заполнен.");
            }
        } else {
            System.out.printf("Вагон не резиновый, необходимо высадить - %d чел.!", totalPassengers - capacityVan);
        }
    }

    //Задание my4
    private static void my4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число для сравнения: ");
        int one = in.nextInt();
        System.out.println("Ведите второе число для сравнения: ");
        int two = in.nextInt();
        System.out.println("Ведите третье число для сравнения: ");
        int three = in.nextInt();
        System.out.printf("Среди чисел %d, %d, и %d, наибольшим является число - %d", one, two, three, Math.max(Math.max(one, two), three));
    }
}