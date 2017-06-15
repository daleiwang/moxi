package com.moxi.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.moxi.model.Admin;

@Mapper
public interface AdminService {

	@Select("SELECT * FROM `moxi`.`admin` where userName = #{userName} and password = #{password} and state = 1;")
	Admin findByNameAndPassword(Admin admin);

	@Insert("INSERT INTO `moxi`.`admin` (`id`, `userName`, `password`, `realName`, `age`, `phoneNumber`, `headPicture`, `addDate`, `updateDate`, `state`) VALUES (null, #{userName}, #{password}, #{realName}, #{age}, #{phoneNumber}, #{headPicture}, now(), now(), 1);")
	int insert(Admin admin);

	@Update("UPDATE `moxi`.`admin` SET `userName` = #{userName}, `password` = #{password}, `realName` = #{realName}, `age` = #{age}, `phoneNumber` = #{phoneNumber}, `headPicture` = #{headPicture}, `updateDate` = now(), `state` = #{state} WHERE `id` = #{id};")
	int updateStateById(int id);

}
