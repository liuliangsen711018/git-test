package liu.service;

import liu.bean.Appartus;
import liu.bean.Dept;
import liu.mapper.AppartusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppartusService {

    @Autowired
    AppartusMapper appartusMapper;

    public List<Appartus> queryAll() {
        return appartusMapper.selectByExample(null);
    }

    public void saveAppartus(Appartus appartus) {
        appartusMapper.insert(appartus);
    }

    public void buyAppartus(Integer id, Integer num) {
        Appartus appartus = appartusMapper.selectByPrimaryKey(id);
        appartus.setAppartusQuantity(appartus.getAppartusQuantity() + num);
        appartusMapper.updateByPrimaryKey(appartus);
    }

    public void sellAppartus(Integer id, Integer num) {
        Appartus appartus = appartusMapper.selectByPrimaryKey(id);
        appartus.setAppartusQuantity(appartus.getAppartusQuantity() - num);
        appartusMapper.updateByPrimaryKey(appartus);
    }
}
