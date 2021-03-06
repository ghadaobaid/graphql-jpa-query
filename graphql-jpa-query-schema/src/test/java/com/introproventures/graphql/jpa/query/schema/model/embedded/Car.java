
package com.introproventures.graphql.jpa.query.schema.model.embedded;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "Car")
@Data
@EqualsAndHashCode(callSuper=true)
public class Car extends Vehicle {

    String brand;

}
