package oops.inheritanceconstructors;

public class GrandParent {

	// Variables
	int grandParentAge;
	int grandParentAssets;

	GrandParent(int grandParentAgeFromCaller,int grandParentAssetsFromCaller){
		grandParentAge = grandParentAgeFromCaller;
		grandParentAssets = grandParentAssetsFromCaller;
	}
	
	
	// methods
	public void getGrandParentAssets() {
		System.out.println("Grand Parent Assets are :" + grandParentAssets);
	}
}
