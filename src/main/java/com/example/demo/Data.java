package com.example.demo;
import javax.persistence.*;
import lombok.*;
@Entity
@Table(name="computer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Data {
	@Id
	@GeneratedValue
	private int id;
	private String Time;
	private double CPU;
	private double RAM;
	

}