package io.huyvu.mybatisreturnid.MybatisSpringReturnGeneratedId.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Repository {
    @Insert("""
            INSERT INTO student
               SET name = #{name}
                  ,age = #{age}""")
    long insertStudent(String name, int age);
}
