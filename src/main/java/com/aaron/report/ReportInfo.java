package com.aaron.report;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ReportInfo {

    @Getter
    @Setter
    private String suiteName;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String className;

    @Getter
    @Setter
    private String methodName;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String spendTime;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private List<String> log;

}
