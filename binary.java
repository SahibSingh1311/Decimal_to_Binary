public class binary{
	public static void main(String[] args){
	
	int input1 = 10;
	float input2 = 20.05f;	
	
	toBinary(input1);
	System.out.println();
	toBinary(input2);
}

	//Function to print
	public static void printBinary(int[] binary, int id){
	for(int i = id-1;i>=0;i--){
	System.out.print(binary[i]);
}
}
	public static void printBinary(float num){
	System.out.print('.');
	while(num<1){
	num *=2;
	System.out.print((int)num);
}



}
	//Function overloading
	public static void toBinary(int num){
	int[] binaryNo= new int[35];
	int id=0; 
		
	while(num>0){
	binaryNo[id++] = num%2;
	num /=2;
}
	printBinary(binaryNo,id);	
}

	public static void toBinary(float num){
	int[] binaryNo= new int[35];
	int id=0; 
	int temp = (int)num;
	while(temp>0){
	binaryNo[id++] = temp%2;
	temp /=2;
}
	printBinary(binaryNo,id);

	num -=(int)num;	
	//System.out.println();
	//System.out.print((int)num);
	printBinary(num);
	
	
} 
}