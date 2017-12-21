# Design Patterns Chapter 2: The Observer Pattern

This repo is the exercise from Chapter 2 of [Head First Design Patterns](https://www.amazon
.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124).

## How to run

- git clone this repo
- cd ..
- compile the java files: `javac observerpattern/src/main/java/*.java`
- run the java main program: `java observerpattern/src/main/java/Main`

## Lessons from Chapter 2

### One-to-many relationship
Subject is one and Observers are many.

### Loose coupling
The Subject and its Observers are loosely coupled, meaning they can interact, but they do not 
know very much about each other. For instance, the Subject knows that it has a list of Observers,
 but it does not know what each Observer does with the Subject's data. The Observers do not know 
 about each other at all. The BENEFIT of loose coupling is that if you add many new observers 
 (like many new types of weather displays) you never have to update the Subject OR update any of 
 the other observers. You can also update the Subject to include new properties, and you don't 
 have to go back and update all Observers using the subject.




### Notes from Chapter 2 exercise


