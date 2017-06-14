package com.moxi.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.moxi.model.News;

@Mapper
public interface NewsService {
	
	@Select("SELECT * FROM MOXI.NEWS WHERE ID = #{id};")
	News findById(News news);
	
	@Select({
		"<script>",
		"SELECT N.*,C.NAME AS CATEGORYNAME,C.IMAGE AS CATEGORYIMAGE FROM MOXI.NEWS N ",
		"LEFT JOIN MOXI.NEWS_CATEGORY C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 0 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
			"<when test='category!=0'>",
				"AND category = #{category}",
			"</when>",
			"<when test='commendState!=0'>",
				"AND commendState = #{commendState}",
			"</when>",
			"limit #{start},#{end}",
		"</script>"
	})
	List<News> list(News news);
	
	
	@Select({
		"<script>",
		"SELECT COUNT(*) FROM MOXI.NEWS N ",
		"LEFT JOIN MOXI.NEWS_CATEGORY C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 0 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
		"</script>"
	})
	int count(News news);
	
	
	
	@Insert("INSERT INTO `moxi`.`news` (`id`,`title`,`description`,`category`,`image`,`content`,`addDate`,`updateDate`,`commendState`,`state`,`browses`,`likes`,`comments`,`score`) VALUES (null,#{title},#{description},#{category},#{image},#{content},now(),now(),1,0,0,0,0,0);")
	int insert(News news);
	
}
