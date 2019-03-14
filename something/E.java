class E{
	public static void main(String[] args){
		boolean flag = true;
		for(int i=3;i<100;i++){
			for(int j=2;j<i;j++){
				if(i%j==0 && i!=j){
					flag = false;

					break;

				}
				else{
					flag = true;
				}
			}
			if(flag=true){
				System.out.print(i+"\t");
				if(i%5==0){
				System.out.println();
				
				}
			}
		}
		System.out.println();
	}
}

