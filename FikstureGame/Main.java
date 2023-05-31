package FikstureGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        MacFixtureGenerator fixtureGenerator = new MacFixtureGenerator(teams);
        List<String> fixtures = fixtureGenerator.generateFixture();

        int round = 3;
        for (String fixture : fixtures) {
            if(round%3 == 0 ){
                System.out.println(round/3+". Hafta");
            }
            System.out.println(fixture);
            round++;
        }

    }
}
