public class earthvolume{
    public static void main(String[] args){
	
	int radius = 6378;
	double volume_of_earth = (4/3) * Math.PI * Math.pow(radius,3);
	double volumeinmiles = volume_of_earth * 0.239913;
	
	System.out.println(" volume in km cube :" + volume_of_earth + " volumeinmiles is :" + volumeinmiles);
	}
}

	 