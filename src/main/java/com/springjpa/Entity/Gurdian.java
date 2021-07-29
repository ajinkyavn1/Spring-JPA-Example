package com.springjpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data

@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name", column = @Column(name = "gurdian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "gurdian_email")
        ),
        @AttributeOverride(
                name = "mobail",
                column = @Column(name = "gurdian_mobail")
        )

})
public class Gurdian {
    private  String name;
    private  String email;
    private  String mobail;
}
