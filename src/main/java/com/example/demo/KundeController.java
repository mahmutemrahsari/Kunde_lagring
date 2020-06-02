package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KundeController {
    private final List<Kunde> kunder = new ArrayList<>();

    @GetMapping("hentKunder")
    public List<Kunde> alleKunder(){
        return kunder;
    }
    @GetMapping("hentBiler")
    public List<Bil> hentBiler(){
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi","A4"));
        listBiler.add(new Bil("Volvo", "T8"));
        listBiler.add(new Bil("Audi","A8"));
        return listBiler;
    }

    @PostMapping("lagreKunde")
    public void leggTilKunde(Kunde innKunde){
        kunder.add(innKunde);
    }

    @GetMapping("slettAlleKunder")
    public void sletAlleKunder(){
        kunder.clear();
    }

}
