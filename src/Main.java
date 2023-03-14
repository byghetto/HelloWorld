public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.6;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
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

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var productsWeight = 2;
        productsWeight = productsWeight - 8;
        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var Weightofoneboxer = 78.2;
        var Weightofthesecondboxer = 82.7;
        var PIVO = Weightofoneboxer + Weightofthesecondboxer;
        System.out.println("Вес " + PIVO + " двух боксеров! " );
        var VSE = (Weightofthesecondboxer - Weightofoneboxer);
        System.out.println("Разница " + VSE + " кг в весе! " );
        var NIF = (Weightofoneboxer + Weightofthesecondboxer) % PIVO;
        System.out.println("Разница " + NIF + " делением! " );

        var WorkPerson = 640;
        var WorkonePerson = 8;
        var person = WorkPerson / WorkonePerson;
        System.out.println("Всего работников в компании " + person + " человек! ");
        var newPerson = 94 ;
        var total = (person + newPerson);
        var hour = (WorkPerson / total);
        System.out.println("Если в компании работает " + total + " человек,то всего " + hour +
                 " часов работы может быть поделено между сотрудиками " );

    }}