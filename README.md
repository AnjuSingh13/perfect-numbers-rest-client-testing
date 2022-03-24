# perfect-numbers-rest-client

# PerfectNumberAPIs

This is a Java program to check if a number is perfect or not. It will also return all perfect numbers in a given range of numbers.

This contains two REST APIs to serve the following operations:

1. Check if a given number is perfect
2. Find all perfect numbers between a range (start-end)

# Tools used

* Java 8
* intellij
* jetty
* Maven
* Spring configuration

## To build
- Install in local maven repository 
- Run `mvn clean install` to install it in local repository and build executable jar
- The executable jar we can find in the `target` folder

# Execution

- Run `java -jar perfect-numbers-rest-client-1.0.0-SNAPSHOT-jar-with-dependencies.jar` from command line


There are two end-points available as follows:

* /isPerfect/{input}/ - Check if a given number in "input" is a perfect number, example http://localhost:8080/isPerfect/28
* /perfectNumbersFromRange/{start}/{end} - Gets all perfect numbers with in the range, example http://localhost:8080/perfectNumbersFromRange/1/10000

## Test
- Unit test included 

There is scope for following improvements in program
1. Include error handling
2. Include authentication 
