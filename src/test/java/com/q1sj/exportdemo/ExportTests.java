package com.q1sj.exportdemo;

import com.q1sj.exportdemo.task.ExportTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExportTests {
    @Autowired
    private ExportTask exportTask;
    @Test
    public void test(){
        exportTask.run("");
    }

}
