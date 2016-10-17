package IZ0_803;

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] table={"aa","bb","cc"};
		for(String ss:table){
			int ii=0;
			while(ii<table.length){
				System.out.println(ii);
				ii++;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		String h1 = "HelloWorld";
		sb.append("Hello").append("World");
		if(h1==sb.toString()){
			System.out.println("They match");
		}
		
		if(h1.equals(sb.toString())){
			System.out.println("They really match.");
		}
	}

}
