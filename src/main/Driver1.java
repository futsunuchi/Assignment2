package main;

import Air.Aircraft;
import Land.CityBus;
import Land.Metro;
import Land.Tram;
import Transportation.PublicTransportation;
import Water.Ferry;



public class Driver1
{
    /**
     * This method takes an array of PublicTransportation and returns a copy of this array
     * @param cityBus PublicTransportation
     * @return PublicTransportation copy
     */
    /*
   Using this method to copy the array will produce an incorrect result as this method won't return an exact copy of the
   objects on the initial array.
   In fact, all the objects in the array will be cast into PublicTransportation and will not longer belong the their original
   class. Which explains why when printing the results of the copy array it prints all objects as belonging to
   the class PublicTransportation
     */
    public static PublicTransportation[] CopyCityBus(PublicTransportation[] cityBus)
    {
        PublicTransportation[] copy=new PublicTransportation[cityBus.length];
        for (int i=0;i<cityBus.length;i++)
        {
           copy[i]=new PublicTransportation(cityBus[i]);
        }
        return copy;
    }
    public static void main(String[] args)
    {
        PublicTransportation[] first_array=new PublicTransportation[12];
        PublicTransportation[] copy=new PublicTransportation[first_array.length];
        for (int i=0;i<12;i++)
        {
            System.out.println("Creating object " + (i+1));

            switch (i%6)
            {
                case 0:
                    first_array[i]=new PublicTransportation();
                    break;
                case 1:
                    first_array[i]=new Metro();
                    break;
                case 2:
                    first_array[i]=new CityBus();
                    break;
                case 3:
                    first_array[i]=new Tram();
                    break;
                case 4:
                    first_array[i]=new Ferry();
                    break;
                case 5:
                    first_array[i]=new Aircraft();
                    break;
            }
            System.out.println("This object is " + first_array[i].getClass().toString().substring(6));
        }
        System.out.println("Copying the array");
        copy=CopyCityBus(first_array);
        System.out.println("printing the copied array");
        for (int i=0;i<copy.length;i++)
        {
            System.out.println(copy[i].toString());
        }
    }
}
