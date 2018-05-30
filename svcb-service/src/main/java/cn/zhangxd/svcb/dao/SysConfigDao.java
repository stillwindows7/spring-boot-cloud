package cn.zhangxd.svcb.dao;

import cn.zhangxd.svcb.dao.entity.SysConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface   SysConfigDao extends Repository<SysConfig,Integer> {
    void save(SysConfig entity);
    long count();
    void delete(String code);

    @Query(" from sys_config2 where code=:code")
    SysConfig findOne(@Param("code") String code);

}
