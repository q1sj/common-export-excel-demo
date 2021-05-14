package com.q1sj.exportdemo;

import com.q1sj.export.Export;
import com.q1sj.exportdemo.task.ExportTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class ExportTests {
    @Autowired
    private ExportTask exportTask;
    @Autowired
    private Map<String, Export> exportMap;
    @Test
    public void test(){
//        System.out.println(exportMap);
        exportTask.run("");
    }
}
