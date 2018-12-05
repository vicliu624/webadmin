package pers.vicliu.ynyt.web.springboot.core.mybatis.domain;

/**
 * @Auther: liuweikai
 * @Date: 2018/8/28 14:02
 * @Description:
 */
public class PageFilter {
    // 当前页码
    private Integer page = 1;
    // 分页数量
    private Integer pageSize = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
