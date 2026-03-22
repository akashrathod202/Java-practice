// public class hello2{
//     static int add(int a,int b){
//         return a + b;
//     }
//     public static void main(String[] args){

//         int result =add(4,6);
//         System.out.println(result);
//     }
// }


// class hello2{

//      static  void  eo(int a){
//         if(a %  2 == 0){
//             System.out.println("this is even number");
//         }else{
//             System.out.println("this is not a even number");
//         }
     

//     }
//     public static void main(String[] args){
//       eo(7);
//     }
// }


// method overloading

class hello2{
    static int add(int a,int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;

    }

    public static void main(String[] args){
        System.out.println(add(2, 3));      
        System.out.println(add(2, 3, 4));
    } 
}