/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.*;

class DateTimeTest {

  /**
   * main() calls each of the test methods in turn (currently commented out). To run one test method
   * at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
    testNow();
    testCreate();
    testParse();
    testFormat();
  }

  /**
   * TASK: create current date, time, and date-time via now() and then print them.
   */
  public static void testNow() {
    // TODO date, time and date-time?
    LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println(time + "\n" + date + "\n" + dateTime + "\n");
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testCreate() {
    // TODO: create your birthday via of(). What day of the week were you born on?
    LocalDate birthDay = LocalDate.of(1993, 3, 31);
    // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
    // NOTE: ignore time-zone, just assume Eastern Time is the local time.
    LocalDate firstLunarLandingDate = LocalDate.of(1969, 07, 20);
    LocalTime firstLunarLandingTime = LocalTime.of(15, 18);
    LocalDateTime firstLunarLanding = LocalDateTime.of(firstLunarLandingDate,
        firstLunarLandingTime);
    System.out.println(firstLunarLanding);
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testParse() {
    // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
    LocalDate birthDay = LocalDate.parse("1993-03-31");
    System.out.println(birthDay);
    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");//?
    System.out.println(birthDay.format(formatter));
  }

  /**
   * TASK: create formatted display strings for the date below, in the specified formats.
   */
  public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);

    // TODO: 10/14/1066
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    System.out.println(hastings.format(formatter));
    // TODO: 14-10-1066
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println(hastings.format(formatter1));
    // OPTIONAL: October 14, 1066
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM, d, yyyy");
    System.out.println(hastings.format(formatter2));
  }
}