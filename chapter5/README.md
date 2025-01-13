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

## Task Sheet 1-2-8  
**Shape Interface and Abstract Implementation**

This program demonstrates the implementation of a `Shape` interface and its concrete classes to calculate the area and perimeter of geometric shapes. It includes a base `AbstractShape` class for shared attributes and specific implementations for `Circle` and `Rectangle` classes.

### Key Features:
- **Shape Interface**: Defines methods for `calculateArea` and `calculatePerimeter`.
- **AbstractShape Class**:
  - Includes common attributes such as `color`, `length`, and `width`.
  - Provides default implementations for area and perimeter calculations of rectangular shapes.
- **Circle Class**:
  - Extends `AbstractShape`.
  - Adds a `radius` attribute.
  - Overrides methods to calculate area and perimeter specific to circles.
- **Rectangle Class**:
  - Extends `AbstractShape`.
  - Inherits default implementations of area and perimeter calculations.
- **Main Class**:
  - Demonstrates the creation of `Circle` and `Rectangle` objects.
  - Displays the color, area, and perimeter of each shape.