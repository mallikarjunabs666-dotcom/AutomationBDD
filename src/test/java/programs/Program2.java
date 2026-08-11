package programs;

import io.cucumber.java.it.Ma;
import org.testng.annotations.Test;

public class Program2 {

    @Test
    void sumofdigits() {
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
    void productOfDigits() {
        int num = 2234;
        int prodofdigits = 1;

        while (num != 0) {
            int rem = num % 10;
            prodofdigits = (prodofdigits * rem);
            num = num / 10;
        }
        System.out.println(prodofdigits);


    }

//    Find Largest Digit

    @Test
    void largestNumber() {
        int num = 23985;
        int largest = 0;

        while (num != 0) {
            int rem = num % 10;
            if (rem > largest) {
                largest = rem;
            }
            num = num / 10;


        }
        System.out.println(largest + " is the largest number");

    }

    @Test
    void smallestDigit() {
        int num = 234634;
        int smallest = 9;

        while (num != 0) {
            int rem = num % 10;

            if (rem < smallest) {
                smallest = rem;
            }
            num = num / 10;

        }
        System.out.println(smallest + " is the smallest number");
    }

    @Test
    void evenAndodd() {
        int num = 12304567;
        int evenCount = 0;
        int oddCOunt = 0;

        num = Math.abs(num);

        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCOunt++;
            }
            num = num / 10;
        }

        System.out.println("even count is " + evenCount);
        System.out.println("odd count is " + oddCOunt);
    }
//    12. Sum of Even Digits & Odd Digits Separately

    @Test
    void SumofEvenDigits() {
        int num = 123456789;
        int evensum = 0;
        int oddsum = 0;

        num = Math.abs(num);

        while (num != 0) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                evensum = evensum + rem;
            } else {
                oddsum = oddsum + rem;
            }
            num = num / 10;
        }
        System.out.println(evensum);
        System.out.println(oddsum);

    }

//    Swap First and Last Digit

    @Test
    void armstrong() {
        int num = 153;
        int original = num;
        int sum = 0;
        int count = 0;

//        1st count the number of digits

        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        while (original != 0) {
            int rem = original % 10;
            sum = sum + (int) Math.pow(rem, count);
            original = original / 10;
        }

        if (num == sum) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }


    }

    @Test
    void productofdigits() {
        int num = 1234;
        int prd = 1;

        while (num != 0) {
            int rem = num % 10;
            prd = prd * rem;
            num = num / 10;
        }
        System.out.println(prd);
    }

    @Test
    void largestNumber1() {
        int num = 263964;
        int largest = 0;

        while (num != 0) {
            int rem = num % 10;
            if (rem > largest) {
                largest = rem;
            }
            num = num / 10;
        }
        System.out.println("laregst number is " + largest);
    }

    @Test
    void smallest1() {
        int num = 26516349;
        int smallest = 9;

        num = Math.abs(num);

        if (num > 0) {
            while (num != 0) {
                int rem = num % 10;
                if (rem < smallest) {
                    smallest = rem;
                }
                num = num / 10;
            }
            System.out.println("smallest number is " + smallest);

        }

    }

    @Test
    void evenodd() {
        int num = 1234567890;
        int evencount = 0;
        int oddcount = 0;

        num = Math.abs(num);

        if (num == 0) {
            System.out.println("even digit count is 0");
        }

        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
            num = num / 10;
        }

        System.out.println("even number count is " + evencount);
        System.out.println("odd number count is " + oddcount);


    }

    @Test
    void sumofEVenAndOdddigits() {
        int num = 123456789;
        int evencount = 0;
        int oddcount = 0;

        num = Math.abs(num);

        if (num == 0) {
            System.out.println("even digit count is 0");
        }

        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evencount = evencount + rem;
            } else {
                oddcount = oddcount + rem;
            }
            num = num / 10;
        }
        System.out.println("sum of even digit counts " + evencount);
        System.out.println("sum if odd digits coutn " + oddcount);

    }

    @Test
    void swalpfirstandlastdigit() {
        int num = 325679;
        int origanl = num;
        int temp = num;
        int count = 0;

        int lastdigit = num % 10;

//        count the number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int divisor = (int) Math.pow(10, count - 1);
        System.out.println(divisor);

        int firstdigit = num / divisor;

        int middlenumber = (num % divisor) / 10;

        int swap = (lastdigit * divisor) + (middlenumber * 10) + firstdigit;

        System.out.println(swap);


    }

    @Test
    void sumOfFirstAndLastDigit() {
        int num = 238569;
        int temp = num;

        int lastdigit = num % 10;

        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int divsor = (int) Math.pow(10, count - 1);
        System.out.println(divsor);

        int firstdigit = num / divsor;

        System.out.println("total count of first and last digit " + (lastdigit + firstdigit));
    }

    @Test
    void checkPrieNumber() {
        int num = 18;
        boolean isprime = true;

        if (num <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }


        if (isprime) {
            System.out.println("number is prime number");
        } else {
            System.out.println("number is not a prime number");
        }

    }

    @Test
    void printAllPrimeNumbers()
    {
        int n =21;
        boolean isprime=true;

        for (int i= 2; i<n; i++)
        {
            if (n%i!=0)
            {
                System.out.println(i);
            }
        }
    }


}
