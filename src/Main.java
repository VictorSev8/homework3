public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        int age = 9;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        System.out.println("Задача 2");
        int temp = 5;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов. Нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов. Можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        // task 4
        System.out.println("Задача 4");
        int ageOfHuman = 25;
        boolean sad = ageOfHuman >= 2 && ageOfHuman <= 6;
        boolean school = ageOfHuman >= 7 && ageOfHuman <= 18;
        boolean univer = ageOfHuman > 18 && ageOfHuman < 24;
        boolean work = ageOfHuman >= 24;
        if (sad) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в детский сад");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в школу");
        }
        if (univer) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то его место в университете");
        }
        if (work) {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему пора ходить на работу");
        }

        // task 5
        System.out.println("Задача 5");
        int childAge = 16;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6
        System.out.println("Задача 6");
        int totalPlaceCapacity = 102;
        int sittingPlace = 60;
        int standingPlace = totalPlaceCapacity - sittingPlace;
        int usedSitting = 60;
        int usedStanding = 39;
        int freeSittingPlace = sittingPlace - usedSitting;
        int freeStandingPlace = standingPlace - usedStanding;
        if (freeSittingPlace > 0) {
            System.out.println("Есть сидячие места в вагоне, количество свободных сидячих мест: " + freeSittingPlace);
        } else if (freeStandingPlace > 0) {
            System.out.println("Есть стоячие места в вагоне, количество свободных стоячих мест: " + freeStandingPlace);
        } else {
            System.out.println("В вагоне нет свободных стоячих и сидячих мест");
        }

        // task 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Большее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Большее число: " + two);
        } else {
            System.out.println("Большее число: " + three);
        }
    }
}