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
var variableAreNamedInCamelCase = 0;
```

#### Conditionals

```java
if (2 == 2) {
  print "xD";
}
```

#### Loops

```java
while (true) {
  print "I will be here forever";
}

for (var i = 0; i < 5; i = i + 1) {
  print "I will actually never be executed because of the loop above";
}
```

#### Functions

```java
fun sayHello(a, b) {
  var result = a + b;

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
    print "I'm an animal";
  }
}

class Dog < Animal {

  init(name, age, breed) {
    super.init(name, age);
    this.breed = breed;
  }

  talk() {
    super.talk();
    print "I'm from " + breed " breed.";
  }

}

var dog = Dog("Filipe", 16, "Teenager");
dog.talk();
```

### Native Functions
- `print` (this is the only function that does not have paranthesis)
- `Array(size)`
- `Number(value)`
- `split(array)`
- `readFile(path)`
