/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_fitnesstracker;

/**
 *
 * @author Stefan
 */
import java.util.Scanner;
public class Lab_FitnessTracker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        RunningWorkout r = new RunningWorkout();
        System.out.print("Enter workout type: ");
        r.type = keyboard.nextLine();
        System.out.print("Enter duration (minutes): ");
        r.duration = keyboard.nextInt();
        System.out.print("Enter distance (km): ");
        r.distance = keyboard.nextDouble();
        System.out.println();
        r.showWorkout();
        r.showDetails();
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
        double calorieLoss = distance * 60;
        System.out.println("Distance: " + distance + "\nCalories burned: " + calorieLoss);
    }
}