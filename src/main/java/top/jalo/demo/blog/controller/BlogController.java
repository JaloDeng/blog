package top.jalo.demo.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import top.jalo.commons.webservice.controller.JpaGenericController;
import top.jalo.demo.blog.entity.BlogEntity;
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
public class BlogController extends JpaGenericController<BlogEntity, Blog, Long, Long> {
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/grid")
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView grid(Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer size, @RequestParam(required = false) String sorts,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		return blogService.findAll(page, size, sorts, model, "view/blogGrid");
	}
}
