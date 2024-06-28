package org.example.pokes.pokes;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PokerGameController {

    private final PokerGameRespository pokerGameRespository;

    private String getLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @Autowired
    public PokerGameController(PokerGameRespository pokerGameRespository) {
        super();
        this.pokerGameRespository = pokerGameRespository;
    }

    @RequestMapping("list-poker-games")
    public String listWorkouts(ModelMap model) {
        String username = getLoggedInUser();
        List<PokerGame> PokerGames = pokerGameRespository.findByUsername(username);
        model.addAttribute("game", PokerGames);
        return "listpokergames";
    }

    @RequestMapping(value ="add-session", method = RequestMethod.GET)
     public String showNewSessionPage(ModelMap model) {
        PokerGame game = new PokerGame(LocalDate.now(), 0, "", 0,0);
        model.put("game", game);
        return "addSession";
    }

    @RequestMapping(value = "add-session", method = RequestMethod.POST)
    public String addNewSessionPage(ModelMap model, @Valid @ModelAttribute("game") PokerGame game, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSession";
        }
        game.setUsername(getLoggedInUser());
        game.setNetNight(game.getEndNight() - game.getBuyIn());
        pokerGameRespository.save(game);
        return "redirect:/list-poker-games";
    }

    @RequestMapping(value= "delete")
    public String deleteSession(@RequestParam int id){
        pokerGameRespository.deleteById(id);
        return "redirect:/list-poker-games";
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String showUpdatePageSession(@RequestParam int id, ModelMap model) {
        PokerGame game = pokerGameRespository.findById(id).get();
        model.put("game", game);
        return "addSession";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateSessionPage(ModelMap model, @Valid @ModelAttribute("game") PokerGame game, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSession";
        }
        game.setUsername(getLoggedInUser());
        pokerGameRespository.save(game);
        return "redirect:/list-poker-games";
    }




}
