package liu.service;

import liu.bean.Dept;
import liu.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DeptMapper deptMapper;

    public List<Dept> queryAll() {
        return deptMapper.selectByExample(null);
    }

    public void saveDept(Dept dept) {
        deptMapper.insert(dept);
    }

    public void updateManager(Integer empId, Integer deptId) {
        Dept dept = deptMapper.selectByPrimaryKey(deptId);
        dept.setDeptManager(empId);
        deptMapper.updateByPrimaryKey(dept);
    }

    public void updateVicemanae(Integer empId, Integer deptId) {
        Dept dept = deptMapper.selectByPrimaryKey(deptId);
        dept.setDeptVicemanae(empId);
        deptMapper.updateByPrimaryKey(dept);
    }
}
