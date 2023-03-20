public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 35000;
        byte b = 100;
        short c = 1000;
        long d = 3000000000L;
        float e = 2.42342f;
        double f = 4.43294234895;
        System.out.println("Значение переменной a с типом int равно: " + a);
        System.out.println("Значение переменной b с типом byte равно: " + b);
        System.out.println("Значение переменной c с типом short равно: " + c);
        System.out.println("Значение переменной d с типом long равно: " + d);
        System.out.println("Значение переменной e с типом float равно: " + e);
        System.out.println("Значение переменной f с типом double равно: " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte h = 67;
        System.out.println("Переменные проинициализированны");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + totalSheets/(firstClass+secondClass+thirdClass) + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte totalWork = 16;
        byte totalTime = 2;
        int bottlesPerMinute = totalWork/totalTime;
        byte firstPeriod = 20;
        short secondPeriod = 24*60;
        short thirdPeriod = 24*60*3;
        int fourthPeriod = 24*60*30;
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute*firstPeriod + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerMinute*secondPeriod + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute*thirdPeriod + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMinute*fourthPeriod + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalDye = 120;
        byte whiteDye = 2;
        byte brownDye = 4;
        int totalClasses = totalDye/(whiteDye+brownDye);
        int totalWhiteDye = totalClasses*whiteDye;
        int totalBrownDye = totalClasses*brownDye;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteDye + " банок белой краски и " +totalBrownDye + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int banana = 80*5;
        int milk = 2*105;
        int iceCream = 2*100;
        int rawEggs = 4*70;
        int totalWeightInGrams = banana+milk+iceCream+rawEggs;
        float totalWeightInKilos = totalWeightInGrams/1000f;
        System.out.println("Вес завтрака в граммах: " + totalWeightInGrams);
        System.out.println("Вес завтрака в килограммах: " + totalWeightInKilos);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short weight = 7*1000;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int weightLossAvg = (250+500)/2;
        int maxDays = weight/weightLossMin;
        int minDays = weight/weightLossMax;
        int avgDays = weight/weightLossAvg;
        System.out.println("Если спортсмен будет худеть на " + weightLossMin + " граммов в день, то уйдет " + maxDays + " дней.");
        System.out.println("Если спортсмен будет худеть на " + weightLossMax + " граммов в день, то уйдет " + minDays + " дней.");
        System.out.println("Если спортсмен будет худеть на " + weightLossAvg + " граммов в день, то уйдет " + avgDays + " дней.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;
        int mashaAfter = mashaBefore/10+mashaBefore;
        int denisAfter = denisBefore/10+denisBefore;
        int kristinaAfter = kristinaBefore/10+kristinaBefore;
        int mashaDiff = mashaAfter-mashaBefore;
        int denisDiff = denisAfter-denisBefore;
        int kristinaDiff = kristinaAfter-kristinaBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");
    }
}