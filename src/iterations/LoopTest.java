package iterations;
/*
 * Class: LoopTest
 * Summary: test various looping strategies
 * Also has a short circuit  if-then-else
 * 
 * 	triangle()
 * 		i	j	output		j	output
 * 		5	0	nothing		0	*
 * 		4	0	*			
 * 		4	1	nothing
 * 		3	0	*
 * 		3	1	**
 * 		3	0	nothing
 *
 * Questions:
 * Why use a while loop instead of a for loop?
 * number of steps is not known in advance, or the values over which
 * the loop are generated one by one, and are thus not known in advance either
 * 
 * @version: 1.0
 * @since: 1/29/2017
 */
public class LoopTest {

	public LoopTest() {
		// TODO Auto-generated constructor stub
	}
	public void triangle() {
		for (int i=5; i>0; i--) {
			for (int j=0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j< 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void stairs() {
		for (int i=0; i<5; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void main(String[] args) {
		int k=1; 
		int j = 0; int i = 0;
		int max = (j < i) ? j : k; 
		System.out.println("max :" + max);
		LoopTest lt = new LoopTest(); 
		lt.triangle();

	}

}
