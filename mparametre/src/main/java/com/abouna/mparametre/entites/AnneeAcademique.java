package com.abouna.mparametre.entites;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tblSessionStudent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnneeAcademique implements Serializable {
    @Id
    @Column(name = "SessionId",length = 100,nullable = false)
    private String sessionId;
    @Column(name = "SessionId")
    private Date startDate;
    @Column(name = "finishdate")
    private Date finishDate;
    @Column(name = "num")
    private Integer num;
    @Column(name = "CurrentActive")
    private String active;
}
