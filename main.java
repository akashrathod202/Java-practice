// // class Student {
// //     int id;
// //     String name;

// //     void display() {
// //         System.out.println(id + " " + name);
// //     }
// // }

// // public class oop {
// //     public static void main(String[] args) {
// //         Student s1 = new Student();
// //         s1.id = 101;
// //         s1.name = "Akash";
// //         s1.display();
// //     }
// // }


// // abstract
// // class

// // abstract class animal{
// //     void eat(){
// //         System.out.println("eating");
// //     }

// //     abstract void sound();

// // }

// // class Dog extends animal{
// //     void sound(){
// //         System.out.println("banking");
// //     }
// // }

// // class oop{
// //     public static void main(String[] args){
// //     Dog d=new Dog();
// //     d.eat();
// //     d.sound();
// //     }
// // }

// class ageException extends Exception{
//     ageException(String msg){
//         super (msg);
//     }
// }

// public class oop{
//     static void checkage(int age) throws ageException{
//         if(age < 18) {
//        throw new ageException("not allowed");
//         }
//         else{
//             System.out.println("allowed");
//         }
//     }


// public static void main(String[] args){
//     try{
//         checkage(78);
//     }catch(ageException e){
// System.out.println(e.getMessage());
//     }
// }
// }


 
// abstract class Animal{
//     abstract void sound();
     
//     void eat(){
//         System.out.println("Eating...");

//     }
// }
//     class Dog extends Animal{
//         void sound(){
//             System.out.println("bark");
//         }
//     }



//     public class main{
//         public static void main(String[] args){
//             Dog d =new Dog();
//             d.sound();
//             d.eat();
//         }
//     }

// 
// abstract class Shape{
//     void print(){
//         System.out.println("lets see next");
//     }

//     abstract void area(); // better design
// }

// class Circle extends Shape{
//     int radius;


//     Circle(int radius){
//         this.radius=radius;
//     }
 
//     void area(){
//         System.out.println("Circle Area: " + (Math.PI * radius * radius));
//     }
    
// }


// class Reactangele extends Shape{
//     int length,width;

//     Reactangele(int length,int width){
//         this.length=length;
//         this.width=width;
//     }

     
//     void area() {
//         System.out.println("Rectangle Area: " + (length * width));
//     }
// }




// public class main{
//     public static void main(String[] args){

//         Shape c =new Circle(5);
//         c.print();
//         c.area();

//         System.out.println();

//         Shape r = new Reactangele(4, 6);
//         r.print();
//         r.area();

         

//     }
// }



//  interface Animal {

//     void sound();
    
// }


// class Dog implements Animal{
//     public void sound(){
//         System.out.println("bark");
//     }
// }

// public class main{
//     public static void main(String[] args){
//         Animal a= new   Dog();
//         a.sound();
//     }
// }




// public class main {
//     public static void main(String[] args){
//         try{
//             int a =10;
//             int b=0;

//             int result=a/b;
//             System.out.println(result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("cannot divide by zero");
//         }finally{
//             System.out.println("program finshied");
//         }
//     }
// }


// public class main{

//     public static void main(String[] args){
      
//          int[] arr= new int[5];

//          try{

//          System.out.println(arr[10]);
      
//          }catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("index is out of range!");
//          }
//     }
// }



// // userdefind Exception

//  class invalidMarksException extends Exception{
//     public invalidMarksException(String msg){
//         super(msg);
//     }
//  }


//  public class main{
//     public static void main(String[] args){
//         int marks=70;

//         try{
//             if (marks < 80){
//                 throw new  invalidMarksException( "marks should be above 80");
//             }
//             System.out.println("you can get acces");
//         }catch(invalidMarksException e){
//             System.out.println(e.getMessage());
//         }
//     }
//  }



public class main{
    static int add(int a, int b){
        return a + b;
    }

    static void greet(){
        System.out.println("hello bro");
    }

    static void checkevenorodd(int num){
        if (num %2 == 0){
            System.out.println(num +"this is odd number");

        }else{
            System.out.println(num +"is odd");
        }
    }

        static int getnumber(){
            return 10;
        }


        public static void main(String[] args){
            greet();

            int sum =add(5,4);
            System.out.println("sum ="+sum);


            checkevenorodd(7);

            // calling function without parameter
            int num = getnumber();
            System.out.println("Number = " + num);
        }
}

