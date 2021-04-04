package tacos;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Taco {
	private Long id;
	private Date createAt;
	private String name;
	private List<String> ingredients;
}
