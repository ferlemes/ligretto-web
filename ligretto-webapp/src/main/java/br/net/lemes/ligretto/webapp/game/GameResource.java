package br.net.lemes.ligretto.webapp.game;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dasilfer on 13/03/2017.
 */
@RestController
@RequestMapping("/game")
@EnableAutoConfiguration
public class GameResource {

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }

    /*@RequestMapping(, name = )
    public String newGame() {
        return "gameId = 42";
    }

    @RequestMapping(method = RequestMethod.GET, name = "/game/getStacks/{gameId}")
    public String getStacks(@RequestParam(name = "gameId") final String gameId) {
        return "returning stacks for game " + gameId;
    }*/

}
