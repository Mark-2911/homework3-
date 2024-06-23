public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int i = 350000;
        System.out.println("Значение переменной i " + " c типом int " + " равно " + i);
        byte b = 120;
        System.out.println("Значение переменной b " + " c типом byte " + " равно " + b);
        short s = 32000;
        System.out.println("Значение переменной s " + " с типом short " + " равно " + s);
        long l = 987654321L;
        System.out.println("Значение переменной l " + " с типом long " + " равно " + l);
        float f = 35.17f;
        System.out.println("Значение переменной f " + " с типом float " + " равно " + f);
        double d = 3.76;
        System.out.println("Значение переменной d " + "  с типом double " + " равно " + d);

        System.out.println("Задача 2");
        double number = 27.12;
        System.out.println(number);
        long number2 = 987678965549L;
        System.out.println(number2);
        float number3 = 2.786f;
        System.out.println(number3);
        short number4 = 569;
        System.out.println(number4);
        short number5 = -159;
        System.out.println(number5);
        int number6 = 27897;
        System.out.println(number6);
        byte number7 = 67;
        System.out.println(number7);

        System.out.println("Задача 3");
        byte classOne = 23;
        System.out.println("У Людмилы Павловны " + classOne + " ученика.");
        byte classTwo = 27;
        System.out.println("У Анны Сергеевны " + classTwo + " учеников.");
        byte classThree = 30;
        System.out.println("У Екатерины Андреевны " + classThree + " учеников.");
        short commonPaper = 480;
        System.out.println(commonPaper + " листов бумаги на все три класса!");
        int aPieceOfPaper = commonPaper / (classOne + classTwo + classThree);
        System.out.println("На каждого ученика рассчитано по " + aPieceOfPaper + " листов бумаги!");

        System.out.println("Задача 4");
        byte numberOfBottles = 16;
        byte numberOfMinutes = 2;
        byte productivityInOneMinute = (byte) (numberOfBottles / numberOfMinutes);
        int bottles = productivityInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottles + " штук бутылок.");
        short minutesPerDay = 1440;
        int productivityPerDay = productivityInOneMinute * minutesPerDay;
        System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок.");
        int minutesInThreeDays = minutesPerDay * 3;
        int productivityInThreeDays = productivityInOneMinute * minutesInThreeDays;
        System.out.println("За 3 дня машина произвела " + productivityInThreeDays + " штук бутылок.");
        int minutesPerMonth = minutesPerDay * 31;
        int monthlyPerformance = productivityInOneMinute * minutesPerMonth;
        System.out.println("За 1 месяц машина произвела " + monthlyPerformance + " штук бутылок.");

        System.out.println("Задача 5");
        byte totalCansOfPaint = 120;
        System.out.println("Общее количество банок краски = " + totalCansOfPaint);
        byte theAmountOfWhitePaintPerClass = 2;
        System.out.println(theAmountOfWhitePaintPerClass + " банки белой краски нужно на один класс.");
        byte theAmountOfBrownPaintPerClass = 4;
        System.out.println(theAmountOfBrownPaintPerClass + " банки коричневой краски нужно на один класс.");
        byte totalAmountOfPaintPerClass = (byte) (theAmountOfWhitePaintPerClass + theAmountOfBrownPaintPerClass);
        short numberOfClasses = (short) (120 / totalAmountOfPaintPerClass);
        short whitePaint =  (short) (numberOfClasses * 2);
        short brownPaint = (short) (numberOfClasses * 4);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        System.out.println("Задача 6");

        int bananas = 5;
        int milk = 200;
        int iceCreamSundae = 2;
        int rawEggs = 4;

        int bananaWeight = 80;
        int milkWeight = 105;
        int massOfIceCream = 100;
        int eggWeight = 70;

        int aGramOfBananas = bananas * bananaWeight;
        int aGramOfMilk = (milk / 100)  * milkWeight;
        int aGramOfIceCream = iceCreamSundae * massOfIceCream;
        int gramOfEggs = rawEggs * eggWeight;
        int breakfast = aGramOfBananas + aGramOfMilk + aGramOfIceCream + gramOfEggs;
        float sportsBreakfast = (breakfast / 1000f);
        System.out.println("Такой спортзавтрак равен " + breakfast + " грамм который равен " + sportsBreakfast + " кг!");

        System.out.println("Задача 7");
        byte kilogram = 7;
        int from = 250;
        int before = 500;
        int weightInGrams = kilogram * 1000;
        int days = weightInGrams / from;
        int days2 = weightInGrams / before;
        int average = (days + days2) / 2;
        System.out.println("Если спортсмен будет терять в день 250 грамм , то ему понадобится " + days + " дней для нужного результата.");
        System.out.println("Если спортсмен будет терять в день 500 грамм , то ему понадобится " + days2 + " дней для нужного результата.");
        System.out.println("В срнеднем спортсмену понадобится " + average + " дней для нужного результата.");

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        System.out.println("Маша получает " + mashaSalary + " рублей в месяц.");
        int denisSalary = 83690;
        System.out.println("Денис получает " + denisSalary + " рублей в месяц.");
        int kristinaSalary = 76230;
        System.out.println("Кристина получает " + kristinaSalary + " рублей в месяц.");
        int mashaAnnualSalary = mashaSalary * 12;
        System.out.println("В год Маша получает " + mashaAnnualSalary + " рублей.");
        int denisAnnualSalary = denisSalary * 12;
        System.out.println("В год Денис получает " + denisAnnualSalary + " рублей.");
        int kristinaAnnualSalary = kristinaSalary * 12;
        System.out.println("В год Кристина получает " + kristinaAnnualSalary + " рублей.");
        int mashaIncreasedSalary = mashaSalary + (mashaSalary * 10) / 100;
        int denisIncreasedSalary = denisSalary + (denisSalary * 10) / 100;
        int kristinaIncreasedSalary = kristinaSalary + (kristinaSalary * 10) / 100;
        int mashaNewAnnualSalary = mashaIncreasedSalary * 12;
        int denisNewAnnualSalary = denisIncreasedSalary * 12;
        int kristinaNewAnnualSalary = kristinaIncreasedSalary * 12;
        int theAnnualDifferenceOfMasha = mashaNewAnnualSalary - mashaAnnualSalary;
        int denisAnnualDifference = denisNewAnnualSalary - denisAnnualSalary;
        int kristinaAnnualDifference = kristinaNewAnnualSalary - kristinaAnnualSalary;
        System.out.println("Маша теперь получает " + mashaIncreasedSalary + " рублей. Годовой доход вырос на " + theAnnualDifferenceOfMasha + " рублей.");
        System.out.println("Денис теперь получает " + denisIncreasedSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaIncreasedSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");



































































    }
}