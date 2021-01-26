package com.gglee.sample.exproc.mapper;

import com.gglee.sample.exproc.entity.TBoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TBoardMapper {

    List<TBoardVO> selectBoardList();
}
