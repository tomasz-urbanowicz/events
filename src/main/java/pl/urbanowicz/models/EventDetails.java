package pl.urbanowicz.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "event_details")
public class EventDetails extends AbstractEntity{

    @Size(max = 500, message = "Description too long")
    private String eventDescription;

    @NotBlank(message = "Email is required!")
    @Email(message = "Invalid email. Try again!")
    private String contactEmail;

    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    public EventDetails() {
    }

    public EventDetails(@Size(max = 500, message = "Description too long") String eventDescription,
                        @NotBlank(message = "Email is required!") @Email(message = "Invalid email. Try again!") String contactEmail) {
        this.eventDescription = eventDescription;
        this.contactEmail = contactEmail;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
