package main;

import Transportation.*;
import Land.*;
import Air.*;
import Water.*;
import java.util.Scanner;

/**
 * <p>This Class contains the main method that will test the other created classes.</p>
 * @author <p>juan Sebastian Hoyos <br/> 40087920</p>
 * @author <p>Trigran Karapetyan <br/> </p>
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        //Creating objects of each class using the parametrized constructors
        PublicTransportation pt=new PublicTransportation(3.25,20);
        Ferry f=new Ferry(5.00,1,2000,"Aquaman");
        Metro m=new Metro(10.50,10,35097,1998,"Lucien-L\'allier","George",15,"Montreal");
        Tram t=new Tram(10.50,10,4500,2005,"Dorval","Justin",60);
        CityBus c=new CityBus(4.25,6,4398,2000,"Cote-vertu","Freddy");
        PublicTransportation cheapest,expensive;
        int cheapest_index,expensive_index;

        //Using the toString method from each object to verify the functionality of the toString method and the constructors
        System.out.println("List of ferry, metro, tram,city buss in order:\n " + pt.toString() + "\n\t" +
               f.toString() +"\n\t"+m.toString()+ "\n\t" +t.toString() + "\n\t" +c.toString());

        //Using and if statement to verify the functionality of the equals methods
        if (m.equals(t))
            System.out.println("metro and tram are the same");
        else System.out.println("metro and tram are not the same");

        //Creating an array of 15 public transportation from the 6 different subclasses
        PublicTransportation[] city_transport=new PublicTransportation[15];

        System.out.println("We will begin created 15 different objects with parametrized constructors");
        for (int i=0;i<15;i++)
        {
            System.out.println("Creating object " + (i+1));
            double price;
            int num_stops,op_debut,num_vehicles,speed,built_year;
            long route_number;
            String line_name,temp,driver,city,ship_name;

           //System.out.print("Please enter the price: ");
            //price=input.nextDouble();
            //System.out.print("Please enter the number of stops: ");
            //num_stops=input.nextInt();
            switch (i%6)
            {
                case 0:
                    System.out.print("Please enter the price: "); //the following three lines would usually go before the switch but its after for testing purposes
                    price=input.nextDouble();
                    System.out.print("Please enter the number of stops: ");
                    num_stops=input.nextInt();                      //from line 57-60 should go before the switch case
                    city_transport[i]=new PublicTransportation(price,num_stops);
                    break;
                case 1: // I would usually let the user input the values but this makes testing way too long
                   /* System.out.print("Please enter the route number: ");
                    route_number=input.nextLong();
                    System.out.print("Please enter the year of debut of operations: ");
                    op_debut=input.nextInt();
                    System.out.print("Please enter the name of the line: ");
                    temp=input.nextLine();
                    line_name=input.nextLine();
                    System.out.print("Please enter the name of the driver: ");
                    driver=input.nextLine();
                    System.out.print("Please enter the name of the city: ");
                    city=input.nextLine();
                    System.out.print("Please enter the num of vehicles: ");
                    num_vehicles=input.nextInt(); */
                    city_transport[i]=new Metro();//price,num_stops,route_number,op_debut,line_name,driver,num_vehicles,city);
                    break;
                case 2: // I would usually let the user input the values but this makes testing way too long
                   /* System.out.print("Please enter the route number: ");
                    route_number=input.nextLong();
                    System.out.print("Please enter the year of debut of operations: ");
                    op_debut=input.nextInt();
                    System.out.print("Please enter the name of the line: ");
                    temp=input.nextLine();
                    line_name=input.nextLine();
                    System.out.print("Please enter the name of the driver: ");
                    driver=input.nextLine(); */
                    city_transport[i]=new CityBus();//price,num_stops,route_number,op_debut,line_name,driver);
                    break;
                case 3: // I would usually let the user input the values but this makes testing way too long
                   /* System.out.print("Please enter the route number: ");
                    route_number=input.nextLong();
                    System.out.print("Please enter the year of debut of operations: ");
                    op_debut=input.nextInt();
                    System.out.print("Please enter the name of the line: ");
                    temp=input.nextLine();
                    line_name=input.nextLine();
                    System.out.print("Please enter the name of the driver: ");
                    driver=input.nextLine();
                    System.out.print("Please enter the max speed: ");
                    speed = input.nextInt(); */
                    city_transport[i]=new Tram();//price,num_stops,route_number,op_debut,line_name,driver,speed);
                    break;
                case 4:
                    System.out.print("Please enter the price: "); //the following three lines would usually go before the switch but its after for testing purposes
                    price=input.nextDouble();
                    System.out.print("Please enter the number of stops: ");
                    num_stops=input.nextInt();                      // from line 106-109 should go before the switch case
                    System.out.print("Please enter the year the ship was built: ");
                    built_year=input.nextInt();
                    System.out.print("Please enter the ship name: ");
                    temp=input.nextLine();
                    ship_name=input.nextLine();
                    city_transport[i]=new Ferry(price,num_stops,built_year,ship_name);
                    break;
                case 5:
                    city_transport[i]=new Aircraft();
                    break;
            }
            System.out.println("This object is " + city_transport[i].getClass().toString().substring(6));

        }

        // !!!!!!!!!!!This is only working if all values are different but if many objects have the same price---------------------------------
        //!!!!!!!!!!!!!it doesn't know which one is the cheapest/expensive so it just takes the last one-----------------------------------------

        for (int i=0;i<14;i++)
        {
            //Looking for the cheapest and most expensive transport
            if (city_transport[i].getPrice()>city_transport[i+1].getPrice())
            {
                cheapest=city_transport[i+1]; // The same address not a copy of the object
                expensive=city_transport[i];
                cheapest_index=(i+1);
                expensive_index=i;
            }
            else
            {
                expensive=city_transport[i+1];
                cheapest=city_transport[i];
                cheapest_index=i;
                expensive_index=(i+1);
            }
            if (i==13)
            {
                System.out.println("cheapest is " + cheapest.toString() + "its index is: " + cheapest_index + "\nThe most expensive is " + expensive.toString()
                + " and its index is: " + expensive_index);
            }
        }
    }
}
