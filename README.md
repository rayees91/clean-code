There are two files for the solid principles.
They are: 1.NoSolid.java : This program violates all the five solid principles 
2.WithSolid.java : The above program is rewritten to follow all the solid principles Violation of principles and Re-writing the program such that it doesnt violate the principles:

1.Single responsibility principle: There is a class called Phone which has many functionalities, so it clearly violates the principle. To avoid this, we create 
different classes such that the classes have single responsiblility at a time.

2.Open-Closed Principle: The unlock feature which is declared under phone class has to be changed whenever is needed. To change it, the class has to be modified but 
it violates the principle, so to avoid this an interface is created and is implemented whenever it is needed for extension.

3.Liskov-Substitution principle: The class call landline extends phone class, so it gets all the methods of phone class, but the phone class has a method called message 
which should not get into landline, it clearly violates the principle.So to avoid this, now landline class extends only the call class which has call method in it only.

4.Interface Segregation Principle: The interface called applications has different methods which when implemented into android, Ios class gets all the methods.The Ios 
does not support 3rd party applications. This clearly violates the principle.So to avoid this, we created two interfaces and divided the methods into it and we implement 
the required interfaces.

5.Dependency-Inversion Principle: The class phone-detector highly depends on samsung,apple classes which shouldnt be the case, so to avoid direct dependency, we create 
interface with common method and now the phone-detector class does not directly depends, but has access through the interface.

Now as the code is re-written, all the solid principles are followed
