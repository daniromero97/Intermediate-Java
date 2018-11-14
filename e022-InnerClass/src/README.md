- An internal class has access to all the variables and methods of its external class and can refer to them directly in the same way that other non-static members of the external class do.
- To create an instance of an internal class, you must first create an instance of the external class. Then, create the internal object within the external object.
    - Example:
    ```
    ExternalClass e = new ExternalClass();
    ExternalClass.InnerClass = e.new InnerClass();
    ```
- Sometimes, an internal class is used to provide a set of services that only its attached class uses.


- Static nested classes do not have direct access to other members (variables and non-static methods) of the attached class because, because it is static, you must access the non-static members of your attached class through an object.
- That is, you can not directly reference the non-static members of your attached class.
- Due to this restriction, nested static classes are rarely used.
