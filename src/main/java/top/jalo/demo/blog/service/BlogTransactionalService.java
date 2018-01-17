package top.jalo.demo.blog.service;

import java.io.Serializable;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView findAll(Integer page, Integer size, String sorts, Model model, String viewName, Object... args)
			throws Exception {
		return super.findAll(page, size, sorts, model, viewName, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Map<String, Object> findAll(Integer page, Integer size, String sorts, Object... args) throws Exception {
		return super.findAll(page, size, sorts, args);
	}
	
	@Override
	public ModelAndView findById(MID modelId, Model model, String viewName, Object... args) throws Exception {
		return super.findById(modelId, model, viewName, args);
	}
	
	@Override
	@Transactional(readOnly = true)
	public M findById(MID modelId, Object... args) throws Exception {
		return super.findById(modelId, args);
	}
	
	@Override
	public ModelAndView create(M m, Model model, String viewName, Object... args) throws Exception {
		return super.create(m, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public M create(M model, Object... args) throws Exception {
		return super.create(model, args);
	}
	
	@Override
	public ModelAndView fullUpdateById(MID modelId, M m, Model model, String viewName, Object... args)
			throws Exception {
		return super.fullUpdateById(modelId, m, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public M fullUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.fullUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView partialUpdateById(MID modelId, M m, Model model, String viewName, Object... args)
			throws Exception {
		return super.partialUpdateById(modelId, m, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public M partialUpdateById(MID modelId, M model, Object... args) throws Exception {
		return super.partialUpdateById(modelId, model, args);
	}
	
	@Override
	public ModelAndView deleteById(MID modelId, Model model, String viewName, Object... args) throws Exception {
		return super.deleteById(modelId, model, viewName, args);
	}
	
	@Override
	@Transactional(rollbackFor = Throwable.class)
	public M deleteById(MID modelId, Object... args) throws Exception {
		return super.deleteById(modelId, args);
	}
}
