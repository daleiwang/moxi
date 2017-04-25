package com.moxi.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.moxi.model.NewsCategory;

@Mapper
public interface NewsCategoryService {
	
	@Select("SELECT * FROM `moxi`.`news_category` where id = #{id};")
	NewsCategory findById(NewsCategory newsCategory);
	
	@Select({
		"<script>",
		"SELECT * FROM `moxi`.`news_category`",
		"WHERE state = 0",
			"<when test='name!=null'>",
				"AND name LIKE CONCAT('%',#{name},'%')",
			"</when>",
			"limit #{start},#{end}",
		"</script>"
	})
	List<NewsCategory> list(NewsCategory newsCategory, int start, int end);
	
	@Select({
		"<script>",
		"SELECT count(*) FROM `moxi`.`news_category`",
		"WHERE state = 0",
			"<when test='name!=null'>",
				"AND name LIKE CONCAT('%',#{name},'%')",
			"</when>",
		"</script>"
	})
	int count(NewsCategory newsCategory);
	
	
	
	@Insert("INSERT INTO `moxi`.`news_category` (`id`, `name`, `description`, `image`, `addDate`, `state`) VALUES (null, #{name}, #{description}, #{image}, now(), 0);")
	int insert(NewsCategory newsCategory);
	
	@Update("UPDATE `moxi`.`news_category`SET `name` = #{name}, `description` = #{description}, `image` = #{image}, `state` = #{state} WHERE `id` = #{id};")
	int update(NewsCategory newsCategory);
	
}
