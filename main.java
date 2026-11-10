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
