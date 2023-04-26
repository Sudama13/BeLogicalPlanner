//public class Exception {
//    public static void main(String[] args) {
//        System.out.println("Let's Start");
//        try {
//            System.out.println("Let find");
//            System.out.println("Hi Whatsapp");
//            int a = 5/0;
////            try {
////                System.out.println("Helo guys ");
////                int a = 5 /0 ;
////            }
////            catch(Exception e) {
////                System.out.println("Hello guys");
////            }
//        } catch(ArithmeticException e) {
//            System.out.println("Something went wrong ?");
//            try {
//                System.out.println("Helo guys ");
//                int a = 5 /0 ;
//            }
//            catch(Exception ex) {
//                System.out.println("Hello guys");
//            }
//        }
//        finally {
//            System.out.println("Find it");
//        }
//        System.out.println("End it");
//    }
//}


//public class Exception {
//    public static void alpha() throws java.lang.Exception
//        {
//        System.out.println("any problem");
//        try {
//            System.out.println("Kya hua");
//            alpha();
//        }
//        catch(StackOverflowError e) {
//            for(int i = 0; i < 4; i++) {
//                alpha();
//                System.out.println("Namaste");
//            }
//        }
//    }
//    public static void main(String[] args) {
//       try {
//           alpha();
//       }
//       catch(Exception e) {
//
//       }
//    }
//}



//class Hello {
//    public void alpha() throws Exception
//    {
//        int[] arr = new int[5];
//        try {
//            arr[6] = 4;
//            System.out.println("Namaste");
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Please set the length properly ");
//        }
//    }
//}
//
//public class exception  {
//    public static void main(String[] args) {
//        Hello Hi = new Hello();
//        try {
//            Hi.alpha();
//        } catch (Exception ex) {
//            System.out.println("Something went wrong ");
//        }
//    }
//}

//import java.util.*;
//public class exception {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int c = 0;
//       try {
//           int a = scanner.nextInt();
//           System.out.println("Hii");
//       }
//        catch(InputMismatchException ex) {
//            System.out.println('H');
//            int a = scanner.nextInt();
//            int b = 5;
//             c = a + b;
//        }
//        System.out.println(c);
//    }
//}

//import java.util.*;
//class MyException extends Exception
//{
//    MyException(String msg) {
//        super(msg);
//    }
//}
//public class exception {
//    public static void main(String[] args) {
//        //try with Resources
//        try(Scanner sc = new Scanner(System.in)) {
//            String s = sc.nextLine();
//            String se = "GO AND GET IT";
//            System.out.println(s + se);
//            int a = 10/0;
//            System.out.println("M");
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Invalid Operation");
//        }
//        finally {
//            System.out.println("Hii");
//        }
//        try {
//            System.out.println("Welcome");
//            Exception e = new MyException("Invalid input");
//            throw e;
//        }
//        catch(Exception e) {
//            System.out.println("error " + e);
//        }
//    }
//}


import java.util.*;

class Skimming
{
    public void Skim(String Username1 ,  String Password1) throws MyException
    {
        int length1 = Username1.length();
        int length2 = Password1.length();
        if(length1 < 8 || length2 < 8)
        {
            throw new MyException("Characters must be greater than 8");
        }
    }
}
class MyException extends Exception
{
    MyException(String msg) {
        super(msg);
    }
}
class Verification
{
    public void Valid() throws MyException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username");
        String Username = "Gajrajsinghsarangdevot453";
        String Password = "Gajraj@13";
        String Username1= sc.nextLine();
        System.out.println("Enter Your Password");
        String Password1 = sc.nextLine();

        Skimming Check = new Skimming();
        try {
            Check.Skim(Username1, Password1);
        } catch (MyException ex) {
            System.out.println(ex);
        }


        if(Username1.equalsIgnoreCase(Username))
        {
            if(Password1.equalsIgnoreCase(Password))
            {
                System.out.println("Welcome to your account");
            }
        }
        else {
            throw new MyException("Ohh");
        }
    }
}
 class Checking
 {
    public void Check()
    {
        Verification V = new Verification();
        try
        {
            V.Valid();
        }
        catch(MyException e)
        {
            System.out.println("Wrong Username or Password entered");
            System.out.println();
            try{
                V.Valid();
            }
            catch(MyException ex)
            {
                System.out.println("Again Wrong Username or Password entered");
                System.out.println();
                try {
                    V.Valid();
                }
                catch(MyException exe) {
                    System.out.println("Something fishy happening here or ....there ?");
                }
        }
        }
    }
 }

public class exception
{
    public static void main(String[] args)
    {
        Checking Let = new Checking();
        Let.Check();
    }
}


