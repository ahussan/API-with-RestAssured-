package com.namely.hibernate.enums;


public enum DataSource {
    AUTOMATION_SOURCE("mysql-data-source_.xml");

    private String source;

    DataSource(final String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}

