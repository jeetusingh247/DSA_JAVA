
// Object means a real-world entity such as a pen, chair, table, computer, watch, etc.
// Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.

// Syntax to declare a class
// class <class_name>{  
//     field;  
//     method;  
// } 


    // Java Program to illustrate how to define a class and fields  
    // Defining a object_class_OOps.class.  
    class object_class_OOps {  
        // defining fields  
        int id; // field or data member or instance variable  
        String name;  
        // creating main method inside the Student class  
        public static void main(String args[]){  
        // Creating an object or instance  
        Student s1 = new Student();// creating an object of Student  
        // Printing values of the object  
        System.out.println(s1.id);// accessing member through reference variable  
        System.out.println(s1.name);  
        }  
     
    
}
