package org.vashonsd;


import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Holiday chrismas = new Holiday(12, 31);
        System.out.println(Holiday.isToday);
    }
}
//localDateTime now = LocalDateTime.now();
//now.getMonthValue(); // ==4
//now.getDayofMonth(); // ==25
