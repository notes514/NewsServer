package com.example.demo.mapper;

import com.example.demo.model.NewsContent;
import com.example.demo.model.NewsContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsContentMapper {
    int countByExample(NewsContentExample example);

    int deleteByExample(NewsContentExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsContent record);

    int insertSelective(NewsContent record);

    List<NewsContent> selectByExample(NewsContentExample example);

    NewsContent selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsContent record, @Param("example") NewsContentExample example);

    int updateByExample(@Param("record") NewsContent record, @Param("example") NewsContentExample example);

    int updateByPrimaryKeySelective(NewsContent record);

    int updateByPrimaryKey(NewsContent record);
}