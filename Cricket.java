class Cricket {

    String team;
    String captain;
    int players;
    String format;
    int overs;
    String ground;
    boolean isInternational;
    int score;
    String country;
    String result;

    Cricket(String team, String captain, int players, String format,
            int overs, String ground, boolean isInternational,
            int score, String country, String result) {

        this.team = team;
        this.captain = captain;
        this.players = players;
        this.format = format;
        this.overs = overs;
        this.ground = ground;
        this.isInternational = isInternational;
        this.score = score;
        this.country = country;
        this.result = result;
    }

    void display() {
        System.out.println("Team: " + team);
        System.out.println("Captain: " + captain);
        System.out.println("Players: " + players);
        System.out.println("Format: " + format);
        System.out.println("Overs: " + overs);
        System.out.println("Ground: " + ground);
        System.out.println("International: " + isInternational);
        System.out.println("Score: " + score);
        System.out.println("Country: " + country);
        System.out.println("Result: " + result);
        
    }
}