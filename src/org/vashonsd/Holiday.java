package org.vashonsd;

import java.time.LocalDateTime;

public class Holiday {
    int month;
    int day;
    public Holiday(int month, int day) {
        this.month = month;
        this.day = day;
    }
    public boolean isToday() {
        LocalDateTime now = LocalDateTime.now();
      return month == now.getMonthValue();
      return day == now.getDayOfMonth();
    }

}
