package com.chap2;

public class IntDataType {
    public static void main(String[] args) {
        // int
        int i1 = 10; // i1 is the variable and 10 is its value
        int i2 = 20; // i2 is the variable and 20 is its value
        int i3 = i1 + i2; // Answer should be 30
        System.out.println(i3);

        // You can also write as
        System.out.println(i1 + i2);
        // You can also write as
        System.out.println(i1 + 20);
        // You can also write as
        System.out.println(10 + 20);
        // You can change the value of a variable
        i1 = 40; // i1 is already declared hence no need for datatype again. whenever a variable is declared for
                    // the first time we need to specify the datatype and declare.

        System.out.println(i1); // this should give 40 (NOT 10). Henceforth the value of i1 is 40 until changed again.

        int i4, i5;
        int i6; // you can declare the variables first and initialize with a value later

        i4 = 90;
        i6 = 2000;

        i5 = i1;
        i1 = 25;
        System.out.println(i5); // this should give the earlier value of i1 i.e. 40

        int i7 = i1 + i2;
        int i8 = i1 * 2;
        int i9 = i1 - 5;
        int i10 = i4 / 10;

        System.out.println(i7); // Gives 25
        System.out.println(i8); // Gives 50
        System.out.println(i9); // Gives 20
        System.out.println(i10); // Gives 9

        // anamoly in division of integer and assigning to integer

        int i11 = i1/10;
        System.out.println(i11); // Gives value 2 instead of 2.5. This is because "int" datatype cannot hold decimal data.
                                 // So it always takes the floor value or the whole number lesser than than decimal data.

    }
}
