/*You are given a list of airline tickets where tickets[i] = [fromi, toi] represent the departure and the arrival airports of one flight.
 Reconstruct the itinerary in order and return it.*/
 import java.util.*;
 public class ReconstructItinerary
 {
    //function to return the start of the itinerary
    public static String getStart(HashMap<String,String> tick)
    {
        HashMap<String, String> revmap = new HashMap<>();
        for(String key: tick.keySet())
        {
            //key-> key of tick  and val-> tick.get(key)
            revmap.put(tick.get(key),key);//to create reverse map
        }
        for(String key: tick.keySet())
        {
            if(!revmap.containsKey(key))
                return key;
        }
        return null;
    }
    public static void main(String[] args)
    {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getStart(tickets);
        while(tickets.containsKey(start))
        {
            System.out.print(start+"->");
            start=tickets.get(start);//getting destination of start which will act as new start
        }
        System.out.println(start);
        //O/P: Mumbai->Delhi->Goa->Chennai->Bengaluru
    }
}
 