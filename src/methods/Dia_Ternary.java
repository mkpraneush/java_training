package methods;

public class Dia_Ternary {
	boolean diagonalcheck(int arr[][]) {
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr.length;c++) {
				if((r==c && arr[r][c]!=1)||(r!=c && arr[r][c]!=0)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int num[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int num1[][]= {{1,0,0},{0,1,0},{0,0,1}};
		Dia_Ternary dia=new Dia_Ternary();
		System.out.println(dia.diagonalcheck(num)?"Diagonal matrix":"Not a diagonal matrix");
		System.out.println(dia.diagonalcheck(num1)?"Diagonal matrix":"Not a diagonal matrix");
	}
	
	}


