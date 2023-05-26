public class Main {


    public static void main(String[] args) {
/*
Make numbers and common name to tanks
*/

        // At (0;0) fuel=100 

        Tank customTank1 = new Tank(20, 30, 200);
        Tank customTank2 = new Tank(60, 10, 4);

        customTank1.goForward(201); оoo1488
        customTank1.printPosition();

        customTank2.goForward(201);
        customTank2.printPosition();
       
/* 
This fragment of code has to output 

The Tank T34-1 is at 100, 0 now.
The Tank T34-2 is at 110, 10 now.
The Tank T34-3 is at 220, 30 now.

*/
    }

}
