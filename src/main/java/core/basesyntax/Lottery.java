package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX = 100;

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX) + 1, colorSupplier.getRandomColor());
    }
}
