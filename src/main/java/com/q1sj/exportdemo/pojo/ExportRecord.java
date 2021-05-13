package com.q1sj.exportdemo.pojo;

import com.qsj.export.AbstractExportRecord;

public class ExportRecord extends AbstractExportRecord {
    public static ExportRecord mock(){
        ExportRecord exportRecord = new ExportRecord();
        exportRecord.setFileName("filename");
        exportRecord.setConditions("xxx");
        exportRecord.setCode("user");
        return exportRecord;
    }
}
