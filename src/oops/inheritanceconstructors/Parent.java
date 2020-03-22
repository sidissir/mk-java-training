package oops.inheritanceconstructors;

public class Parent extends GrandParent{

	
	// Variables
		int parentAge;
		int parentAssets;
		
		
		Parent(int grandParentAgeFromCaller,int grandParentAssetsFromCaller,int parentAgeFromCaller,int parentAssetsFromCaller){
			
			//We need to call super class constructor to intilaise super class variables
			super(grandParentAgeFromCaller,grandParentAssetsFromCaller);

			parentAge = parentAgeFromCaller;
			parentAssets = parentAssetsFromCaller;

		}
		
		
		// methods
		public void getParentAssets() {
			System.out.println(" Parent Earnings are :" + parentAssets);
		}
		public void getParentTotalAssets() {
			int totalAssets = parentAssets + grandParentAssets;
			System.out.println(" Parent Total Assets are :" + totalAssets);
		}
		
		
		public static void main(String[] args) {
			Parent parent1 = new Parent(75, 100000, 50, 200000);
			parent1.getParentAssets();
			parent1.getParentTotalAssets();
		}
}
