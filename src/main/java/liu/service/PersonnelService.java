package liu.service;

import liu.bean.Personnel;
import liu.bean.PersonnelExample;
import liu.mapper.PersonnelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelService {

    @Autowired
    PersonnelMapper personnelMapper;

    public List<Personnel> queryAll() {
        return personnelMapper.selectByExample(null);
    }

    public List<Personnel> queryByExample(String shuxin, String zhi) {
        List<Personnel> ans = null;
        PersonnelExample personnelExample = new PersonnelExample();
        PersonnelExample.Criteria criteria = personnelExample.createCriteria();
        switch (shuxin) {
            case "员工号": criteria.andEmpNoEqualTo(Integer.parseInt(zhi));break;
            case "姓名": criteria.andEmpNameEqualTo(zhi);break;
            case "部门号": criteria.andEmpDeptIdEqualTo(Integer.parseInt(zhi));break;
            case "职务": criteria.andEmpDutyEqualTo(zhi);break;
            case "籍贯": criteria.andEmpHometownEqualTo(zhi);break;
            case "email": criteria.andEmpEmailEqualTo(zhi);break;
            case "电话": criteria.andEmpTelenoEqualTo(zhi);break;
            case "身份证": criteria.andEmpIdEqualTo(zhi);break;
            case "民族": criteria.andEmpNationEqualTo(zhi);break;
            case "国籍": criteria.andEmpCountryEqualTo(zhi);break;
            case "婚姻": criteria.andEmpMarriageEqualTo(Integer.parseInt(zhi));break;
        }
        return personnelMapper.selectByExample(personnelExample);
    }

    public void savePersonnel(Personnel personnel) {
        personnelMapper.insertSelective(personnel);
    }

    public Personnel queryById(Integer id) {
        return personnelMapper.selectByPrimaryKey(id);
    }

    public void updateById(Personnel personnel) {
        personnelMapper.updateByPrimaryKey(personnel);
    }

    public void deleteById(Integer id) {
        personnelMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> idList) {
        PersonnelExample personnelExample = new PersonnelExample();
        PersonnelExample.Criteria criteria = personnelExample.createCriteria();
        criteria.andEmpNoIn(idList);
        personnelMapper.deleteByExample(personnelExample);
    }
}
