public class Option{
	public double cost;
	public String definition;
	public Bool active;
	public Option(){
		this.cost = 0;
		this.definition = "";
		this.active = false;
	}
	public Option(double cost, String definition, Bool active){
		this.cost = cost;
		this.definition = definition;
		this.active = active;
	}
}