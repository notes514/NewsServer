package com.example.demo.mapper;

import com.example.demo.model.NewsImage;
import com.example.demo.model.NewsImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsImageMapper {
    int countByExample(NewsImageExample example);

    int deleteByExample(NewsImageExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(NewsImage record);

    int insertSelective(NewsImage record);

    List<NewsImage> selectByExample(NewsImageExample example);

    NewsImage selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") NewsImage record, @Param("example") NewsImageExample example);

    int updateByExample(@Param("record") NewsImage record, @Param("example") NewsImageExample example);

    int updateByPrimaryKeySelective(NewsImage record);

    int updateByPrimaryKey(NewsImage record);
}