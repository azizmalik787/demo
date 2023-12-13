package Services.Implementations;
import Services.iColorPrinter;
import Services.iRedPrinter;
import Services.iBluePrinter;
import Services.iGreenPrinter;

public class ColorPrinter implements iColorPrinter {
    private iRedPrinter red;
    private iBluePrinter blue;
    private iGreenPrinter green;

    public ColorPrinter(iRedPrinter red, iBluePrinter blue, iGreenPrinter green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    @Override
    public String print(){
        return red.print()+", "+blue.print()+", "+green.print();
    }
}
