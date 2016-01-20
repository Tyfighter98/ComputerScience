package hw4;

public class P4AMyPodDriver {

	public static void main(String[] args) {
		P4AMyPod carPod = new P4AMyPod("Blue", 64, new P4ASong[] {new P4ASong("Concrete Jungle"), new P4ASong("Just Like That"), new P4ASong("The Girl")});
		P4AMyPod homePod = new P4AMyPod();
		
		System.out.println(carPod);
		System.out.println(homePod);
		
		
	}
}
