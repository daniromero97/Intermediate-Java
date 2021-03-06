- A method of a class "A" can be defined as final by prepending the word "final" to the declaration of said method.
- In such case, said method can no longer be overwritten or replaced in any class that derives from "A".
- Example:
    ```
    public final void speedUp()
    {
        ...
    }
    ```
- It can also be achieved that classes can not be derived from another class "A". For this, it is enough to establish class "A" as the end.
- For example, if we want that classes can not be derived from the class "Car", it would be enough to define this class as final in the following way:
    ```
    public final class Car extends Vehicle
    {
        ...
    }
    ```

- The order of the reserved words "public" and "final" is irrelevant.
