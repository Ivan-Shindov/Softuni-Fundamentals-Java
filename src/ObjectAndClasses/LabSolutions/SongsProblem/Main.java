package SongsProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Songs> listOfSongs = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];
            Songs song = new Songs();
            song.setTypeList(type);
            song.setSongName(name);
            song.setTime(time);
            listOfSongs.add(song);
        }
        String line = scanner.nextLine();
        printResult(listOfSongs, line);
    }

    private static void printResult(List<Songs> listOfSongs, String line) {
        if (line.equals("all")) {
            for (Songs songs : listOfSongs) {
                System.out.println(songs.getSongName());
            }
        } else {
            for (Songs songs : listOfSongs) {
                if (songs.getTypeList().equals(line)) {
                    System.out.println(songs.getSongName());
                }
            }
        }
        
    }
}
