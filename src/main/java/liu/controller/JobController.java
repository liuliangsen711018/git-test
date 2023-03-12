package liu.controller;

import liu.bean.Job;
import liu.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping("/jobs")
    @ResponseBody
    public List<Job> getDepts() {
        return jobService.queryAll();
    }
}
