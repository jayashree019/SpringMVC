package com.example.springmvc1.Controller;

import com.example.springmvc1.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {
    @GetMapping("/")
    public String exampleDemo(@RequestParam(value = "name",
    defaultValue = "world!!",required = true)
                              String name1, Model model)
    {
        model.addAttribute("name2",name1);
        return "home";
    }
@GetMapping("/greeting")
    public String greetingpage(Model model, Greeting greeting) {
        model.addAttribute("greeting1",new Greeting());
        return "greeting";

}
@PostMapping("/greeting")
public String resultPage(@ModelAttribute Greeting greeting1,Model model){
        model.addAttribute("greeting2",greeting1);
        return "result";
}
}
