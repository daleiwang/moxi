package com.moxi.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.moxi.model.Admin;

@Mapper
public interface AdminService {

	@Select("SELECT * FROM `moxi`.`admin` where userName = #{userName} and password = #{password} and state = 0;")
	Admin findByNameAndPassword(Admin admin);

	@Select("SELECT * FROM `moxi`.`admin` where userName = #{userName} and password = #{password} and realName = #{realName}")
	List<Admin> findByAdminWithPage(Admin admin, int start, int end);

	@Insert("INSERT INTO `moxi`.`admin` (`id`, `userName`, `password`, `realName`, `age`, `phoneNumber`, `headPicture`, `addDate`, `updateDate`, `state`) VALUES (null, #{userName}, #{password}, #{realName}, #{age}, #{phoneNumber}, #{headPicture}, now(), now(), 0);")
	int insert(Admin admin);

	@Update("UPDATE `moxi`.`admin` SET `userName` = #{userName}, `password` = #{password}, `realName` = #{realName}, `age` = #{age}, `phoneNumber` = #{phoneNumber}, `headPicture` = #{headPicture}, `updateDate` = now(), `state` = #{state} WHERE `id` = #{id};")
	int updateStateById(int id);

	@Delete("DELETE FROM `moxi`.`admin` WHERE id  = #{id}")
	int deleteById(int id);
}
