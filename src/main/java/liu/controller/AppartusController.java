package liu.controller;

import liu.bean.Appartus;
import liu.bean.Dept;
import liu.service.AppartusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppartusController {

    @Autowired
    AppartusService appartusService;

    @RequestMapping("toappartus")
    public String toAppartus() {
        return "appartus";
    }

    @RequestMapping("/appartus")
    @ResponseBody
    public List<Appartus> getAppartus() {
        return appartusService.queryAll();
    }

    @PostMapping("/saveAppartus")
    public String saveAppartus(Appartus appartus) {
        appartusService.saveAppartus(appartus);
        return "appartus";
    }

    @RequestMapping("/buyAppartus")
    public String buyAppartus(Integer id, Integer num) {
        appartusService.buyAppartus(id,num);
        return "appartus";
    }

    @RequestMapping("/sellAppartus")
    public String sellAppartus(Integer id, Integer num) {
        appartusService.sellAppartus(id,num);
        return "appartus";
    }
}
