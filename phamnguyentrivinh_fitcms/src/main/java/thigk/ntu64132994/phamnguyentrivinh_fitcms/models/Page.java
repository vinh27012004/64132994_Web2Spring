package thigk.ntu64132994.phamnguyentrivinh_fitcms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "page")
public class Page {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "page_name")
    private String pageName;
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "content")
    private String content;
    @Column(name = "parent_page_id")
    private int parentPageId;
    public Page() {
    }

    public Page(int id, String pageName, String keyword, String content, int parentPageId) {
        this.id = id;
        this.pageName = pageName;
        this.keyword = keyword;
        this.content = content;
        this.parentPageId = parentPageId;
    }

    public Page(int id, String pageName, String keyword, String content, int parentPageId, String thumbnailImage) {
        this.id = id;
        this.pageName = pageName;
        this.keyword = keyword;
        this.content = content;
        this.parentPageId = parentPageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getTitle() {
        return pageName;
    }

    public void setTitle(String title) {
        this.pageName = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getParentPageId() {
        return parentPageId;
    }

    public void setParentPageId(int parentPageId) {
        this.parentPageId = parentPageId;
    }

}
