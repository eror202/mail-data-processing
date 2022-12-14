package ru.smirnov.MailDataProcessingApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "post_path")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostPath implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "registration_time")
    private Instant registrationTime;


    @Column(name = "date_of_arrival_at_the_post_office")
    private Instant dateOfArrivalAtThePostOffice;

    @ManyToOne
    @JoinColumn(name = "post_office_name", referencedColumnName = "name")
    private PostOffice postOfficeName;

    @Column(name = "date_of_departure_from_the_post_office")
    private Instant dateOfDepartureFromThePostOffice;

    @OneToOne
    @JoinColumn(name = "receiver_identification", referencedColumnName = "identification")
    private Receiver receiverIdentification;
}
