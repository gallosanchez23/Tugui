public class MenuItem{
	private String itName;
	private int quantity;
	private double price;
	private double subTotal;
	private int extraCount;
	public MenuItem(){
		this.itName = "";
		this. price = 0;
		this. extraCount = 0;
	}
	public MenuItem(String itName, double price, int extraCount){
		this.itName = itName;
		this.quantity = 0;
		this.price = price;
		this.subTotal = 0;
	}
	public void addItem(){
		this.quantity ++;
	}
	public void deleteItem(){
		this.quantity --;
	}
	public String getName(){
		return this.itName;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public double getSubTotal(){
		this.subTotal += (this.quantity * this.price);
		for(int i = 0; i < this.extraCount; i ++){
			if(this.extras[i].active){
				this.subTotal += this.extras[i].cost;
			}
		}
		return this.subTotal;
	}
	public String getDescription(){
		String description = "";
		for(int i = 0; i < this.extraCount; i ++){
			if(this.extras[i].active){
				description += (this.extras[i].definition + ", ");
			}
		}
		return description;
	}
}

public class ChilaquilesS extends MenuItem{
	public Option extras[7];
	public ChilaquilesS(int quantity){
		this.extras[0] = new Option(10.0, "Huevo", false);
		this.extras[1] = new Option(15.0, "Pollo", false);
		this.extras[2] = new Option(15.0, "Aguacate", false);
		this.extras[3] = new Option(5.0, "Queso", false);
		this.extras[4] = new Option(5.0, "Crema", false);
		this.extras[5] = new Option(0.0, "Frijoles", false);
		this.extras[6] = new Option(8.0, "Tocino", false);
		MenuItem("Chilaquiles Chicos", quantity, 35.0, 7);
	}
}

public class ChilaquilesL extends MenuItem{
	public Option extras[7];
	public ChilaquilesL(){
		this.extras[0] = new Option(10.0, "Huevo", false);
		this.extras[1] = new Option(15.0, "Pollo", false);
		this.extras[2] = new Option(15.0, "Aguacate", false);
		this.extras[3] = new Option(5.0, "Queso", false);
		this.extras[4] = new Option(5.0, "Crema", false);
		this.extras[5] = new Option(0.0, "Frijoles", false);
		this.extras[6] = new Option(8.0, "Tocino", false);
		MenuItem("Chilaquiles Grandes", 35.0, 7);
	}
}

public class TacoInd extends MenuItem{
	public Option extras[2];
	public TacoInd(){
		this.extras[0] = new Option(3.0, "Cebolla", false);
		this.extras[1] = new Option(0.0, "Salsa", false);
		MenuItem("Taco", 10.0, 2);
	}
}

public class TacoOrder extends MenuItem{
	public Option extras[2];
	public TacoOrder(){
		this.extras[0] = new Option(3.0, "Cebolla", false);
		this.extras[1] = new Option(0.0, "Salsa", false);
		MenuItem("Orden de Tacos", 45.0, 2);
	}
}

public class Burguer extends MenuItem{
	public Option extras[6];
	public Burguer(){
		this.extras[0] = new Option(5.0, "Queso", false);
		this.extras[1] = new Option(3.0, "Salsa barbecue", false);
		this.extras[2] = new Option(10.0, "Aguacate", false);
		this.extras[3] = new Option(0.0, "Lechuga", false);
		this.extras[4] = new Option(0.0, "Tomate", false);
		this.extras[5] = new Option(0.0, "Cebolla", false);
		MenuItem("Hamburguesa", 48.0, 6);
	}
}

public class Torta extends MenuItem{
	public Option extras[5];
	public Torta(){
		this.extras[0] = new Option(10.0, "Jamon", false);
		this.extras[1] = new Option(10.0, "Aguacate", false);
		this.extras[2] = new Option(0.0, "Lechuga", false);
		this.extras[3] = new Option(0.0, "Tomate", false);
		this.extras[4] = new Option(0.0, "Cebolla", false);
		MenuItem("Torta", 40.0, 5);
	}
}

public class Pasta extends MenuItem{
	public Option extras[2];
	public Pasta(){
		this.extras[0] = new Option(0.0, "Parmesano", false);
		this.extras[1] = new Option(15.0, "Pollo", false);
		MenuItem("Pasta", 35.0, 2);
	}
}

public class MolleteInd extends MenuItem{
	public Option extras[6];
	public MolleteInd(){
		this.extras[0] = new Option(5.0, "Chorizo", false);
		this.extras[1] = new Option(3.0, "Jamon", false);
		this.extras[2] = new Option(10.0, "Tocino", false);
		this.extras[3] = new Option(0.0, "Pollo", false);
		this.extras[4] = new Option(0.0, "Pico de gallo", false);
		this.extras[5] = new Option(0.0, "Cebolla", false);
		MenuItem("Mollete individual", 12.0, 6);
	}
}

public class MolletesOrder extends MenuItem{
	public Option extras[6];
	public MolletesOrder(){
		this.extras[0] = new Option(5.0, "Chorizo", false);
		this.extras[1] = new Option(3.0, "Jamon", false);
		this.extras[2] = new Option(10.0, "Tocino", false);
		this.extras[3] = new Option(0.0, "Pollo", false);
		this.extras[4] = new Option(0.0, "Pico de gallo", false);
		this.extras[5] = new Option(0.0, "Cebolla", false);
		MenuItem("Orden de Molletes", 44.0, 6);
	}
}