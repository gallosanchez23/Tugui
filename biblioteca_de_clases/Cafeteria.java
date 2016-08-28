public class Cafeteria{
	private String cafName;
	private int itemCount;
	private double totalCost;
	private double earnings;
	private MenuItem []menu;
	private Bool paid;
	private Bool received;
	public Cafeteria(String cafName, String []menu, int itemCount){
		this.cafName = cafName;
		this.menu = menu;
		this.itemCount = itemCount;
		this.total = 0;
		this.paid = false;
		this.received = false;
	}
	public void pay(){
		this.paid = true;
	}
	public void receive(){
		this.received = true;
	}
	public double getTotal(){
		for(int i = 0; i < itemCount; i ++){
			this.total += this.menu[i].getSubTotal();
		}
		this.earnings = this.total * 0.05;
		this.total += earnings;
	}
	public double getMantainance(){
		return this.earnings * 0.2;
	}
	public double getEarnings(){
		return this.earnings * 0.8;
	}
}

public class Centrales extends Cafeteria{
	public Centrales(){
		this.menu = new MenuItem[9];
		this.menu[0] = new ChilaquilesL();
		this.menu[1] = new ChilaquilesS();
		this.menu[2] = new TacoInd();
		this.menu[3] = new TacoOrder();
		this.menu[4] = new Burguer();
		this.menu[5] = new Torta();
		this.menu[6] = new Pasta();
		this.menu[7] = new MolleteInd();
		this.menu[8] = new MolletesOrder();
		Cafeteria("CENTRALES", menu, 9);
	}
	public Centrales(MenuItem []menu){
		this.menu = menu;
		Cafeteria("CENTRALES", menu, 9);
	}
}

public class Jubileo extends Cafeteria{
	public Jubileo(){
		this.menu = new MenuItem[6];
		this.menu[0] = new ChilaquilesL();
		this.menu[1] = new ChilaquilesS();
		this.menu[2] = new Burguer();
		this.menu[3] = new Pasta();
		this.menu[4] = new MolleteInd();
		this.menu[5] = new MolletesOrder();
		Cafeteria("JUBILEO", menu, 6);
	}
	public Jubileo(MenuItem []menu){
		this.menu = menu;
		Cafeteria("JUBILEO", menu, 6);
	}
}

public class Comedor extends Cafeteria{
	public Comedor(){
		this.menu = new MenuItem[9];
		this.menu[0] = new ChilaquilesL();
		this.menu[1] = new ChilaquilesS();
		this.menu[2] = new TacoInd();
		this.menu[3] = new TacoOrder();
		this.menu[4] = new Burguer();
		this.menu[5] = new Torta();
		this.menu[6] = new Pasta();
		this.menu[7] = new MolleteInd();
		this.menu[8] = new MolletesOrder();
		Cafeteria("COMEDOR", menu, 9);
	}
	public Comedor(MenuItem []menu){
		this.menu = menu;
		Cafeteria("COMEDOR", menu, 9);
	}
}

public class Semillero extends Cafeteria{
	public Semillero(){
		this.menu = new MenuItem[7];
		this.menu[0] = new ChilaquilesL();
		this.menu[1] = new ChilaquilesS();
		this.menu[2] = new TacoInd();
		this.menu[3] = new TacoOrder();
		this.menu[4] = new Torta();
		this.menu[5] = new MolleteInd();
		this.menu[6] = new MolletesOrder();
		Cafeteria("SEMILLERO", menu, 7);
	}
	public Semillero(MenuItem []menu){
		this.menu = menu;
		Cafeteria("SEMILLERO", menu, 7);
	}
}