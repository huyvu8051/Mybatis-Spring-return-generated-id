package io.huyvu.mybatisreturnid.MybatisSpringReturnGeneratedId.config.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author HuyVu
 * @CreatedDate 2/23/2023 8:58 AM
 */
@Mapper
public interface AuditingRepository {
    @Select("SELECT LAST_INSERT_ID();")
    long getLastInsertId();
}