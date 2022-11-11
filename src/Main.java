public class Main {
    public static void main(String[] args) {

        //task_1
        System.out.println("        Task 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //task_2
        System.out.println("        Task 2");

        dog+=4;
        cat+=4;
        paper+=4;

        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //task_3
        System.out.println("        Task 3");

        dog-=3.5;
        cat-=1.6;
        paper-=7639;

        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //task_4
        System.out.println("        Task 4");

        var friend = 19;
        System.out.println("friend = "+friend);
        friend+=2;
        System.out.println("friend = "+friend);
        friend/=7;
        System.out.println("friend = "+friend);

        //task_5
        System.out.println("        Task 5");

        var frog =3.5;
        System.out.println("frog = "+frog);
        frog*=10;
        System.out.println("frog = "+frog);
        frog/=3.5;
        System.out.println("frog = "+frog);
        frog+=4;
        System.out.println("frog = "+frog);

        //task_6
        System.out.println("        Task 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumWeight = firstBoxer+secondBoxer;
        System.out.println(sumWeight);
        var difWeight = secondBoxer%firstBoxer;
        System.out.println(difWeight);

        //task_7
        System.out.println("        Task 7");
        var difWithMin = secondBoxer-firstBoxer;
        System.out.println(difWithMin);
        var difPercent = secondBoxer%firstBoxer;
        System.out.println(difPercent);

        //task_8
        System.out.println("        Task 8");
        var workingHours = 640;
        var personHours = 8;
        var employers = workingHours/personHours;
        System.out.println("Всего работников в компании "+employers);

        var numberOfEmployers = employers+94;
        var newWorkingHours = numberOfEmployers*personHours;
        System.out.println("Если в компании работает " +numberOfEmployers+
                " человек, то всего " +newWorkingHours+
                " часов работы может быть поделено между сотрудниками");

    }
}