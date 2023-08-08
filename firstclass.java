
import java.util.Scanner;
// import java.util.Scanner;

import javax.swing.plaf.ButtonUI;

class firstclass {
      public static void main(String[] args) {

              // =========subtrac sum====================

            Scanner jh = new Scanner(System.in);
            int k = jh.nextInt();
            int v = jh.nextInt();
            int sum1 = (v - k);
            System.out.println(sum1);


            // ============print taxt=================

            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println(name);

            // ==============if else=================



            Scanner as = new Scanner(System.in);
            int a = as.nextInt();
            int b = as.nextInt();
            String c = as.next();

            String result = "invalidNumber";
            // int d =Integer.parseInt(c);

            // int sum2 = a+b;
            // // System.out.println(sum2);

            if (c.equals("add")) {
            System.out.println(a + b);
            } else if (c.equals("sub"))
            System.out.println(a - b);
            else {
            System.out.println(result);
            }

            // =============switch====================




            Scanner rf = new Scanner(System.in);
            int r = rf.nextInt();
            int f = rf.nextInt();
            int button = rf.nextInt();

            switch (button) {
                  case 1:
                        System.out.println("addition="+(r + f));

                        break;
                  case 2:
                        System.out.println("subtrac="+(r - f));

                        break;
                  case 3:
                        System.out.printf("subdivision= %.2f", (float) r / f);

                        break;
                  case 4:
                        System.out.println("multiplication="+(r * f));

                        break;
                  case 5:
                        System.out.println("modulas="+r % f);

                        break;
                  case 6:

                        System.out.println("sum="+(float) (r * f) / (r + f) + (r - f));

                        // System.out.printf("%.6f", ((r * f) / (float) (r + f)) + (r - f));   printf use karne per java ko desimal ke bad kitne number chahiae vo batana padega us liye "%.6f" hai

                        

                        // System.out.println((float)((r*f)/(r+f)+(r-f))); 
                        // galat sintex likhi hai flotat ko 1 hi braket mai formula ke shath likhna hoga yaha ((float)   ((r*f)/(r+f)+(r-f))  ) likh kar vapas braket me formula likhi hai is trha braket mai 2 braket bane hai 1 float ka or 1 puri formula ka is liye java defult seting use karega float istemal nahi hota

                        break;

                  default:
                        System.out.println("Invalid Number");
                        break;
                       
            }
            //  rf.close(); 

             
      }
     
            
}

