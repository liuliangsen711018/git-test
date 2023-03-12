package liu.service;

import liu.bean.Patient;
import liu.bean.PatientExample;
import liu.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientMapper patientMapper;

    public List<Patient> getAll() {
        return patientMapper.selectByExample(null);
    }

    public String addPatient(Patient patient) {
        patientMapper.insertSelective(patient);
        return "yes";
    }

    public void updatePatient(Patient patient) {
        patientMapper.updateByPrimaryKey(patient);
    }

    public Patient queryById(Integer id) {
        return patientMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        patientMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> idList) {
        PatientExample patientExample = new PatientExample();
        PatientExample.Criteria criteria = patientExample.createCriteria();
        criteria.andPatientNoIn(idList);
        patientMapper.deleteByExample(patientExample);
    }

    public List<Patient> queryByExample(String shuxin, String zhi) {
        PatientExample patientExample = new PatientExample();
        PatientExample.Criteria criteria = patientExample.createCriteria();
        switch (shuxin) {
            case "病人号": criteria.andPatientNoEqualTo(Integer.parseInt(zhi));break;
            case "姓名": criteria.andPatientNameEqualTo(zhi);break;
            case "性别": criteria.andPatientGenderEqualTo(zhi);break;
            case "入院时间": criteria.andPatientDateStartEqualTo(zhi);break;
            case "病人房间号": criteria.andPatientRoomEqualTo(Integer.parseInt(zhi));break;
        }
        return patientMapper.selectByExample(patientExample);
    }
}
