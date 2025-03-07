public class FindMaximum {

    public static void main(String[] args){
       if (args.length==2){
            int FirstNum = Integer.parseInt(args[0]);

            int SecondNum = Integer.parseInt(args[1]);
            if (FirstNum>SecondNum){
                System.out.println(FirstNum);
            }else if (SecondNum>FirstNum){
                System.out.println(SecondNum);
            }else {
                System.out.println("Both Maximum");
            }
       }else {
           System.out.println("Please enter 2 number");
       }

//        int num1 =Integer.parseInt(args[0]);
//        int num2 =Integer.parseInt(args[1]);
//
//        boolean condition = num1 > num2;
//        int max = condition ? num1 : num2;
//        System.out.println(max);


    }
}
