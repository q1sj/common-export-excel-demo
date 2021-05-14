package com.q1sj.exportdemo.task;

import com.q1sj.export.ExportContext;
import com.q1sj.exportdemo.pojo.ExportRecord;
import com.q1sj.exportdemo.service.ExportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 模拟一个定时任务
 */
@Component
public class ExportTask{
    @Autowired
    private ExportContext<ExportRecord> exportContext;
    @Autowired
    private ExportRecordService exportRecordService;

    public void run(String ages){
        List<ExportRecord> list = exportRecordService.list();
        exportContext.export(list);
    }
}
