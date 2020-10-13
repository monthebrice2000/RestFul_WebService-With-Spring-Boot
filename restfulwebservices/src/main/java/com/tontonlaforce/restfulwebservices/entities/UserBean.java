package com.tontonlaforce.restfulwebservices.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


//ignorer les propirietes d'un UserBean lors du filtrage
@JsonIgnoreProperties( value =  {"id", "timeStamp"} )
@ApiModel( description =  "More infiormations about User")
//mappage de l'objet UserBean en une entité UserBean
@Entity
//Relation Entité UserBean - Table UserBean
@Table
public class UserBean {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Size( min = 5, max= 20, message = "le nom doit posséder au moins 5 caractères et au plus 20 caractères")
    @ApiModelProperty( name =  "le nom doit posséder au moins 5 caractères et au plus 20 caractères")
    @Column
    private String name;
    @JsonIgnore
    @Past
    @ApiModelProperty( name =  "la data doit être celui du passé")
    @Column
    private Date timeStamp;

    public UserBean() {
    }

    public UserBean(long idd, String name, Date timeStamp) {
        this.id = idd;
        this.name = name;
        this.timeStamp = timeStamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "idd=" + id +
                ", name='" + name + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
