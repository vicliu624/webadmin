package pers.vicliu.ynyt.web.springboot.core.mybatis.domain;

import java.util.List;

/**
 * @Auther: liuweikai
 * @Date: 2018/8/28 14:02
 * @Description:
 */
public class TableResponse<T> {
    private Long total;
    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
