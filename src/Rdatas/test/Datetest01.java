package Rdatas.test;

import java.util.Date;

public class Datetest01 {
    public static void main(String[] args) {
        Date date = new Date(1774031870146L); // long 10000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
