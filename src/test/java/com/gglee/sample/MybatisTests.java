package com.gglee.sample;

import com.gglee.sample.exproc.entity.TBoardVO;
import com.gglee.sample.exproc.mapper.TBoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleApplication.class)
@Slf4j
public class MybatisTests {

    @Autowired
    private TBoardMapper mapper;

    @Test
    public void mapperTest() {
        List<TBoardVO> list = mapper.selectBoardList();

        log.info("list : {}", list);
    }

}
