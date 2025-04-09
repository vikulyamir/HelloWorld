public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задание №2");
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println("Задание №3");
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println("Задание №4");
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println((friend + 2) / 7);
        System.out.println("Задание №5");
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println((frog * 10) / 3.5);
        System.out.println((frog * 10) / 3.5 + 4);
        System.out.println("Задание №6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса " + totalWeight);
        var difference = boxer2 - boxer1;
        System.out.println("Разница в массе " + difference);
        System.out.println("Задание №7");
        var remainderOfDivision = (boxer2 % boxer1);
        System.out.println(remainderOfDivision);
        System.out.println("Задание №8");
        var totalHoursOfOperation = 640;
        var workingDay = 8;
        System.out.println("Всего работников в компании - " + totalHoursOfOperation / workingDay + " человек");
        var totalEmployees = totalHoursOfOperation / workingDay + 94;
        System.out.println("Если в компании работает  " + totalEmployees + " человек, то всего " + totalEmployees * workingDay + " часов работы может быть поделено между сотрудниками");
    }
}