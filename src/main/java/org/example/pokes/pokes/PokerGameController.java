package org.example.pokes.pokes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
