package com.azizmalik.demo.Services.Implementations;
import com.azizmalik.demo.Services.iBluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements iBluePrinter {
    @Override
    public String print(){
        return "Blue Concrete Class";
    }
}
