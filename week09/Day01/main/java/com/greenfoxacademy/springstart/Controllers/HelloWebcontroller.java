package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Zoltán on 2016.12.19..
 */
@Controller
public class HelloWebcontroller {
    private final AtomicLong atomiccounter= new AtomicLong();
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"red", "blue", "black", "green", "yellow", "orange", "darkred", "pink", "darkblue", "darkgreen"};

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam() String name , Model model) {
        Random rnd = new Random();
        long counter = atomiccounter.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("counter", counter);
        int randomH = rnd.nextInt(hellos.length-1);

        model.addAttribute("hello", hellos[randomH]);
        int randomC = rnd.nextInt(colors.length-1);
        model.addAttribute("rndcolor", colors[randomC]);
        int randomsize = rnd.nextInt(40) + 16;
        model.addAttribute("rndsize", randomsize);




        return "greeting";
    }
}
