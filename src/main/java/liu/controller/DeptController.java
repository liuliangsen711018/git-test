package liu.controller;

import liu.bean.Dept;
import liu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("/depts")
    @ResponseBody
    public List<Dept> getDepts() {
        return deptService.queryAll();
    }

    @RequestMapping("/saveDept")
    public String SaveDept(Dept dept) {
        deptService.saveDept(dept);
        return "renshi";
    }

    @RequestMapping("/updateManager")
    public String updateManager(Integer empNo, Integer deptId) {
        deptService.updateManager(empNo, deptId);
        return "renshi";
    }

    @RequestMapping("/updateVicemanae")
    public String updateVicemanae(Integer empNo, Integer deptId) {
        deptService.updateVicemanae(empNo, deptId);
        return "renshi";
    }
}
