# java-wonders
What is Java?
In essence, Java is 2 things. First, Java may be a programming and computing platform. Sun Microsystems first released it in 1995. Today, it's widely utilized in a spread of various websites. In fact, numerous applications and websites simply won't run unless you have got Java installed.

Java is easier to use than other programming languages, like C++, partially because it uses an object-oriented programming model. In object-oriented programming, concepts are represented as “objects” that have data fields and associated methods. In object-oriented programming, models called “objects” represent either a programming entity or an abstract project. Although, they're assembled independently of 1 another, all of those objects together form a full piece of software. In Java, these “objects” are a part of “classes” and that they inherit the code common to the category. Object-oriented programming presents variety of various advantages. specifically, it reduces the likelihood of great errors in codes. It also makes it easier to switch and maintain existing code. Overall, this code use and code recycling makes coding rather more efficient.

In addition to a programming and computer platform, Java is additionally a program, or a “run-time environment” that you just can install on any computer, smartphone, or mobile device so as to run Java-based applications.

# How is Java Used?
In today’s world, Java has a vast variety of different uses. For example, Java is used for web-applications like Google docs, as well as for things like mobile games. Perhaps most notably, Java is widely used to build small application modules or applets for use as part of a web page. Basically, developers use it to create applications on your computer.

If you are interested in using Java for app development, you might want to check out this great introductory course to fast and easy app development.

# About java version?
The latest version of Java is Java 14 or JDK 14 released on March, 17th 2020 (follow this article to check Java version on your computer). JDK 15 is in progress with early-access builds.

# Apache Maven
Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project.

# Run Eclipse with a JDK
Maven requires Eclipse using a JDK, i.e. Java Development Kit, instead of a Java Runtime Environment (JRE). The main difference is that a JDK also contains a Java Compiler and other tools to develop Java Code, while the JRE is only able to run compiled Java applications.

To check with what Java version (JRE or JDK) Eclipse is running, do the following:

Open the menu item Help > About Eclipse. (On the Mac, it’s in the Eclipse-menu, not the Help-menu)
Click on Installation Details.
Switch to the tab Configuration
Search for a line that starts with -vm. The line following it shows which Java binary is used.
Depending on the name and location of the used Java binary one can figure out if a JRE or a JDK is used:

If the path contains “jre” (e.g. as in C:\Program Files\Java\jre6\bin\client\jvm.dll) it is a JRE
If the path contains “jdk” (e.g. as in C:\Program Files\Java\jdk1.6.0_31\bin\javaw.exe) it is a JDK.
If no JDK is used for Eclipse, change it:

Quit Eclipse if it is running
Go to the Eclipse installation directory and open the file eclipse.ini in a text editor.
Search for the line -vmargs
Before the line -vmargs, add two lines:

On the first line, write -vm

On the second line, write the path to your JDK installation (usually something like: C:\Program Files\Java\jdk1.6.0_31\bin\javaw.exe on Windows)
Java is available on Microsoft Windows in 64 and 32 bit versions, allowing users to get the appropriate version for their system. Users can even run both side-by-side for 64 bit operating systems.

# what is servlet?
A servlet is a small Java program that runs within a Web server. Servlets receive and respond to requests from Web clients, usually across HTTP, the HyperText Transfer Protocol.

# Build and release management
Release management is the process of managing, planning, scheduling and controlling a software build through different stages and environments; including testing and deploying software releases.
# what is JDBC ?
Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java, which defines how a client may access a database. It is a Java-based data access technology used for Java database connectivity. It is part of the Java Standard Edition platform, from Oracle Corporation.
# Android Studio
Android Studio is the official integrated development environment for Google's Android operating system, built on JetBrains' IntelliJ IDEA software and designed specifically for Android development. It is available for download on Windows, macOS and Linux based operating systems.
# How to learn android studio and from where 
https://developer.android.com/samples
please follow the given link as we all know android studio is an open source application so you all can find enogh resourse on the provided link

# Algorithms ?
An algorithm is a step by step procedure to solve logical and mathematical problems. A recipe is a good example of an algorithm because says what must be done, step by step. ... For the purpose of computing, algorithms are written in pseudocode, flow charts, or programming languages. 

1)Factorial :- Factorials are very simple things. They're just products, indicated by an exclamation mark. For instance, "four factorial" is written as "4!" and means 1×2×3×4 = 24. In general, n! ("enn factorial") means the product of all the whole numbers from 1 to n; that is, n!

2)Eight-Queens :- Algorithm Implementation/Miscellaneous/N-Queens. The eight queens puzzle is the problem of putting eight chess queens on an 8×8 chessboard such that none of them is able to capture any other using the standard chess queen's moves. ... Thus, a solution requires that no two queens share the same row, column, or diagonal.

3)FizzBuzz :- Fizz Buzz is a very simple programming task, asked in software developer job interviews. A typical round of Fizz Buzz can be: Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz" instead of the number and for the multiples of '5' print "Buzz".

4)Fibonacci :-  The Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is, and. for n > 1.

5)Knight-Tour :- A knight's tour is a sequence of moves of a knight on a chessboard such that the knight visits every square exactly once. ... The knight's tour problem is the mathematical problem of finding a knight's tour. 

# JFrame
JFrame class is a type of container which inherits the java. awt. Frame class. JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI. Unlike Frame, JFrame has the option to hide or close the window with the help of setDefaultCloseOperation(int) method.

# How to create a JFrame
1) In the Projects window, right-click the ContactEditor node and choose New > JFrame Form. Alternatively, you can find a JFrame form by choosing New > Other > Swing GUI Forms > JFrame Form.
2) Enter ContactEditorUI as the Class Name.
3) Enter my. contacteditor as the package.
4) Click Finish.

# Swing
Swing is a GUI widget toolkit for Java. It is part of Oracle's Java Foundation Classes – an API for providing a graphical user interface for Java programs. Swing was developed to provide a more sophisticated set of GUI components than the earlier Abstract Window Toolkit.
