package top.jalo.demo.blog.service;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import top.jalo.commons.webservice.model.CollectionResult;
import top.jalo.commons.webservice.model.Result;
import top.jalo.commons.webservice.service.JpaGenericMVService;

/**
 * Service : abstract service with transaction.
 *
 * @Author JALO
 *
 */
public abstract class BlogTransactionalService<E, M, EID extends Serializable, MID extends Serializable> extends JpaGenericMVService<E, M, EID, MID> {

	protected BlogTransactionalService() {}
	
	@Override
	public ModelAndView findAll(String viewName, Integer page, Integer size, String sorts, Object... args)
			throws Exception {
		return super.findAll(viewName, page, size, sorts, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public CollectionResult<M> findAll(Integer page, Integer size, String sorts, Object... args) throws Exception {
		return super.findAll(page, size, sorts, args);
	}
	
	@Override
	public ModelAndView findById(String viewName, MID modelId, Object... args) throws Exception {
		return super.findById(viewName, modelId, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Result<M> findById(MID modelId, Object... args) throws Exception {
		return super.findById(modelId, args);
	}
	
	@Override
	public ModelAndView create(String viewName, M model, Object... args) throws Exception {
		return super.create(viewName, model, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> create(M model, Object... args) throws Exception {
		return super.create(model, args);
	}
	
	@Override
	public ModelAndView fullUpdateById(String viewName, MID modelId, M model, Object... args)
			throws Exception {
		return super.fullUpdateById(viewName, modelId, model, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> fullUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.fullUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView partialUpdateById(String viewName, MID modelId, M model, Object... args)
			throws Exception {
		return super.partialUpdateById(viewName, modelId, model, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> partialUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.partialUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView deleteById(String viewName, MID modelId, Object... args) throws Exception {
		return super.deleteById(viewName, modelId, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> deleteById(MID modelId, Object... args) throws Exception {
		return super.deleteById(modelId, args);
	}
}
