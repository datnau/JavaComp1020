import java.util.Arrays;
import java.util.Comparator;

public class HockeyTeam {
    private static final int MAX_TEAMS = 64;
    private static HockeyTeam[] teamList = new HockeyTeam[MAX_TEAMS];
    private static int numberOfTeams = 0;

    private String teamName;
    private int wins;
    private int losses;
    private int overtimeLosses;

    // Constructor
    public HockeyTeam(String teamName, int wins, int losses, int overtimeLosses) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.overtimeLosses = overtimeLosses;

        // Add the new HockeyTeam object to the list
        if (numberOfTeams < MAX_TEAMS) {
            teamList[numberOfTeams] = this;
            numberOfTeams++;
        } else {
            System.out.println("Cannot add more teams. Maximum capacity reached.");
        }
    }

    // Increment wins
    public void won() {
        wins++;
    }

    // Increment losses
    public void lost() {
        losses++;
    }

    // Increment overtimeLosses
    public void lostOvertime() {
        overtimeLosses++;
    }

    // Calculate total points
    public int points() {
        return wins * 2 + overtimeLosses;
    }

    // Override toString method for better readability
    @Override
    public String toString() {
        return String.format("%s(%d,%d,%d=%d)", teamName, wins, losses, overtimeLosses, points());
    }

    // Class method to list teams
    public static void listTeams() {
        System.out.println("List of Teams:");
        for (int i = 0; i < numberOfTeams; i++) {
            System.out.println(teamList[i]);
        }
    }

    // Class method to sort teams without using Comparable
    public static void sortTeams() {
        Arrays.sort(teamList, 0, numberOfTeams, Comparator.comparingInt(HockeyTeam::points).reversed());
    }
}
