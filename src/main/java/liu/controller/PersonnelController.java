package liu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import liu.bean.Personnel;
import liu.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonnelController {

    @Autowired
    PersonnelService personnelService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/AllPersonnels")
    @ResponseBody
    public List<Personnel> getAllPersonnels() {
        List<Personnel> personnels = personnelService.queryAll();
        return personnels;
    }

    @RequestMapping("/personnels")
    @ResponseBody
    public PageInfo getPersonnels(@RequestParam(value = "pn", defaultValue = "1") int pn, Model model) {
        PageHelper.startPage(pn, 5);
        List<Personnel> personnels = personnelService.queryAll();
        PageInfo<Personnel> pageInfo = new PageInfo<>(personnels);
        return pageInfo;
    }

    @RequestMapping("/personnels/{shuxin}/{zhi}")
    @ResponseBody
    public PageInfo getPersonnels(@RequestParam(value = "pn", defaultValue = "1") int pn, @PathVariable("shuxin") String shuxin, @PathVariable("zhi") String zhi) {
        //PageHelper.startPage(pn, 4);
        List<Personnel> personnels = personnelService.queryByExample(shuxin,zhi);
        PageInfo<Personnel> pageInfo = new PageInfo<>(personnels);
        return pageInfo;
    }

    @PostMapping("/emp")
    @ResponseBody
    public String savePersonnel(Personnel personnel) {
        System.out.println(personnel);
        personnelService.savePersonnel(personnel);
        return "yes";
    }

    @RequestMapping("/emp/{id}")
    @ResponseBody
    public Personnel getPersonnleById(@PathVariable("id") Integer id) {
        Personnel personnel = personnelService.queryById(id);
        return personnel;
    }

    @PutMapping("/emp/{id}")
    @ResponseBody
    public String updatePersonnleById(@PathVariable("id") Integer id, Personnel personnel) {
        personnelService.updateById(personnel);
        return "yes";
    }

    @DeleteMapping("/emp/{id}")
    @ResponseBody
    public String deleteEmp(@PathVariable("id")String id) {
        String[] ids = id.split("-");
        List<Integer> idList = new ArrayList<>();
        for (String s : ids) {
            idList.add(Integer.valueOf(s));
        }
        if (idList.size() == 1) {
            personnelService.deleteById(idList.get(0));
        } else {
            personnelService.deleteBatch(idList);
        }
        return "yes";
    }

    @RequestMapping("emps")
    public String emps() {
        return "emps";
    }



    @RequestMapping("renshi")
    public String renshi() {
        return "renshi";
    }
}
