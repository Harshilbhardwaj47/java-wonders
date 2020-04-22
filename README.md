# java-wonders
What is Java?
In essence, Java is 2 things. First, Java may be a programming and computing platform. Sun Microsystems first released it in 1995. Today, it's widely utilized in a spread of various websites. In fact, numerous applications and websites simply won't run unless you have got Java installed.

Java is easier to use than other programming languages, like C++, partially because it uses an object-oriented programming model. In object-oriented programming, concepts are represented as “objects” that have data fields and associated methods. In object-oriented programming, models called “objects” represent either a programming entity or an abstract project. Although, they're assembled independently of 1 another, all of those objects together form a full piece of software. In Java, these “objects” are a part of “classes” and that they inherit the code common to the category. Object-oriented programming presents variety of various advantages. specifically, it reduces the likelihood of great errors in codes. It also makes it easier to switch and maintain existing code. Overall, this code use and code recycling makes coding rather more efficient.

In addition to a programming and computer platform, Java is additionally a program, or a “run-time environment” that you just can install on any computer, smartphone, or mobile device so as to run Java-based applications.

How is Java Used?
=================
In today’s world, Java has a vast variety of different uses. For example, Java is used for web-applications like Google docs, as well as for things like mobile games. Perhaps most notably, Java is widely used to build small application modules or applets for use as part of a web page. Basically, developers use it to create applications on your computer.

If you are interested in using Java for app development, you might want to check out this great introductory course to fast and easy app development.

About java version?
===================
The latest version of Java is Java 14 or JDK 14 released on March, 17th 2020 (follow this article to check Java version on your computer). JDK 15 is in progress with early-access builds.
**************************************************************************************************************************************
**************************************************************************************************************************************
Run Eclipse with a JDK
=======================
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
