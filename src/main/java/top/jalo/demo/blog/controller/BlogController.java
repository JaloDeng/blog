package top.jalo.demo.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.jalo.commons.webservice.controller.JpaGenericController;
import top.jalo.commons.webservice.service.JpaGenericService;
import top.jalo.demo.blog.model.Blog;
import top.jalo.demo.blog.service.BlogService;

/**
 * Controller : blog
 *
 * @Author JALO
 *
 */
@RestController
@RequestMapping("/blog")
public class BlogController extends JpaGenericController<Blog, Long> {

	@Autowired
	private BlogService blogService;
	
	@Override
	protected JpaGenericService<?, Blog, ?, Long> getService() {
		return blogService;
	}

}
