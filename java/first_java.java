import java.util.Date;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;




public class first_java {
    public static void main(String[] args) {

        // veriables in java,which is used to store info in computer's memory
        byte age = 30;

        // you can change the value of the veriable after its creation
        age = 35;

        // setting the value of one veriable to a another veriable
        byte herAge = age;

        // System.out.println(herAge);



        ///////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////  primitive types       ////////////////////////////////////

                      /* there is 8 primitive type is jave:
                      byte, short, int, long, float, double, char. boolean */

        // for small integer values use byte
        byte myAge = 28;

        // for large integer values use int type
        int viewsCount = 123_445_678;

        // for large number you hae to use long number type
        // the l at the end is there to signify that the number is long and not int
        long videoLike = 3_123_445_678_321L;

        // for small decimal numbers you can use the float type
        // the F at the end is there to tell java it float and not double
        float steakBake = 1.55F;

        // for long/large decimal numbers you use double
        double largeNum = 12.213435565432;

        // you can use char to store just one letter
        char letter = 'A';

        // there is also boolean
        boolean  isEligible = false;

        // System.out.println("this is my age and becuase is small number so the best type is byte to be used to store it:" + myAge);
        // System.out.println("this is the views on youtube videos: " + viewsCount);
        // System.out.println("this is the like that i got in me videos, not really: " + videoLike);
        // System.out.println("this is the price of steak bake in Greggs: £" + steakBake);
        // System.out.println("this is double to store large decimal numbers like: " + largeNum);
        // System.out.println("you use single for char: " + letter);
        // System.out.println("this will always show true or false: " + isEligible);



        //////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////// reference type ///////////////////////////////////////////////

        /* refrence type is used to stored complex objects;
            when using reference type you have elucate memory;
            you have to creat a new instance of the reference type
         */

        Date now = new Date();
        // System.out.println("this would show date and time: " + now);



        //////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////  string in java ////////////////////////////////////////

        String  message = "Hello there to other words";
        String from = "from earth!";


        // System.out.println(message + ": " + from);

        // // some of the string biuld in methods
        // System.out.println(message.startsWith("me"));
        // System.out.println(message.endsWith("words"));
        // System.out.println(message.length());
        // System.out.println(message.indexOf("e"));
        // System.out.println(message.toUpperCase());
        // System.out.println(message.toLowerCase());



        ///////////////////////////////////////////////////////////////////
        ///////////////////////////// Escape charectors ////////////////////

        // System.out.println("hello there from \"Sucik\"");
        // System.out.println("C:\\Downloads\\me.com");
        // System.out.println("this one \n line two\n line three\n and so onn \n");
        // System.out.println("Me\tyou\tand\ther");



        /////////////////////////////// /////////////////////////////////////////////////
        ////////////////////////////// Arrays ///////////////////////////////////////////

        // list in python but with  a bit of difference

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 4;

        // System.out.println(Arrays.toString(numbers));


        // doing the same thing as above in new syntax

        int[] numbs = {2, 1, 4, 5, 3};
        // System.out.println(Arrays.toString(numbs));
        // System.out.println("this is: " + numbs.length + " numbers in the numbs list/arrays");
        // Arrays.sort(numbs);
        // System.out.println("This is the sorted version of the numbs list: " + Arrays.toString(numbs));


        /// multy-dimentional arrays in java

        int[][] multyDimen = { {1, 2, 3}, {4, 5, 6} };
        // System.out.println(Arrays.deepToString(multyDimen));



        // creating constant, a veriable that can not be changed
         final String nameMe = "Manny Sucik";
         final float pi = 3.1415926535F;

         // System.out.println(nameMe);
         // System.out.println("you most use the final keyword to declaire unchangeable veriable: " + pi);



         //////////////////////////////////////////////////////////////////////////////
         ///////////////////////   arithmetic expressions /////////////////////////////

         int resultOne = 8 + 7;
         int resultTwo = 8 - 7;
         int resultThree = 8 / 7;
         int resultFour = 8 % 7;
         int resultFive = 8 * 7;
         double resultSeven = (double)8 / (double)7;

         // System.out.println(" 8 + 7 equals: " + resultOne);
         // System.out.println("8 - 7 equals: " + resultTwo);
         // System.out.println("8 / 7 equals: " + resultThree);
         // System.out.println("8 % 7 equals: " + resultFour);
         // System.out.println("8 * 7 equals: " + resultFive);
         // System.out.println("8 // 7 equals: " + resultSeven);


         ///////////////////////////////////////////////////////////////////
         /////////////////////// order of operation ////////////////////////

         int x = 10 + 3 * 2;
         // System.out.println("this might be 16 or 26: " + x);
         // System.out.println("the order of the operation is as it goes: (), */, +-");


         //////////////////////////////////////////////////////////////////////////////////////////
         /////////////////////////////////////   implicit casting  /////////////////////////////////

        // this can happen automaticly
         // byte > short > int > long > float > double

         short xX = 1;
         int y = xX + 2;

         double one = 1.1;
         double two = one + 2; // 2 will be convered to 2.0 or (float then addition will happen)

         // System.out.println(y);
         // System.out.println(two);


         ///////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////////// explisidly casting  /////////////////////////////////////////////

         // the explicit casting can only happen between the compatible types
         double three = 1.1;
         int four = (int)three + 2;

         // System.out.println(four);


         /////////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////// converting string into number ////////////////////////////////////////

         String one1 = "1";
         int oneString = Integer.parseInt(one1) + 2;

         String two2 = "3.3";
         double oneFloat = Double.parseDouble(two2) + 3.3;


         // System.out.println(oneString);
         // System.out.println(oneFloat);




         /////////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////// java maths class  /////////////////////////////////////////////////////////

         int result = Math.round(1.3F);
         int resultCeil = (int)Math.ceil(1.4F);
         int resultfloor = (int)Math.floor(1.4F);
         int resultGreatest = Math.max(12, 54);
         int resultMin = Math.min(12, 54);

         double resultrandom = Math.random();

         // getting random number between 1 - 100
         double resultran = Math.round(Math.random() * 100);

         int resultranInt = (int)Math.round(Math.random() * 100);


         // System.out.println(" math.round() to round 1.3: " + result);
         // System.out.println("math.ceil() will round the numbers up, 1.4 will be: " + resultCeil);
         // System.out.println("math.floor() will round donw, 1.4 will become: " + resultfloor);
         // System.out.println("Math.max() will find the biggest of the two integers, 12 or 54: " + resultGreatest);
         // System.out.println("Math.min() will get you the min number, 12 or 54: " + resultMin);
         // System.out.println("Math.random() will get you random numbs between 0 and 1: " + resultrandom);
         // System.out.println("this " + resultran + " is between one and one hundred!");
         // System.out.println("this will be a random whole number between one and one hundred: " + resultranInt);



    /////////////////////////////////////////////////////////////////////////////////////////////
         /////////////////////////    formatting numbers    //////////////////////////////////////
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         String resultCurrency =  currency.format(1234567.891);


         String resultPercent = NumberFormat.getPercentInstance().format(0.1);


         // System.out.println(resultCurrency);
         // System.out.println(resultPercent);


         ///////////////////////////////////////////////////////////////////////////////////////////////////////////
         /////////////////////// getting inputs /////////////////////////////////////////////////////////////////

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your age here: ");
         byte age2 = scanner.nextByte();


         // getting string as input

         Scanner nameInput = new Scanner(System.in);
         System.out.print("Enter your name here: ");
         String nam = nameInput.nextLine().trim();


         System.out.println("You are " + age2 + " years old!");
         System.out.println("your name is: " + nam);

    }
}
