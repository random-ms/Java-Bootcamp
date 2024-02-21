import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {

    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }
        

    public void begin(Team home, Team away) {
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        System.out.println
        (
        "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "." + 
        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
        "\n - Starting lineup for the home team: at point guard, " + home.getPlayer("POINT_GUARD") + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, " + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, " + home.getPlayer("CENTER") + ".\n" +
        "\n - Starting lineup for the visiting team: at point guard, " + away.getPlayer("POINT_GUARD") + "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, " + away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD") + "; and at center, " + away.getPlayer("CENTER") + "."
        );
    }

}