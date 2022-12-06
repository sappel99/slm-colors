package at.fhtw.appel.colors.controller;

import at.fhtw.appel.colors.service.ColorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controller class
 * REST functionality
 */
@Controller
public class ColorController {
    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }


    @GetMapping("/color/{message}")
    String getComColor(@PathVariable String message, Model model) {
        colorService.setMessage(message);
        String compColor = colorService.getCoColor(message);
        model.addAttribute("compColor", compColor);   //set the text for change.html
        return "display";    //display.html
    }
}
