package bootcamp_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
/** @RequestMapping aktualnie nie uzywa sie  tej annotacji. Zamiast tego uzywa sie @GetMapping("/"). */
public class HomeController {


    /** Metoda getHomePage uruchamia w tym przypadku servlet springowy. Jezeli jakies zapytanie wpadnie w
     * url "@GetMapping", servlet przekierowuje je do klasy HomeController do metody getHomePage. Metoda
     * getHomePage musi cos dostac. Spring wstrzykuje klase model do metody. Dzieki temu mozemy na model
     * zmapowac to, co chcemy wyswietlic na stronie.*/
    @GetMapping("/")
    public String getHomePage(Model model) {
        String welcome = "Welcome to my awesome application!";

        /** To jest mapa. Drugie welcome jest objektem (wartoscia mapy). Pierwszy atrybut jest stringiem
         * (kluczem mapy), ktory jest mapowany na nasz index html. Wartosc bedzie sparsowana na klucz. Index html (index.html) bedzie mial
         * wstrzykiwana wartosc na podstawie klucza.*/
        model.addAttribute("welcome", welcome);
        return "index";
    }

}
