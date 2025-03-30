## Exercise *terms*

A term in a programming language might be expressed by means of the following grammar:
			 
```
        Term ::= Constant
               | Variable
               | Expression
  Expression ::= Term BinaryOperator Term
               | UnaryOperator Term
```		

This grammar has to be read as follow:

- A term is either a constant or a variable or an expression.
- An expression is a term and a binary operator and term or a unary operator and a term.
- In other words the symbol "::=" means 'is a' and "|" correspond to the alternative.

The above grammar can be represented in UML as follows:
The following class diagram models such situation:

![ ](images/terms.png)

The Context class has a mutable attribute *lookupTable* that stores for each variable name a value. It is a mapping [ Variable Name : Value ]. The two methods bind and get binds a value to a variable name and returns the value for a given variable name, respectively.

**TO DO**

1) Provide an implementation such that a function *eval()* returns the evaluation of a term, e.g. *(3 + -d) * 5* where *d = 7*, which is *-20*.

2) Draw a sequence diagram of the method eval() that evaluate the above arithmetic expression.

3) Question: Does your program make use of mutual recursion ? What do you think ?

**Solution**

1) Implementation: see source code and tests.

2) Sequence diagram for the *eval()* function over the aritmetic expression: *(3 + -d) * 5* where *d = 7*

![sequence diagram for eval](images/eval.png)

3) Answer: 

It seems that this solution implements a classic recursive algorithm.  However, as illustrated in the above sequence diagram, the recursive calls invoke the same method *eval()* but on different objects.  In this sense we can consider that the kind of recursion is mutual because different objects call other object recursively.

---

To generate this site, go into the root directory of the project (where the *pom.xml* file is) and then type:

    mvn clean package site

The *clean* target deletes the old genrated files to start with a clean configuration.

The *package* target compiles the source code of the project and executes the tests.

The *site* target generates the documentation (website) and produces the KDoc/Dokka Kotlin documentation.  On the left there is a menu where you find some information about the project such as the KDoc documentation.

The documentation (website) is located in *target/site* directory under *index.html*, to visualize it:

    firefox target/site/index.html

The KDoc documentation is in *target/site/dokka/project-name/index.html*.

To compile the source code:

    mvn clean compile
		
To compile and test your source code, still in the root directory:

    mvn clean package

To skip the tests:

    mvn clean package site -DskipTests

To execute the application you can either execute the JAR file:

    java -jar target/{$2}-1.0-SNAPSHOT.jar

where *1.0-SNAPSHOT.jar* is the version defined in the *pom.xml*

or execute the application directly from command-line:

    mvn exec:java

Note that the *main.class* property in the *pom.xml* has to be changed according to the main class of the application.
