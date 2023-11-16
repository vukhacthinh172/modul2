package bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FootballTeam team1 = new FootballTeam(1, "HN", 9, 10);
        FootballTeam team2 = new FootballTeam(2, "SG", 10, 7);
        FootballTeam team3 = new FootballTeam(3, "HP", 15, 7);
        FootballTeam team4 = new FootballTeam(4, "NT", 8, 15);
        FootballTeam team5 = new FootballTeam(5, "DN", 11, 11);
        List<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(team1);
        footballTeams.add(team2);
        footballTeams.add(team3);
        footballTeams.add(team4);
        footballTeams.add(team5);
        System.out.println("List chưa sắp xếp là : ");
        for (FootballTeam team : footballTeams
        ) {
            System.out.println(team);
        }
        System.out.println("List sắp xếp theo điểm số cao đến thấp là : ");
        bubbleSort(footballTeams, (o1, o2) -> o1.getScore() - o2.getScore());
        for (FootballTeam team : footballTeams
        ) {
            System.out.println(team);
        }
    }

    public static <T> void bubbleSort(List<T> list, Comparator<T> comparator) {
        boolean check = true;
        for (int i = 0; i < list.size() && check; i++) {
            check = false;
            for (int j = 0; j < list.size() - i -1; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    T t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                    check = true;
                }
            }
        }
    }
}