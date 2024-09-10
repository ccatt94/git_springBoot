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
public class GradeVO {
	private int kor;
	private int eng;
	private int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	public char getGrade() {
		char grade = '가';
		
		if(getAvg() >= 90) {
			return grade = '수';
		}else if(getAvg() >= 80) {
			return grade = '우';
		}else {
			return grade = '미';
		}
	}
}
