package top.jalo.demo.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.jalo.commons.util.annotation.View;
import top.jalo.commons.webservice.controller.JpaGenericMVController;
import top.jalo.demo.blog.entity.BlogEntity;
import top.jalo.demo.blog.model.Blog;

/**
 * Controller : blog
 *
 * @Author JALO
 *
 */
@RestController
@RequestMapping("/blog")
@View("/view/blog")
public class BlogController extends JpaGenericMVController<BlogEntity, Blog, Long, Long> {
	
}
