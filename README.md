# Core_Java_Tutorial
Object Oriented Programming (OOPs) Concept in Java

A class is a user-defined blueprint or prototype from which objects are created
An object is a basic unit of Object-Oriented Programming that represents real-life entities.

An object mainly consists of: 
State: It is represented by the attributes of an object. It also reflects the properties of an object.
Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
Identity: It is a unique name given to an object that enables it to interact with other objects.
Method: A method is a collection of statements that perform some specific task and return the result to the caller.

All classes have at least one constructor. If a class does not explicitly declare any, the Java compiler automatically provides a no-argument constructor, also called the default constructor. This default constructor calls the class parent’s no-argument constructor (as it contains only one statement i.e super();), or the Object class constructor if the class has no other parent (as the Object class is the parent of all classes either directly or indirectly). 

Ways to Create an Object of a Class
1. Using new keyword
// creating object of class Test
Test t = new Test();

2. Using Class.forName(String className) method
There is a pre-defined class in java.lang package with name Class. 
// creating object of public class Test
// consider class Test present in com.p1 package
Test obj = (Test)Class.forName("com.p1.Test").newInstance();

3. Using clone() method
// creating object of class Test
Test t1 = new Test();
// creating clone of above object
Test t2 = (Test)t1.clone();

4. Deserialization
De-serialization is a technique of reading an object from the saved state in a file.
FileInputStream file = new FileInputStream(filename);
ObjectInputStream in = new ObjectInputStream(file);
Object obj = in.readObject();

Anonymous Objects in Java
Anonymous objects are objects that are instantiated but are not stored in a reference variable. 
btn.setOnAction(new EventHandler()
{
    public void handle(ActionEvent event)
    {
        System.out.println("Hello World!");
    }
});

Types of Constructors in Java
1. Default Constructor in Java
A constructor that has no parameters is known as default the constructor. 
Default constructor provides the default values to the object like 0, null, etc. depending on the type.

2. Parameterized Constructor in Java
A constructor that has parameters is known as parameterized constructor

There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.

3. Copy Constructor in Java
Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.

Author : Er Bilal Shaikh
