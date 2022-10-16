import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;

    int choice;
    while (true) {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");

      choice = input.nextInt();

      switch (choice) {

        case 1:
          System.out.println("$93,345 average salary in South Florida!");
          break;

        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;

        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;

        case 4:
          System.out.println("Current Students:");

          FileReader reader = new FileReader("names.txt");
          Scanner fileScanner = new Scanner(reader);

          while (fileScanner.hasNextLine()) {
            String[] curLine = fileScanner.nextLine().split("  ");

            for (String s : curLine) {
              System.out.println(s);
            }
          }
          break;

        case 5:
          System.exit(0);
          break;

        default:
          System.out.println("Select another number");
          break;
      }
    }
  }
}