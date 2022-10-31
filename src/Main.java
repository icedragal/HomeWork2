public class Main {
    public static void main(String[] args) {
        // Приступил к ДЗ
        //Task1
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Task 6
        System.out.println("Task 6");
        var firstBoxersWeight = 78.2;
        var secondBoxersWeight = 82.7;
        var generalWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println("Общий вес боксеров " + generalWeight + " кг.");
        var differenceWeight = firstBoxersWeight - secondBoxersWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");

        //Task 7
        System.out.println("Task 7");
        differenceWeight = secondBoxersWeight - firstBoxersWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");
        differenceWeight = secondBoxersWeight % firstBoxersWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");

        // Task 8
        System.out.println("Task 8");
        var generalHour = 640;
        var workHour = 8;
        var workers = generalHour / workHour;
        System.out.println("Всего работников в компании " + workers);
        workers = workers + 94;
        workHour = generalHour / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workHour + " часов работы может быть поделено между сотрудниками");
    }
}