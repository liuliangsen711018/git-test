package liu.service;

import liu.bean.Job;
import liu.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobMapper jobMapper;

    public List<Job> queryAll() {
        return jobMapper.selectByExample(null);
    }
}
