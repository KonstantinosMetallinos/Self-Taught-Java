
class Ep46_Static {
	public static void main(String argsp[]){
		tuna_Ep46 member1 = new tuna_Ep46("Megan","Fox");
		tuna_Ep46 member2 = new tuna_Ep46("Natale","Portman");
		tuna_Ep46 member3 = new tuna_Ep46("Taylor","Swift");

		//Ep 47
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println(tuna_Ep46.getMembers());	// since members is static we can use it without calling from an object


	}
}
