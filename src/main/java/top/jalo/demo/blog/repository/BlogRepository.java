package top.jalo.demo.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import top.jalo.demo.blog.entity.BlogEntity;

/**
 * Repository : blog
 *
 * @Author JALO
 *
 */
public interface BlogRepository extends JpaRepository<BlogEntity, Long>, JpaSpecificationExecutor<BlogEntity> {

}
