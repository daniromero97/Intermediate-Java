- Overloading methods is a feature that allows a class to have more than one method with the same name, if their arguments are different.
- Example:

    ```
    public class Car
    {
        // Properties
        private double speed;

        // getters and setters
        public String getSpeed()
        {
            return speed;
        }

        private void setSpeed(double speed)
        {
            this.speed = speed;
        }

        // Methods
        public void speedUp() {
            setSpeed(getSpeed() + 10.0);
        }

        public void speedUp(int increase) {
            setSpeed(getSpeed() + increase);
        }

    }
    ```

- The method "speedUp()" is overloaded.
