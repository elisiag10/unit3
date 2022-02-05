# unit3
JavaClass

This is my Java code for my Java class.
Chapter 3 



a. Carly's Catering provides meals for parties and special events. In Chapter 2, you wrote an application that prompts the user for the number of guests attending an event, displays the company motto with a border, and then displays the price of the event and whether the event is a large one. Now modify the program so that the main() method contains only three executable statements that each call a method as follows:

The first executable statement calls a public static int method that prompts the user for the number of guests and returns the value to the main() method.
The second executable statement calls a public static void method that displays the company motto with the border.
The last executable statement passes the number of guests to a public static void method that computes the price of the event, displays the price, and displays whether the event is a large event.
Save the file as CarlysEventPriceWithMethods.java.

b. Create a class to hold Event data for Carly's Catering. The class contains:

Two public final static fields that hold the price per guest ($35) and the cutoff value for a large event (50 guests)
Three private fields that hold an event number, number of guests for the event, and the price. The event number is stored as a String because Carly plans to assign event numbers such as M312.
Two public set methods that set the event number (setEventNumber()) and the number of guests (setGuests()). The price does not have a set method because the setGuests() method will calculate the price as the number of guests multiplied by the price per guest every time the number of guests is set.
Three public get methods that return the values in the three nonstatic fields.
Save the file as Event.java.

c. Use the CarlysEventPriceWithMethods class you created in Step 1a as a starting point for a program that demonstrates the Event class you created in Step 1b, but make the following changes:

You already have a method that gets a number of guests from a user; now add a method that gets an event number. The main() method should declare an Event object, call the two data entry methods, and use their returned values to set the fields in the Event object.
Call the method from the CarlysEventPriceWithMethods class that displays the company motto with the border. The method is accessible because it is public, but you must fully qualify the name because it is in another class.
Revise the method that displays the event details so that it accepts the newly created Event object. The method should display the event number, and it should still display the number of guests, the price per guest, the total price, and whether the event is a large event.
Save the program as EventDemo.java.
