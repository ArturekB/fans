package pl.abator.fans.factories;

import pl.abator.fans.implementations.WingedFanPrinterQuadrupleSymmetry;
import pl.abator.fans.enums.FanPrinterType;
import pl.abator.fans.enums.WingType;
import pl.abator.fans.interfaces.CharMap;
import pl.abator.fans.interfaces.WingPainter;
import pl.abator.fans.interfaces.WingedFanPrinter;

public class WingedFanPrinterFactory {

    public static WingedFanPrinter getWingedFanPrinter(FanPrinterType type) {
        WingPainter painter = WingPainterFactory.getWingPainter(WingType.AsteriskTriangle);
        CharMap wingMap = painter.getWingMap();
        if (type == FanPrinterType.QuadrupleSymmetry) {
            return new WingedFanPrinterQuadrupleSymmetry(wingMap);
        }
        throw new IllegalArgumentException("Illegal FanPrinterType: " + type);
    }
}
