package games.chess.controller;


import games.chess.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

//    private final GameService service;
    private Board board;

//    @Autowired
//    public AppController(GameService service) {
//        this.service = service;
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String welcome() {
//        return "welcome.tile";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView startNewGame() {
        board = new Board();
        return buildModel("game.tile");
    }

    private ModelAndView buildModel(String tile) {
        ModelAndView modelAndView = new ModelAndView(tile);
        modelAndView.addObject("board", board.getBoard());
        return modelAndView;
    }
}