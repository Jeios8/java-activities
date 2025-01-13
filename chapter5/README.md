## Task Sheet 1-2-4  
**Point Scaling Program**

This program demonstrates the creation of a `Point` class with methods to manipulate its coordinates. Specifically, it includes a `scale` method that halves the distance of the point from the origin `(0, 0)` each time it is called.

### Key Features:
- **Point Class**: Represents a point in a 2D coordinate system with `x` and `y` attributes.
- **Constructor**: Initializes the point with given `x` and `y` coordinates.
- **scale Method**: Halves the values of `x` and `y`, effectively moving the point closer to `(0, 0)`.
- **print Method**: Prints the current coordinates of the point in the format `(x, y)`.

## Task Sheet 1-2-4
**Vehicle and Car Class Program**

This program demonstrates inheritance in Java by creating a base class `Vehicle` and a derived class `Car`. The `Car` class inherits common attributes from the `Vehicle` class and adds its own specific attribute: the number of doors.

### Key Features:
1. **Inheritance**: The `Car` class inherits attributes from the `Vehicle` class using the `extends` keyword.
2. **Encapsulation**: The attributes are encapsulated within their respective classes, with appropriate access modifiers (`protected` and `private`).
3. **Constructor Overloading**: The `Car` class calls the `Vehicle` constructor using `super()` to initialize inherited attributes.
4. **Method Overriding**: The `displayDetails()` method in `Car` prints the details of both inherited and unique attributes.

## Task Sheet 1-2-6
**Abstract Class and Subclass Implementation**

This program demonstrates how to define and use abstract classes in Java by creating an abstract class `abstractClass` with both abstract and concrete methods. Subclasses `B` and `C` provide their own implementations of the abstract method.

### Key Features:
1. **Abstract Class**:
   - Contains an abstract method `abstractMethod()` that must be implemented by subclasses.
   - Contains a concrete method `concreteMethod()` with a default implementation.

2. **Subclasses**:
   - `B` and `C` inherit from `abstractClass` and provide different implementations of the abstract method.
   
3. **Main Class**:
   - Creates instances of `B` and `C` and calls both abstract and concrete methods.