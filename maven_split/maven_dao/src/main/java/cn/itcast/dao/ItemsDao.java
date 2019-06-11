package cn.itcast.dao;


import cn.itcast.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {

    Items findOne(Integer id);

}
