<div align="center">
  
  <img src="https://i.pinimg.com/originals/2f/b0/21/2fb02132a0f8ac1543495367c78562bd.png" alt="Logo" width="200">

  <h3>Bazinga!</h3>

  <p>
    A programming language based on 'The Big Bang Theory' show!
  </p>
</div>

## Description
Bazinga! is a multi-paradigm, dynamically-typed language based on 'The Big Bang Theory' show. The language is turing-complete but
is far from being a complete and usable language, I just hope its enough to humiliate my teacher! xD

## Motivation
Humiliate my teacher at a coding competition 😁

## Technical Details

### Native Types
- `Boolean`
- `String`
- `Number`

### Syntax

#### Variables

```java
spot variableAreNamedInCamelCase = 0;
```

#### Conditionals

```java
if (2 == 2) {
  eureka "xD";
}
```

#### Loops

```java
while (true) {
  eureka "I will be here forever";
}

for (spot i = 0; i < 5; i = i + 1) {
  eureka "I will actually never be executed because of the loop above";
}
```

#### Functions

```java
fun sayHello(a, b) {
  spot result = a + b;

  bazinga result;
}
```
Note, that instead of `return` we have `bazinga` :D


#### Classes

```java
class Animal {

  init(name, age) {
    this.name = name;
    this.age = age;
  }

  talk() {
    eureka "I'm an animal";
  }
}

class Dog < Animal {

  init(name, age, breed) {
    super.init(name, age);
    this.breed = breed;
  }

  talk() {
    super.talk();
    eureka "I'm from " + breed " breed.";
  }

}

spot dog = Dog("Filipe", 16, "Teenager");
dog.talk();
```

#### Changed keywords
I popular keywords were changed to resemble the famous show.

- `print` -> `eureka`
- `return` -> `bazinga`
- `var` -> `spot`

If you have ideas for changing some other keywords, all you have to do it edit the `Scanner.java` file :D

### Native Functions
- `print` (this is the only function that does not have paranthesis)
- `Array(size)` (this as the additional `.get(index)` and `.set(index, value)` methods)
- `Number(value)`
- `split(array)`
- `String(value)`
- `readFile(path)`
- `type(value)`

## Usage
There are two ways in which you can run Bazinga!, either by running the prompt or a file. To run the prompt
just execute: 
```
java Bazinga.java
```
And to execute a file:
```
java Bazinga.java [file_name.baz]
```
P.S. I plan in developing a more concise way of running Bazinga!, but for now it is not my priority. If you're
having trouble executing the a file you can always try to hardcode the file name inside `main()` in `Bazinga.java` and executing the file through your IDE. 

## Credits
This programming language would probably not exist if it was not for the incredible book, *Crafting Interpreters* by Robert Nystrom. The book is very well-structured and I would totally recommend it for anyone interested in building an interpreter. There is a paid physical copy of the book or a totally free web option, which you can find [here](http://craftinginterpreters.com/).