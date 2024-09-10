package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Data (지양)
public class StarVO {
	private int count;

	public void getStar() {
		for (int i = 1; i <= count; i++) { 
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	

}
