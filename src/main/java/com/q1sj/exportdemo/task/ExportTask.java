package com.q1sj.exportdemo.task;

import com.q1sj.exportdemo.pojo.ExportRecord;
import com.qsj.export.ExportContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 模拟一个定时任务
 */
@Component
public class ExportTask{
    @Autowired
    private ExportContext<ExportRecord> exportContext;

    public void run(String ages){
        // 模拟从数据库查询待导出记录
        List<ExportRecord> exports = Arrays.asList(ExportRecord.mock());
        exportContext.export(exports);
    }
}
