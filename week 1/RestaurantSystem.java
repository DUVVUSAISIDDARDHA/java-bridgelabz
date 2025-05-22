class person{
    protected String name;
	protected int id;
	 
	public person(String name,int id){
        this.name = name;
        this.id  = id;
	}
    public void disaplayinfo(){
        System.out.println(+name);
		System.out.println(+id);
	}
}	
interface worker{
    void workerworks();
    
}	
class chef extends person implements worker{
	public chef(String name,int id){
		super(name,id);
	}
        public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
	}
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101);
        Waiter waiter = new Waiter("Alice", 202);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
	