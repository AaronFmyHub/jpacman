package nl.tudelft.jpacman.level;
import org.junit.jupiter.api.Test;
import nl.tudelft.jpacman.sprite.PacManSprites;
import static org.assertj.core.api.Assertions.assertThat;
import nl.tudelft.jpacman.board.Unit;

public class PlayerTest {
    PacManSprites pacSp = new PacManSprites();
    PlayerFactory factory = new PlayerFactory(pacSp);
    Player player = factory.createPacMan();

    @Test
    void testIsAlive() {
        assertThat(player.isAlive()).isEqualTo(true);
    }

    @Test
    void testGetKiller() {

        if (player.isAlive())
            assertThat(player.getKiller()).isNull();
        else
            assertThat(player.getKiller() instanceof Unit).isEqualTo(true);
    }
}
