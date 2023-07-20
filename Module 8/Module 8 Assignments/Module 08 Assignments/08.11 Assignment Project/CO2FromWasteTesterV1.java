/**
 * @purpose:The purpose of this program is to calculate the total emission, the reduction, and the net reduction of emission from a household based on the number of people in a household and what they recycle. 
 *
 * @author Nina Nielsen
 * @version 4/11/2018
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTesterV1
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
       households.add(new CO2FromWasteV1(3,true,false,false,true));
       households.add(new CO2FromWasteV1(5,true,true,false,true));
       households.add(new CO2FromWasteV1(2,true,false,false,false));
       households.add(new CO2FromWasteV1(2,false,true,false,false));
       households.add(new CO2FromWasteV1(4,true,true,false,false));
       households.add(new CO2FromWasteV1(3,false,true,false,true));
       households.add(new CO2FromWasteV1(1,true,true,true,true));
           
       CO2FromWasteV1 dataRecord;  
       for(int i = 0; i < households.size(); i ++)
       {
           dataRecord = households.get(i);
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       

       for(int i = 0; i < households.size(); i ++)
       {
           dataRecord = households.get(i);
           System.out.printf("%4d %8d %10b %11b %9b %9b %12.2f %13.2f %13.2f %n",i, dataRecord.getNumPeople(), dataRecord.getPaper(),dataRecord.getPlastic(),dataRecord.getGlass(),dataRecord.getCans(),dataRecord.getEmissions(),dataRecord.getReduction(),dataRecord.getNetEmissions());
       }
   }
}


