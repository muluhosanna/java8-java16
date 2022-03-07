package com.java8.addedfeatures;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Module2_1Exercise {
    /* Under this section we will apply the comic book class and the subclass in the previous section
     *We will use the non abstract class
     */
    public static void main(String[] args) throws IOException {
        // moreOnComicBook();
        //moreOnMarble1();
        //moreOnDc1();
        //currentTime();
        //   current2(1118829912l);
        examplesOnWrapper();
        // examplesOnRectangle();
        // examplesOnGeneric();
       // testifElse();


    }

    public static void examplesOnGeneric() throws UnsupportedEncodingException {
        Mylist sampleList = new Mylist();
        //sampleList.testGeneric();
        // sampleList.listOdd();
        // System.out.println(sampleList.listOdd());
        //sampleList.testUnicode();
        //  sampleList.threeArray();
        //sampleList.array2();
        //sampleList.arraywrapping();
        //sampleList.testArray();
        //sampleList.stringTest();
        sampleList.removeDup("aaaaaaa");
        System.out.println(sampleList.removeDup("aaaaaa"));
        System.out.println(sampleList.removeDup("abababab"));
        System.out.println(sampleList.removeDup("abcd"));


    }

    public static void examplesOnRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.mapFunction();

    }

    public static void examplesOnWrapper() throws IOException {
        JavaWrapperDemo demoWrapper = new JavaWrapperDemo("mulu", "tsegaw", 123, 45);

        //demoWrapper.testWrapper();
        //demoWrapper.arraymath();
        //System.out.println(demoWrapper);
        // JavaWrapperDemo javaWrapperDemo1 = new JavaWrapperDemo("mulu", "tekeste", 800, 45);
        // System.out.println(demoWrapper == javaWrapperDemo1);
        // System.out.println(demoWrapper.equals(demoWrapper));
        // System.out.println(demoWrapper == demoWrapper);
        // JavaWrapperDemo.getCount();
        // System.out.println(JavaWrapperDemo.getCount());
        // demoWrapper.arrayTostring();
        // demoWrapper.testCross();

        //   demoWrapper.arraymath();
        //demoWrapper.isAnagramSort("hello","Hello");
        //demoWrapper.testSubstring();
        demoWrapper.testArraylist();


    }

    public static void moreOnComicBook() {
        ComicBook comic1 = new ComicBook();
        MarbleComic marbleComic1 = new MarbleComic();
        MarbleComic marbleComic = (MarbleComic) comic1;//down casting
        //ComicBook comic = (ComicBook);
        // DcComic dcComic11 = (DcComic)comic1;//down casting
        // System.out.println(dcComic11.getSerialNumber());

    }

    public static void moreOnMarble1() {
        MarbleComic marble1 = new MarbleComic();
        marble1.getSerialNumber();
        marble1.setInitialAndId(MarbleComic.initial, MarbleComic.uniqueId);
        marble1.getSerialNumber();
        System.out.println(marble1.getInitial());
        System.out.println(MarbleComic.uniqueId);
        System.out.println(marble1.getSerialNumber());
        System.out.println(marble1.serialNumber);
        System.out.println(marble1.getSerialNumber());
        // System.out.println(marble1.setInitialAndId(marble1.getInitial(),marble1.getUniqueId()));


        ComicBook comic2 = (ComicBook) marble1;//upcasting
        // MarbleComic marbleComic = (MarbleComic)
        System.out.println(comic2.getSerialNumber());
        // System.out.println(comic2.getSerialNumber());
        // System.out.println(comic2.getSerialNumber());


    }

    public static void examplesOnSerialization() throws IOException, ClassNotFoundException {
        Rectangle rectangle1 = new Rectangle(5, 8);
        rectangle1.testSerial();
    }

    public static void moreOnDc1() {
        DcComic dc1 = new DcComic();
        ComicBook comicBook1 = (ComicBook) dc1;//up casting
        comicBook1.getSerialNumber();
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getSerialNumber());
        System.out.println(comicBook1.getClass());
        System.out.println(comicBook1.getSerialNumber());

    }

    public static void currentTime() {
        long ut1 = System.currentTimeMillis();
        System.out.println(ut1);
        Date now = new Date();
        long ut2 = now.getTime();
        System.out.println(ut2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM D,yyyy");
        String strDate = dateFormat.format(now);
        System.out.println("current time and date:" + strDate);
        // Date someDate = new GregorianCalendar(2020,Calendar.MONDAY,Calendar.);


    }

    public static void current2(long x) {
        long epochTime1 = 819921912l;
        long epochTime2 = 1118829912;
        long epochTime3 = 1634846819;

        // System.out.println();
        Date d = new Date(x);//creating the date object
        // System.out.println(ut2);
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd,yyyy");//show day time format patterns
        String strDate = dateFormat.format(d);//use the simple date format.
        System.out.println(strDate);

    }

    public static void testifElse() {
        String s = "brave";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            reverse += s.charAt(i);


        }
        //System.out.println(reverse);
        boolean palendrom = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != reverse.charAt(i)) {
                palendrom = false;
            }


        }
        if (palendrom) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

