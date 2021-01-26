package com.gglee.sample.exproc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TBoardVO {
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private Date regDate;
    private Date updateDate;
}
