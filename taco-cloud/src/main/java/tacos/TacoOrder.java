package tacos;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {
	private String deliveryName,
				   deliveryStreet,
				   deliveryCity,
				   deliberyState,
				   deliberyZip,
				   ccNumber,
				   ccExpiration,
				   ccCVV;
	private List<Taco> tacos = new ArrayList<>();

	public void addTaco (Taco taco) {
		this.tacos.add(taco);
	}
}