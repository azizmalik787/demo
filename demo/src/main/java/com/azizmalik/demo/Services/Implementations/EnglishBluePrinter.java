package com.azizmalik.demo.Services.Implementations;
import com.azizmalik.demo.Services.iBluePrinter;

public class EnglishBluePrinter implements iBluePrinter {
    @Override
    public String print(){
        return "Blue Concrete Class";
    }
}
