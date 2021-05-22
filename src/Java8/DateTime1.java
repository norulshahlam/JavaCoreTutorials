package Java8;

/*
how to get current time . date of specific zone by specifying the zone name
how to get all the list of diff zones
understand what is machine-readable and human-readable datetime
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime1 {

  public static void main(String[] args) {
    // fetching all zone id
    for (String s : ZoneId.getAvailableZoneIds())
      System.out.println(s);

    // getting time of a specific zone(human-readable)
    LocalDate d = LocalDate.now(ZoneId.of(("Asia/Singapore")));
    LocalTime t = LocalTime.now(ZoneId.of("Asia/Singapore"));
    System.out.println("Time: " + t + ". Date: " + d);

    // getting time of a specific zone(machine-readable)
    Instant i = Instant.now();
    System.out.println(i);

  }

}
