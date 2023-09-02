# Java Arrays

Arrays are fundamental data structures in Java that allow you to store and manipulate collections of elements of the same type. They provide a convenient way to work with multiple values of the same data type. In Java, arrays have a fixed size, which means you need to specify the size when creating an array.

## Declaring and Initializing Arrays

You can declare and initialize arrays in several ways:

### Single-Dimensional Array

```
// Declare and initialize an integer array with 5 elements
int[] numbers = new int[5];

// Initialize an array with values
int[] primes = {2, 3, 5, 7, 11};
```

### Multi-Dimensional Array
Java supports multi-dimensional arrays, including 2D, 3D, and higher dimensions:
```
// Declare and initialize a 2D array
int[][] matrix = new int[3][3];

// Initialize a 2D array with values
int[][] identityMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
```
### Accessing Array Elements
You can access individual elements of an array using the array index, which starts at 0 for the first element:
```
int firstNumber = numbers[0]; // Access the first element
int thirdPrime = primes[2];   // Access the third element
```
### Array Length
To determine the length (number of elements) of an array, you can use the length property:
```
int arrayLength = numbers.length;
```
### Iterating Over Arrays
You can use loops, such as for loops, to iterate over the elements of an array:
```
for (int i = 0; i < numbers.length; i++) {
    // Access and process each element in the array
    int element = numbers[i];
}
```
Alternatively, you can use the enhanced for-each loop:
```
for (int number : numbers) {
    // Access and process each element in the array
}
```
### Modifying Arrays

Arrays have a fixed size, which means you cannot change their size after initialization. However, you can modify individual elements by assigning new values:
```
numbers[0] = 42; // Modify the first element
```
### Arrays in Java Collections

Java provides more flexible data structures like ArrayList in the java.util package for dynamic collections. If you need a collection that can grow or shrink dynamically, you might want to explore these options.

For more information on arrays in Java, refer to the official Java documentation.
