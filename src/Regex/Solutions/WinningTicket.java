import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("([,\\s]+)");
        Pattern symbols = Pattern.compile("[@#$^]");

        for (int i = 0; i < input.length; i++) {
            String currentTicket = input[i];
            if (currentTicket.length() == 20) {
                String sub1 = currentTicket.substring(0, 10);
                String sub2 = currentTicket.substring(10, 20);
                String leftMatch = "s";
                String rightMatch = "d";

                Pattern pattern = Pattern.compile("[\\@]{6,}|[\\$]{6,}|[\\#]{6,}|[\\^]{6,}");
                Matcher leftM = pattern.matcher(sub1);
                Matcher rightM = pattern.matcher(sub2);

                if (leftM.find()) {
                    leftMatch = leftM.group();
                }
                if (rightM.find()) {
                    rightMatch = rightM.group();
                }

                if (leftMatch.substring(0, 1).equals(rightMatch.substring(0, 1))) {
                    int ticketCnt = Math.min(leftMatch.length(), rightMatch.length());
                    String symbol = leftMatch.substring(0, 1);
                    if (ticketCnt == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", currentTicket, ticketCnt, symbol);
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", currentTicket, ticketCnt, symbol);
                    }

                } else {
                    System.out.printf("ticket \"%s\" - no match%n", currentTicket);
                }

            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
