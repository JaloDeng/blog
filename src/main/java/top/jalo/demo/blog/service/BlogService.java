package top.jalo.demo.blog.service;

import org.springframework.stereotype.Service;

import top.jalo.demo.blog.entity.BlogEntity;
import top.jalo.demo.blog.model.Blog;

/**
 * Service : blog
 *
 * @Author JALO
 *
 */
@Service
public class BlogService extends BlogTransactionalService<BlogEntity, Blog, Long, Long>{

	@Override
	protected BlogEntity createEntity(Blog model, BlogEntity referenceEntity, Boolean mergeIfNotNull, Object... args)
			throws Exception {
		if (model == null) {
			return null;
		}
		
		BlogEntity entity = referenceEntity == null ? new BlogEntity() : referenceEntity;
		
		if (!mergeIfNotNull && model.getTitle() != null) {
			entity.setTitle(model.getTitle());
		}
		if (!mergeIfNotNull && model.getSummary() != null) {
			entity.setSummary(model.getSummary());
		}
		if (!mergeIfNotNull && model.getContent() != null) {
			entity.setContent(model.getContent());
		}
		
		return entity;
	}

	@Override
	protected Blog createModel(BlogEntity entity, Object... args) throws Exception {
		if (entity == null) {
			return null;
		}
		
		Blog model = new Blog();
		
		model.setId(entity.getId());
		model.setTitle(entity.getTitle());
		model.setSummary(entity.getSummary());
		model.setContent(entity.getContent());
		model.setCreateUserId(entity.getCreateUserId());
		model.setCreateTime(entity.getCreateTime());
		model.setUpdateUserId(entity.getUpdateUserId());
		model.setUpdateTime(entity.getUpdateTime());
		
		return model;
	}

}
