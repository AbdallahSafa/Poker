package org.example.pokes.pokes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PokerGameController {

    private PokerGameService pokerGameService;

    @Autowired
    public PokerGameController(PokerGameService pokerGameService) {
        super();
        this.pokerGameService = pokerGameService;
    }

    @RequestMapping("list-poker-games")
    public String listWorkouts(ModelMap model) {
        List<PokerGame> PokerGames = pokerGameService.findByUser("safa");
        model.addAttribute("PokerGames", PokerGames);
        return "listpokergames";
    }

    @RequestMapping(value ="add-session", method = RequestMethod.GET)
     public String showNewSessionPage() {
        return "addSession";
    }

    @RequestMapping(value = "add-session", method = RequestMethod.POST)
    public String addNewSessionPage(@RequestParam LocalDate date, @RequestParam float buyIn, @RequestParam float endNight, ModelMap model) {
        pokerGameService.addSession(date, (String)model.get("name"), buyIn, endNight);
        return "redirect:/list-poker-games";
    }


}
