
public class TestClass {
public static void main(String[] args) {
	System.out.println("this is main class");
	Calculator cal = new Calculator();
	double totalAddition = cal.add(23.32,3943.038);
	System.out.println("total addition: " +totalAddition);
	double totalSubtraction = cal.sub(3828.983,393.3273);
	System.out.println("total subtraction: "+totalSubtraction);
}

}
