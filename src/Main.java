/* Lavet af Mikkel Sørensen
Mikk4211@edu.easj.dk
EASJ Næstved, DAT 1 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Double er et kommatal, så dette gør at arealet også vises hvis der er komma
        double area;

        // Disse tre linjer scanner for brugerens indtastning
        Scanner input = new Scanner(System.in); //Scanner bruges til at vi kan skrive vores eget tal ind som radius
        System.out.print("Enter radius here");
        double radius = input.nextDouble();

        //Her udregnes selve arealet
        area = radius * radius * 3.14;

       // Denne linje viser resultatet af brugerens indtastning
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
