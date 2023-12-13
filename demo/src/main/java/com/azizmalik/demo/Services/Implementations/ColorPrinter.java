package com.azizmalik.demo.Services.Implementations;
import com.azizmalik.demo.Services.iColorPrinter;
import com.azizmalik.demo.Services.iRedPrinter;
import com.azizmalik.demo.Services.iBluePrinter;
import com.azizmalik.demo.Services.iGreenPrinter;

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
