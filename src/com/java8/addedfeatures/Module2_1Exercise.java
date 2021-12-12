package com.java8.addedfeatures;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Module2_1Exercise {
    /* Under this section we will apply the comic book class and the subclass in the previous section
    *We will use the non abstract class
     */
    public static void main(String[] args){
       // moreOnComicBook();
      //moreOnMarble1();
        //moreOnDc1();
        //currentTime();
    //   current2(1118829912l);

    }
    public static void  moreOnComicBook(){
        ComicBook comic1 = new ComicBook();
        MarbleComic marbleComic1 = new MarbleComic();
        MarbleComic marbleComic = (MarbleComic)comic1;//down casting
        //ComicBook comic = (ComicBook);
       // DcComic dcComic11 = (DcComic)comic1;//down casting
      // System.out.println(dcComic11.getSerialNumber());

    }
    public static void moreOnMarble1(){
        MarbleComic marble1 = new MarbleComic();
        marble1.getSerialNumber();
        marble1.setInitialAndId(MarbleComic.initial,MarbleComic.uniqueId);
        marble1.getSerialNumber();
        System.out.println(marble1.getInitial());
        System.out.println(MarbleComic.uniqueId);
        System.out.println(marble1.getSerialNumber());
        System.out.println(marble1.serialNumber);
        System.out.println(marble1.getSerialNumber());
       // System.out.println(marble1.setInitialAndId(marble1.getInitial(),marble1.getUniqueId()));




        ComicBook comic2 =(ComicBook) marble1;//upcasting
       // MarbleComic marbleComic = (MarbleComic)
        System.out.println(comic2.getSerialNumber());
       // System.out.println(comic2.getSerialNumber());
       // System.out.println(comic2.getSerialNumber());


    }
    public static void  moreOnDc1(){
        DcComic dc1 = new DcComic();
        ComicBook comicBook1 = (ComicBook)dc1;//up casting
        comicBook1.getSerialNumber();
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getClass());
        System.out.println(comicBook1.getSerialNumber());

    }
    public static void currentTime(){
        long ut1 = System.currentTimeMillis();
        System.out.println(ut1);
        Date now = new Date();
        long ut2 = now.getTime();
        System.out.println(ut2);
        SimpleDateFormat dateFormat =new SimpleDateFormat("MMM D,yyyy");
        String strDate= dateFormat.format(now);
        System.out.println("current time and date:" + strDate);
       // Date someDate = new GregorianCalendar(2020,Calendar.MONDAY,Calendar.);



    }
    public static void current2(long x){
        long epochTime1 = 819921912l;
        long epochTime2 =1118829912;
        long epochTime3 =1634846819;

       // System.out.println();
        Date d = new Date(x);//creating the date object
       // System.out.println(ut2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd,yyyy");//show day time format patterns
       String strDate= dateFormat.format(d);//use the simple date format.
        System.out.println(strDate);

    }


}
