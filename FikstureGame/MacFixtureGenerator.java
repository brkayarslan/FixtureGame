package FikstureGame;

import java.util.ArrayList;
import java.util.List;

public class MacFixtureGenerator {
    private List<String> teams;
    private List<String> fixtures;

    public MacFixtureGenerator(List<String> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public List<String> generateFixture() {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalRounds = (teams.size() - 1)*2;
        int matchesPerRound = teams.size() / 2;

        for (int round = 0; round < totalRounds; round++) {
            for (int match = 0; match < matchesPerRound; match++) {
                int homeTeamIndex = (round + match) % (teams.size() - 1);
                int awayTeamIndex = (teams.size() - 1 - match + round) % (teams.size() - 1);

                if (match == 0) {
                    awayTeamIndex = teams.size() - 1;
                }
                String homeTeam;
                String awayTeam;
                if(round<totalRounds/2){
                    homeTeam = teams.get(homeTeamIndex);
                    awayTeam = teams.get(awayTeamIndex);
                }
                else {
                    homeTeam = teams.get(awayTeamIndex);
                    awayTeam = teams.get(homeTeamIndex);
                }
                String fixture = homeTeam + " vs " + awayTeam;
                fixtures.add(fixture);
            }
        }

        return fixtures;
    }
}
