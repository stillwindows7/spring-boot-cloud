

import cn.zhangxd.svcb.dao.SysConfigDao;
import cn.zhangxd.svcb.dao.entity.SysConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration(locations = "classpath:spring-conf/spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SysLogTest {


    @Resource
    SysConfigDao sysLogDao;

    @Test
    public void testAdd(){
        SysConfig log = new SysConfig();
        log.setCode("jpa-001");
        log.setValueText("测试插入");
        sysLogDao.save(log);
    }

}
