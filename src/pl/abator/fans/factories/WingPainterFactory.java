package pl.abator.fans.factories;

import pl.abator.fans.implementations.WingPainterAsteriskTriangle;
import pl.abator.fans.enums.WingType;
import pl.abator.fans.interfaces.WingPainter;

class WingPainterFactory {

    static WingPainter getWingPainter(WingType type) {
        if (type == WingType.AsteriskTriangle) {
            return new WingPainterAsteriskTriangle();
        }
        throw new IllegalArgumentException("Illegal WingType: " + type);
    }
}
