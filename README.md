# LabFitnessTracker.
The lab prompts the user to input a workout type, the duration of the workout, and the distance traveled in the workout
The program uses the Scanner object 'keyboard' to accept the user inputs between each prompt
The superclass Workout contains the workout type variable 'type' and the duration variable 'duration' and the method 'showWorkout' which outputs the workout and duration
The subclass RunningWorkout contains the workout distance variable 'distance' and the method 'showDetails' which calculates the calorieLoss variable by dividing distance by 60, before outputting the distance and the calorie loss
The program finishes off by calling the 'showWorkout' method and the 'showDetails' method

```java
import java.util.Scanner;
public class Lab_FitnessTracker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //Creates a Scanner object named 'keyboard'

        RunningWorkout r = new RunningWorkout(); //Creates a RunningWorkout object named 'r'

        System.out.print("Enter workout type: "); //Prompts the user for an input (String)

        r.type = keyboard.nextLine(); //Sets the variable 'type' to what the user inputs

        System.out.print("Enter duration (minutes): "); //Prompts the user for an input (Int)

        r.duration = keyboard.nextInt(); //Sets the variable 'duration' to what the user inputs

        System.out.print("Enter distance (km): "); //Prompts the user for an input (Double)

        r.distance = keyboard.nextDouble(); //Sets the variable 'distance' to what the user inputs

        System.out.println(); //Separates the user inputs in the output from the method outputs

        r.showWorkout(); //Calls the showWorkout method
        r.showDetails(); //Calls the showDetails method
    }
}
class Workout
{
    String type; //Type of workout
    int duration; //In minutes
    void showWorkout()
    {
        System.out.println("Workout type: " + type + "\nDuration: " + duration + " minutes.");
    }
}
class RunningWorkout extends Workout
{
    double distance; //In kilometers
    void showDetails()
    {
        double calorieLoss = distance * 60; //Calculates the calories burned by dividing distance by 60
        System.out.println("Distance: " + distance + "\nCalories burned: " + calorieLoss);
    }
}
```
## Collaborator
**Code reviewed by:** Paul Kainoa Thieben
- I added spaces between some of the lines since the comments made it look chunky and hard to read. Code runs fine tho :)
