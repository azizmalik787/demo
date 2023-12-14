package com.azizmalik.demo.config;

import com.azizmalik.demo.Services.Implementations.ColorPrinter;
import com.azizmalik.demo.Services.Implementations.EnglishBluePrinter;
import com.azizmalik.demo.Services.Implementations.EnglishRedPrinter;
import com.azizmalik.demo.Services.Implementations.UrduGreenPrinter;
import com.azizmalik.demo.Services.iBluePrinter;
import com.azizmalik.demo.Services.iColorPrinter;
import com.azizmalik.demo.Services.iRedPrinter;
import com.azizmalik.demo.Services.iGreenPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
//    I have removed the iBluePrinter and have used the component instead in that concrete class
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
