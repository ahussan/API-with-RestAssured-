package com.namely.hibernate.model.apikeys;

import com.namely.hibernate.db.entities.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by anjalhussan on 11/1/16.
 */

@DynamicUpdate
@Entity
@Table(name="APIKEYS")
public class ApiKeys extends BaseEntity {

    private static final long serialVersionUID = 2402742607791521669L;

    @Column(name = "ENVIRONMENT")
    private String environment;

    @Column(name = "APIKEY")
    private String apikey;


    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("environment",environment)
                .append("apikey", apikey)
                .toString();
    }
}
