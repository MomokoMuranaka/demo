package jp.co.aivick.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/demo")
public class democontoroller {



        @GetMapping
        public String init(Model model){





            return "demo.html";
        }

        @PostMapping
        public String submit() {



            return "demo";
        }

}
