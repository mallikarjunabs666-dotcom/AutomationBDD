package programs;

import org.testng.annotations.Test;

public class Program1 {

    public static void main(String[] args) {

//            int num = 12340;
//            int rev=0;
//
//            while (num!=0)
//            {
//                int rem = num%10;
//                rev=(rev*10)+rem;
//                num=num/10;
//            }
//        System.out.println(rev);

        int num = 12300;
        int temp = num;
        int rev = 0;
        int count = 0;

        while (temp % 10 == 0) {
            count++;
            temp = temp / 10;
        }

        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(0);
        }
        System.out.println(rev);


    }

    @Test
    void Second() {
        int num = -1234;
        int rev = 0;
        boolean isnegative = false;

        if (num < 0) {
            isnegative = true;
            num = -(num);
        }

        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        if (isnegative) {
            rev = -(rev);
        }
        System.out.println(rev);


    }

    @Test
    void palindrome() {
        int num = 1221;
        int temp = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Number is plaindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

    @Test
    void countDigits() {
        int num = 1234;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    @Test
    void sumofDigits() {
        int num = 1234;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);

    }

    @Test
    void armsstrong() {
        int num = 153;
        int orginal = num;
        int count = 0;
        int sum = 0;
        int orginalNumber = num;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        while (orginal != 0) {
            int rem = orginal % 10;

            sum = sum + (int) Math.pow(rem, count);
            orginal = orginal / 10;
        }

        if (orginalNumber == sum) {
            System.out.println("Number is armstarong");
        } else {
            System.out.println("Number is not armstrong");
        }

    }

}


interface Demo2 {

}

interface Demo1 {
    int a = 12;
    final static int b = 14;

    void test();

    public abstract void start(int a);
}

class Mailclass {
    public static void main(String[] args) {
        System.out.println(Demo1.a);
        System.out.println(Demo1.b);
    }
}


interface Sample1 {
    int a = 12;

    void test();
}

class Sample2 implements Sample1 {
    public void test() {
        System.out.println("Test method");
    }

}

class Mainclass2 {
    public static void main(String[] args) {
        Sample2 s2 = new Sample2();
        s2.test();
        System.out.println(Sample1.a);
    }
}

interface Version1 {
    void start();

    void test();
}

abstract class Version2 implements Version1 {
    public void test() {
        System.out.println("test method");
    }
}

class Version3 extends Version2 {
    public void start() {
        System.out.println("STart method");
    }
}

class Mailclass3 {
    public static void main(String[] args) {
        Version3 v3 = new Version3();
        v3.start();
        v3.test();
    }
}

interface Program4 {
    void start();
}

interface Program5 extends Program4 {
    void end();
}

abstract class Program6 implements Program5 {
    public void start() {
        System.out.println("Start method");
    }
}

class Program7 extends Program6 {
    public void end() {
        System.out.println("End method");
    }

    public static void main(String[] args) {
        Program7 p7 = new Program7();
        p7.start();
        p7.end();
    }
}

interface Rocket {
    void fly();
}

interface Threewheeler {
    void movonRoad();
}

class flight implements Rocket, Threewheeler {
    public void fly() {
        System.out.println("Flight is flying");
    }

    public void movonRoad() {
        System.out.println("Flight is landing");
    }
}

class Mailclass8 {
    public static void main(String[] args) {
        flight f = new flight();
        f.fly();
        f.movonRoad();
    }
}

//interface Example1 {
//    void run();
//}
//
//interface Exampl2 {
//    void start();
//}
//
//class Example3 {
//    void test() {
//        System.out.println("Test method");
//    }
//}
//
//class Example4 extends Example3 implements Example1, Exampl2 {
//    public void run() {
//        System.out.println("run method");
//    }
//
//    public void start() {
//        System.out.println("Start method");
//    }
//}

class aug6 {
    public static void main(String[] args) {

        int num = 153;
        int original = num;
        int count = 0;
        int sum = 0;

        while (original != 0) {
            original = original / 10;
            count++;
        }

        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, count);
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }


    }
}

class aug7 {
    public static void main(String[] args) {

        int num = -1234;
        int original = num;
        int rev = 0;
        boolean isngative = false;

        if (num < 0) {
            num = -(num);
            isngative = true;
        }

        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (isngative) {
            rev = -(rev);
        }
        System.out.println(rev);

    }
}








