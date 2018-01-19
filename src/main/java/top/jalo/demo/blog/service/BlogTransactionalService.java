package top.jalo.demo.blog.service;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import top.jalo.commons.webservice.model.CollectionResult;
import top.jalo.commons.webservice.model.Result;
import top.jalo.commons.webservice.service.JpaGenericService;

/**
 * Service : abstract service with transaction.
 *
 * @Author JALO
 *
 */
public abstract class BlogTransactionalService<E, M, EID extends Serializable, MID extends Serializable> extends JpaGenericService<E, M, EID, MID> {

	protected BlogTransactionalService() {}
	
	@Override
	public ModelAndView findAllAndView(Integer page, Integer size, String sorts, String viewName, Object... args)
			throws Exception {
		return super.findAllAndView(page, size, sorts, viewName, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public CollectionResult<M> findAll(Integer page, Integer size, String sorts, Object... args) throws Exception {
		return super.findAll(page, size, sorts, args);
	}
	
	@Override
	public ModelAndView findByIdAndView(MID modelId, String viewName, Object... args) throws Exception {
		return super.findByIdAndView(modelId, viewName, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Result<M> findById(MID modelId, Object... args) throws Exception {
		return super.findById(modelId, args);
	}
	
	@Override
	public ModelAndView createAndView(M model, String viewName, Object... args) throws Exception {
		return super.createAndView(model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> create(M model, Object... args) throws Exception {
		return super.create(model, args);
	}
	
	@Override
	public ModelAndView fullUpdateByIdAndView(MID modelId, M model, String viewName, Object... args)
			throws Exception {
		return super.fullUpdateByIdAndView(modelId, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> fullUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.fullUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView partialUpdateByIdAndView(MID modelId, M model, String viewName, Object... args)
			throws Exception {
		return super.partialUpdateByIdAndView(modelId, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> partialUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.partialUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView deleteByIdAndView(MID modelId, String viewName, Object... args) throws Exception {
		return super.deleteByIdAndView(modelId, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public Result<M> deleteById(MID modelId, Object... args) throws Exception {
		return super.deleteById(modelId, args);
	}
}
