public class Main {
    public static void main(String[] args) {
        byte a = 4;
        short b = 200;
        int c = 1000;
        long d = 3000L;
        float e = 0.5f;
        double f = 0.666_666;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float vari1 = 27.12f;
        long vari2 = 987_678_965_549L;
        double vari3 = 2.786;
        short vari4 = 569;
        short vari5 = -159;
        int vari6 = 27897;
        byte vari7 = 67;

        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalPaper = 480;
        int totalStud = lP + aS + eA;
        int paperForOne = totalPaper/totalStud;
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги");

        int foTwoMin = 16;
        int botOneMin = 16/2;

        int min1 = 20;
        int bot1 = botOneMin * min1;
        System.out.println("За " + min1 + " минут машина произвела " + bot1 + "штук бутылок");
        int min2 = 24*60;
        int bot2 = botOneMin * min2;
        System.out.println("За " + min2 + " минут машина произвела " + bot2 + "штук бутылок");
        int min3 = 3 * 24 * 60;
        int bot3 = botOneMin * min3;
        System.out.println("За " + min3 + " минут машина произвела " + bot3 + "штук бутылок");
        int min4 = 31 * min2;
        int bot4 = botOneMin * min4;
        System.out.println("За " + min4 + " минут машина произвела " + bot4 + "штук бутылок");

        int totalJar = 120;
        byte white1 = 2;
        byte brown1 = 4;
        int oneClass = white1 + brown1;
        int numbOfClasses = totalJar/oneClass;
        int numbOfClassesW = white1 * numbOfClasses;
        int numbOfClassesB = brown1 * numbOfClasses;
        System.out.println("В школе, где "+ numbOfClasses + " классов, нужно " + numbOfClassesW + " банок белой краски и " + numbOfClassesB + " банок коричневой краски");

        byte bannanWeight = 80;
        byte allBan = 5;
        int totalBanW = bannanWeight * allBan;
        byte milkWeight = 105;
        byte allMilk = 2;
        int totalMilkW = milkWeight * allMilk;
        byte iceCreamWeight = 100;
        byte allIceCream = 2;
        int totalIceCreamW = iceCreamWeight * allIceCream;
        byte eggWeght = 70;
        byte allEggs = 4;
        int tottalEeggW = eggWeght * allEggs;
        int mixture = totalBanW + totalMilkW + totalIceCreamW + tottalEeggW;
        float kgWeight = mixture/1000f;
        System.out.printf("Вес в граммах " + mixture + " и вес в килограммах " + kgWeight);



        System.out.println();
        int resetWeight = 7000;
        short oneDayMin = 250;
        short oneDayMax = 500;
        int daysMin = resetWeight/oneDayMin;
        int daysMax = resetWeight/oneDayMax;
        int daysOnAverage = (daysMax + daysMin)/2;

        System.out.println("Чтобы похудеть на 250гр потребуется " + daysMin + " дней, на" + " 500гр " + daysMax + " дней, в среднем " + daysOnAverage + " дней!");

        System.out.println();

        int mashaMonth = 67760;
        int denisMonth = 83690;
        int kristMonth = 76230;
        int mashaYear = mashaMonth * 12;
        int denisYear = denisMonth * 12;
        int kristYear = kristMonth * 12;

        float increase = 1.1f;

        float newSalMaMonth = mashaMonth * increase;
        float newSalDeMonth = denisMonth * increase;
        float newSalKriMonth = kristMonth * increase;
        float newSalMaYear = newSalMaMonth * 12;
        float newSalDeYear = newSalDeMonth * 12;
        float newSalKriYear = newSalKriMonth * 12;
        float difYearMa = newSalMaYear - mashaYear;
        float difYearDe = newSalDeYear - denisYear;
        float difYearKri = newSalKriYear - kristYear;
        System.out.println("Маша теперь получает " + newSalMaMonth + " рублей. Годовой доход вырос на " + difYearMa + " рублей");
        System.out.println("Денис теперь получает " + newSalDeMonth + " рублей. Годовой доход вырос на " + difYearDe + " рублей");
        System.out.println("Кристина теперь получает " + newSalKriMonth + " рублей. Годовой доход вырос на " + difYearKri + " рублей");



    }
}