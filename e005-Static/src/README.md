- With the reserved word "static", it is not necessary to instantiate an object to access a class, an attribute or a method.
- Example:

    ```
    public class Main
    {
        public static void main (String args[])
        {
            System.out.println(Operations.sum(5,6));
        }
    }
    ```
    ```
    class Operations
    {
        public static double sum(double a1, double a2)
        {
            return a1+a1;
        }
    }
    ```
