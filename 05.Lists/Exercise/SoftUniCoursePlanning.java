import java.util.ArrayList;
import java.util.Scanner;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        ArrayList<String> schedule = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            schedule.add(input[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            String  indication = tokens[0] + ":";
            String lessonTitle = "";
            switch (indication) {
                case "Add:":
                    lessonTitle = tokens[1];
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert:":
                    lessonTitle = tokens[1];
                    int index = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index < schedule.size()) {
                        if (!schedule.contains(lessonTitle)) {
                            schedule.add(index,lessonTitle);
                        }
                    } else {
                        break;
                    }
                    break;
                case "Remove:":
                    lessonTitle = tokens[1];
                    if (schedule.contains(lessonTitle)) {
                        schedule.remove(lessonTitle);
                    }
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle + "-Exercise")) {
                        int indexOfLessonTitle = schedule.indexOf(lessonTitle);
                        schedule.remove(lessonTitle + "-Exercise");
                        schedule.remove(indexOfLessonTitle);
                    }
                    break;
                case "Swap:":
                    String firstLessonTitle = tokens[1];
                    String secondLessonTitle = tokens[2];
                    if (schedule.contains(firstLessonTitle) && schedule.contains(secondLessonTitle)) {
                        int firstLessonIndex = schedule.indexOf(firstLessonTitle);
                        int secondLessonIndex = schedule.indexOf(secondLessonTitle);
                        String temporary = secondLessonTitle;
                        schedule.set(secondLessonIndex,firstLessonTitle);
                        schedule.set(firstLessonIndex,temporary);
                        if (schedule.contains(firstLessonTitle + "-Exercise")
                                && schedule.contains(secondLessonTitle + "-Exercise")) {
                            int firstLessonIndexEx = schedule.indexOf(firstLessonTitle + "-Exercise");
                            int secondLessonIndexEx = schedule.indexOf(secondLessonTitle + "-Exercise");
                            String interim = secondLessonTitle + "-Exercise";
                            schedule.set(secondLessonIndexEx,firstLessonTitle + "-Exercise");
                            schedule.set(firstLessonIndexEx,interim);
                        } else if (schedule.contains(firstLessonTitle)
                                && schedule.contains(secondLessonTitle + "-Exercise")) {
                            int indexator = schedule.indexOf(secondLessonTitle);
                            int indexatorOfExercise = schedule.indexOf(secondLessonTitle + "-Exercise");
                            schedule.add(indexator + 1,secondLessonTitle + "-Exercise");
                            schedule.remove(indexatorOfExercise + 1);

                        } else if (schedule.contains(firstLessonTitle + "-Exercise")
                                && schedule.contains(secondLessonTitle)) {
                            int indexator = schedule.indexOf(firstLessonTitle);
                            int indexatorOfExercise = schedule.indexOf(firstLessonTitle + "-Exercise");
                            schedule.add(indexator + 1,firstLessonTitle + "-Exercise");
                            schedule.remove(indexatorOfExercise + 1);
                        }
                    } else {
                        break;
                    }
                    break;
                case "Exercise:":
                    lessonTitle = tokens[1];

                    if (schedule.contains(lessonTitle) && !schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.add(schedule.indexOf(lessonTitle) +1,lessonTitle + "-Exercise");
                    } else if (!schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }

                    break;
            }

            command = scanner.nextLine();
        }
        int counter = 1;
        for (String items : schedule) {
            System.out.printf("%d.%s%n",counter,items);
            counter++;
        }
    }
}