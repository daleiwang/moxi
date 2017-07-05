package com.moxi.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.moxi.model.News;
import com.moxi.util.Constant;
	
@Mapper
public interface NewsService {
	
	@Select("SELECT * FROM MOXI.NEWS WHERE ID = #{id};")
	News findById(News news);
	
	@Select({
		"<script>",
		"SELECT N.*,C.NAME AS CATEGORYNAME,C.IMAGE AS CATEGORYIMAGE FROM MOXI.NEWS N ",
		"LEFT JOIN MOXI.NEWS_CATEGORY C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 1 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
			"<when test='category!=0'>",
				"AND category = #{category}",
			"</when>",
			"<when test='commendState!=0'>",
				"AND commendState = #{commendState}",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByAddDateAsc+"\"'>",
				"order by "+Constant.OrderByAddDateAsc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByAddDateDesc+"\"'>",
				"order by "+Constant.OrderByAddDateDesc,
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByBrowsesDesc+"\"'>",
				"order by "+Constant.OrderByBrowsesDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByCommentsDesc+"\"'>",
				"order by "+Constant.OrderByCommentsDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByLikesDesc+"\"'>",
				"order by "+Constant.OrderByLikesDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByScoreDesc+"\"'>",
				"order by "+Constant.OrderByScoreDesc+",addDate desc",
			"</when>",
			"limit #{start},#{end}",
		"</script>"
	})
	List<News> list(News news);
	
	@Select({
		"<script>",
		"SELECT COUNT(*) FROM MOXI.NEWS N ",
		"LEFT JOIN MOXI.NEWS_CATEGORY C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 1 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
			"<when test='category!=0'>",
				"AND category = #{category}",
			"</when>",
			"<when test='commendState!=0'>",
				"AND commendState = #{commendState}",
			"</when>",
		"</script>"
	})
	int count(News news);
	
	@Insert("INSERT INTO `moxi`.`news` (`id`,`title`,`description`,`category`,`image`,`content`,`addDate`,`updateDate`,`commendState`,`state`,`browses`,`likes`,`comments`,`score`) VALUES (null,#{title},#{description},#{category},#{image},#{content},now(),now(),1,1,0,0,0,0);")
	int insert(News news);

	@Update("UPDATE `moxi`.`news` SET `title` = #{title}, `description` = #{description}, `category` = #{category}, `image` = #{image}, `content` = #{content}, `updateDate` = now()  WHERE `id` = #{id};")
	int update(News news);
	
	@Update("UPDATE `moxi`.`news` SET `state` = #{state}, `commendState` = #{commendState}, `browses` = #{browses}, `likes` = #{likes}, `comments` = #{comments}, `score` = #{score} WHERE `id` = #{id};")
	int updateState(News news);
	
}
