package kozlyuk.structural.flyweight.lada;

public enum Color {

    CHERRY_RED(235, 64, 52),
    OIL_BLACK(3, 2, 2),
    MILITARY_GREEN(11, 41, 8),
    SNOW_WHITE(217, 217, 217),
    KASTRYULNIY_GREY(156, 156, 156);

    final Integer R;
    final Integer G;
    final Integer B;

    Color(Integer r, Integer g, Integer b) {
        R = r;
        G = g;
        B = b;
    }
}
