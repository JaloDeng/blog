package top.jalo.demo.blog.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Entity : blog
 *
 * @Author JALO
 *
 */
@Entity
@Table(name = "j_blog")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class BlogEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 20, nullable = false)
	private Long id;
	
	@Column(name = "title", length = 100, nullable = false, unique = true)
	private String title;
	
	@Column(name = "summary", length = 255, nullable = false)
	private String summary;
	
	@Column(name = "content", nullable = false, columnDefinition = "longtext")
	private String content;
	
	@Column(name = "create_user_id", length = 20)
	private Long createUserId;
	
	@CreatedDate
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "update_user_id", length = 20)
	private Long updateUserId;
	
	@LastModifiedDate
	@Column(name = "update_time")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
