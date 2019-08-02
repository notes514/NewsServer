package com.example.demo.mapper;

import com.example.demo.model.NewsDetails;
import com.example.demo.model.NewsDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsDetailsMapper {
    int countByExample(NewsDetailsExample example);

    int deleteByExample(NewsDetailsExample example);

    int deleteByPrimaryKey(Integer detailsId);

    int insert(NewsDetails record);

    int insertSelective(NewsDetails record);

    List<NewsDetails> selectByExample(NewsDetailsExample example);

    NewsDetails selectByPrimaryKey(Integer detailsId);

    int updateByExampleSelective(@Param("record") NewsDetails record, @Param("example") NewsDetailsExample example);

    int updateByExample(@Param("record") NewsDetails record, @Param("example") NewsDetailsExample example);

    int updateByPrimaryKeySelective(NewsDetails record);

    int updateByPrimaryKey(NewsDetails record);
}