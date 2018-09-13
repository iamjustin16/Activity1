package resources;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class CalculatorRequest implements Serializable{
	private String operator;
	private Float firstnumber;
	private Float secondnumber;
}