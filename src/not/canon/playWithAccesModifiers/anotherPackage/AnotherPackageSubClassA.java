package not.canon.playWithAccesModifiers.anotherPackage;

import not.canon.playWithAccesModifiers.ClassA;
import not.canon.playWithAccesModifiers.SamePackageSubClassA;

public class AnotherPackageSubClassA extends ClassA {
	public static void main(String... arrr) {
		ClassA a = new ClassA();
		System.out.println(a.publicString);
		//System.out.println(a.protectedString);
		//System.out.println(a.packagePrivateString);
		//System.out.println(a.privateString);
		System.out.println(a.publicStaticString);
		System.out.println(a.protectedStaticString);
		//System.out.println(a.packagePrivateStaticString);
		//System.out.println(a.privateStaticString);
		System.out.println(ClassA.publicStaticString);
		System.out.println(ClassA.protectedStaticString);
		//System.out.println(ClassA.packagePrivateStaticString);
		//System.out.println(ClassA.privateStaticString);

	}
	public AnotherPackageSubClassA(){
		System.out.println(this.publicString);
		System.out.println(this.protectedString);
		//System.out.println(this.packagePrivateString);
		//System.out.println(this.privateString);
		System.out.println(this.publicStaticString);
		System.out.println(this.protectedStaticString);
		//System.out.println(this.packagePrivateStaticString);
		//System.out.println(this.privateStaticString);
		System.out.println(ClassA.publicStaticString);
		System.out.println(ClassA.protectedStaticString);
		//System.out.println(ClassA.packagePrivateStaticString);
		//System.out.println(ClassA.privateStaticString);
	}
}

class AnotherPackageUnrelatedTolassA {
	public static void main(String... arrr) {
		ClassA a = new ClassA();
		System.out.println(a.publicString);
		//System.out.println(a.protectedString);
		//System.out.println(a.packagePrivateString);
		//System.out.println(a.privateString);
		System.out.println(a.publicStaticString);
		//System.out.println(a.protectedStaticString);
		//System.out.println(a.packagePrivateStaticString);
		//System.out.println(a.privateStaticString);
		System.out.println(ClassA.publicStaticString);
		//System.out.println(ClassA.protectedStaticString);
		//System.out.println(ClassA.packagePrivateStaticString);
		//System.out.println(ClassA.privateStaticString);

	}
	public AnotherPackageUnrelatedTolassA(){
		ClassA a = new ClassA();
		System.out.println(a.publicString);
		//System.out.println(a.protectedString);
		//System.out.println(a.packagePrivateString);
		//System.out.println(a.privateString);
		System.out.println(a.publicStaticString);
		//System.out.println(a.protectedStaticString);
		//System.out.println(a.packagePrivateStaticString);
		//System.out.println(a.privateStaticString);
		System.out.println(ClassA.publicStaticString);
		//System.out.println(ClassA.protectedStaticString);
		//System.out.println(ClassA.packagePrivateStaticString);
		//System.out.println(ClassA.privateStaticString);
	}

}



