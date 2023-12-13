package com.azizmalik.demo.config;

import Services.Implementations.*;
import Services.iBluePrinter;
import Services.iColorPrinter;
import Services.iRedPrinter;
import Services.iGreenPrinter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public iBluePrinter BluePrinter(){
        return new EnglishBluePrinter();
    }
    @Bean
    public iRedPrinter RedPrinter(){
        return new EnglishRedPrinter();
    }
    @Bean
    public iGreenPrinter GreenPrinter(){
        return new UrduGreenPrinter();
    }
    @Bean
    public iColorPrinter ColorPrinter(iBluePrinter blue, iRedPrinter red, iGreenPrinter green){
        return new ColorPrinter(red, blue, green);
    }
}
