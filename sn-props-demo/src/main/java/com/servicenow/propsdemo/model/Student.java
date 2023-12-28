/**
 * 
 */
package com.servicenow.propsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
import lombok.ToString;

/**
 * 
 */
//@Getter
//@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
	
	private Integer rollNo;
	private String name;
	private String course;
	private Double fee;
	
}
