
class Main {


	public static void main(String[] args) {
		float suma = sumar(1,2,3);
		System.out.println(suma);
		
		float resta = restar(1,2);
		System.out.println(resta);
	}
	public static float sumar (float num1, float num2, float num3){
		return num1+num2+num3;
}

public static float restar (float num1, float num2){
	return num1-num2;
}
}