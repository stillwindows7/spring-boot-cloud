package cn.zhangxd.svcb.dao.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="sys_config2")
public class SysConfig {
    @Id
    private  String code;

    private String valueText;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }
}
