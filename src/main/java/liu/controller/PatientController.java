package liu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import liu.bean.Patient;
import liu.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping("/patients")
    public String patients() {
        return "patients";
    }

    @RequestMapping("/getPatients")
    @ResponseBody
    public PageInfo<Patient> getPatients(@RequestParam(value = "pn", defaultValue = "1") int pn) {
        PageHelper.startPage(pn, 5);
        List<liu.bean.Patient> patients = patientService.getAll();
        PageInfo<Patient> patientPageInfo = new PageInfo<>(patients);
        return patientPageInfo;
    }

    @RequestMapping("/patient")
    @ResponseBody
    public String savePatient(Patient patient) {
        patientService.addPatient(patient);
        return "yes";
    }

    @PutMapping("/updatePatient")
    @ResponseBody
    public String updatePatient(Patient patient) {
        patientService.updatePatient(patient);
        return "yes";
    }

    @RequestMapping("/patient/{id}")
    @ResponseBody
    public Patient getPatientById(@PathVariable("id") Integer id) {
        Patient patient = patientService.queryById(id);
        return patient;
    }

    @DeleteMapping("/patient/{id}")
    @ResponseBody
    public String deleteEmp(@PathVariable("id")String id) {
        String[] ids = id.split("-");
        List<Integer> idList = new ArrayList<>();
        for (String s : ids) {
            idList.add(Integer.valueOf(s));
        }
        if (idList.size() == 1) {
            patientService.deleteById(idList.get(0));
        } else {
            patientService.deleteBatch(idList);
        }
        return "yes";
    }

    @RequestMapping("/patient/{shuxin}/{zhi}")
    @ResponseBody
    public PageInfo getPatients(@RequestParam(value = "pn", defaultValue = "1") int pn, @PathVariable("shuxin") String shuxin, @PathVariable("zhi") String zhi) {
        List<Patient> patients = patientService.queryByExample(shuxin,zhi);
        PageInfo<Patient> pageInfo = new PageInfo<>(patients);
        return pageInfo;
    }
}
