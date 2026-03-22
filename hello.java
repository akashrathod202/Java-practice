// public class hello {
//     public static void main(String[] args) {

//         int num = 10;   // local variable

//         System.out.println(num);

//     }
// }


// instance vairable


// class hello{
//     int age;
//     public static void main(String[] args)
//     {
//         hello s1 = new hello();
//         s1.age=20;

//         System.out.println(s1.age);


//     }
// }


// static varible//


// class hello{
//     int age=34;
//     static String school ="abc";

//     public void show () {
//         int marks =54;
//         System.out.println(marks);
//     }
// }


// implicit convert

// class hello{
//   public static void main(String[] args){
//     int num =10;
//     double value=num;
//     System.out.println(value);
//   }
// }


// explicit type casting

// class hello {
//     public static void main (String[] args){
//         double num = 89.8;
//         int value=(int) num ;

//         System.out.println(value);
//     }
// }


// class hello{
//     public static void main(String[] args){
//         for(int i =1; i<=5; i++){
//             System.out.println(i);
//         }
     
//     }
// }


// class hello{
//     public static void main(String[] args){
//         int i=1;
//         while(i <= 10){
//             System.out.println(i);
//             i++;
//         }g
//     }
// }


// class hello{
//     public static void main(String[] args){
//         int i=1;
// do{
//     System.out.print(i);
//     i++;

// }while(i<=9);
//     }
// }


// class hello{
//     public static void main(String[] args ){

//         for(int i =1;i<=5;i++){
//             if(i % 2 == 0){
//                 System.out.println(i + "even");
//             }
//             else{
               
//                 System.out.println(i + "odd");
//             }
//         }
//     }
// }



// class hello{
//     public static void main(String[] args){
//         int num =9;
//         boolean isPrime =true;

//         if(num <=1){
//             isPrime=false;
//         }else{
//             for(int i=2; i<num;i++){
//                 if(num % i == 0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime){
//             System.out.println("prime");
//         }else{
//             System.out.println("not prime");
//         }

//     }
// }


class hello {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}




