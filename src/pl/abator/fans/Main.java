package pl.abator.fans;

import pl.abator.fans.enums.FanDirection;
import pl.abator.fans.enums.FanPrinterType;
import pl.abator.fans.factories.WingedFanPrinterFactory;
import pl.abator.fans.interfaces.WingedFanPrinter;

public class Main {

    public static void main(String[] args) throws Exception {
        WingedFanPrinter fanPrinter = WingedFanPrinterFactory
                .getWingedFanPrinter(FanPrinterType.QuadrupleSymmetry);
        fanPrinter.printFan(3, FanDirection.Clockwise);
    }
}




