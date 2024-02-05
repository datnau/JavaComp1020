public class TestHockeyTeam_2 {
    public static void main(String[] args) {
        // Creating initial teams
        HockeyTeam team1 = new HockeyTeam("Winnipeg", 22, 14, 8);
        HockeyTeam team2 = new HockeyTeam("Chicago", 28, 13, 2);
        HockeyTeam team3 = new HockeyTeam("Colorado", 18, 17, 8);
        HockeyTeam team4 = new HockeyTeam("St. Louis", 27, 13, 3);
        HockeyTeam team5 = new HockeyTeam("Dallas", 19, 16, 7);
        HockeyTeam team6 = new HockeyTeam("Minnesota", 18, 19, 5);
        HockeyTeam team7 = new HockeyTeam("Nashville", 29, 9, 4);

        // Printing initial teams
        System.out.println("Initial teams:");
        HockeyTeam.listTeams();

        // Simulating changes (you should adjust these according to the requirements)
        team1.won();
        team2.lost();
        team3.lostOvertime();
        team4.won();
        team5.lost();
        team6.lost();
        team7.lostOvertime();

        // Sorting teams and printing
        HockeyTeam.sortTeams();
        System.out.println("\nSorted teams:");
        HockeyTeam.listTeams();
    }
}
