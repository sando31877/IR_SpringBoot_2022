package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 1000; i++) {
            String subject = String.format("테스트용 더미데이터:[%03d]", i);
            String content = "테스트용 더미데이터 / 테스트용 더미데이터 / contents";
            this.questionService.create(subject, content, null);
        }
    }
}