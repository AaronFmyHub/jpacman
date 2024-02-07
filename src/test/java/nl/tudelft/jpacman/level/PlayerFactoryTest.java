package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerFactoryTest {
    PacManSprites pacSp = new PacManSprites();
    PlayerFactory factory = new PlayerFactory(pacSp);
    Player player = factory.createPacMan();

    @Test
    void testCreatePacMan() {
        assertThat(player.getScore()).isEqualTo(0);
        assertThat(player.isAlive()).isEqualTo(true);

        assertThat(player.getSprite()).isExactlyInstanceOf(factory.getSprites().getPacManDeathAnimation().getClass());

        assertThat(player.getSprite()).isInstanceOf(AnimatedSprite.class);
    }
}
