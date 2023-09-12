public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");
        var weightDifference = (secondBoxerWeight - firstBoxerWeight) %differenceWeight ;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг!");
        var totalTime = 640;
        var workTime = 8;
        var employees = totalTime / workTime;
        System.out.println("Всего в компании работает " + employees + " человек");
        employees = employees + 94;
        var commonTime = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + commonTime + " часов работы может быть поделено между сотрудниками");

    }
}