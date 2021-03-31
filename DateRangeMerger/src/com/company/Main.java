package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
      List<DateRange> listDate = new ArrayList<>();

        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("30/01/2014")));
        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2013"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("05/01/2014")));
        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("15/01/2014"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("15/02/2014")));
        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2014"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("15/04/2014")));
        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("10/04/2014"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2014")));
        listDate.add(new DateRange
                (new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2014"),
                        new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2014")));


         System.out.println(listDate);
         DataMerger dm = new DataMerger();
         System.out.println(dm.mergeDates(listDate));
    }
}
