package com.company;

import java.util.*;


public class DataMerger 
{

    public List<DateRange> mergeDates(List<DateRange> dateRanges) 
    {
        List<DateRange> dateRange = dateRanges;
        List<DateRange> MergedRange = new ArrayList<>();
        Date start_date= null, end_date = null;
        Boolean newrange = true;

        Map<Date,DateRange> DateMap = new HashMap<>();


        for (int i = 0; i <= dateRange.size(); i++) {

               if (newrange == true)
               {
            	   start_date = dateRange.get(i).getStartDate();
               }
               newrange = false;
                 if (i < dateRange.size() - 1 ) 
                 {
                     if (dateRange.get(i).getEndDate().before(dateRange.get(i + 1).getStartDate())) 
                     {
                         end_date = dateRange.get(i).getEndDate();
                         MergedRange.add(new DateRange(start_date, end_date));
                         newrange = true;
                     }
                 }
  //*** To handle list record
               if (i == dateRange.size() - 1)
            {
                end_date = dateRange.get(i).getEndDate();
                MergedRange.add(new DateRange(start_date, end_date));

            }


        }
        System.out.println(MergedRange);

        return MergedRange;

    }

}




