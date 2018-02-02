package Test;

import java.util.Scanner;

public class SearchTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }

    static int beautifulBinaryString(String b) {
        // Complete this function
		int cnt = 0;
		int idx = 0;
		String findStr = "010";
		while(idx < (b.length()-2)) {
			if(findStr.equals(b.substring(idx, idx+3))) {
				idx = idx + 3;
				cnt++;
			}else {
				idx++;
			}
		}
		return cnt;
    }

    static int alternatingCharacters(String s){
        // Complete this function
    		int cnt = 0;
    		
    		int idx = 0;
    		char ch = s.charAt(idx);
    		while(idx < (s.length()-1)) {
    			if(s.charAt(++idx) == ch) {
    				cnt++;
    			}else {
    				ch = s.charAt(idx);
    			}
    		}
    		return cnt;
    }
    
    static int gemstones(String[] arr){
        // Complete this function
    		int cnt = 0;
    		int size = arr.length;
    		
    		//가장짧은문자열 찾
    		String word = arr[0];
    		for(int i=1; i<size; i++) {
    			if(arr[i].length() < word.length()) {
    				word = arr[i];
    			}
    		}
    		System.out.println("word : " + word);
    		
    		//search Gemstone
//    		for(int i=0; i<word.length(); i++) {
    		for(int i='a'; i<='z'; i++) {
    			if(word.indexOf(i)>=0) {
	        		int idx = 0;
	        		boolean isGem = true;
	    			while(idx < size) {
	    				if( arr[idx].indexOf(i) < 0 ) {
	    					isGem = false;
	    					break;
	    				}
	    				idx++;
	    			}
	    			if(isGem) cnt++;
    			}
    		}
    		
    		return cnt;
    }
    
	static int hackerlandRadioTransmitters(int[] x, int k) {
		// Complete this function
		for (int i = 1; i < x.length; i++) {
			int tmp = x[i];  // 기준
			int pos = i - 1;   // 비교할 대상

			while (pos >= 0 && tmp < x[pos]) {
				x[pos + 1] = x[pos];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				pos--;
			}
			x[pos + 1] = tmp;  // 기준값 저장
		}

        int numOfTransmitters = 0;
        int i = 0;
        
        /* Key is to use greedy algorithm to always place the transmitter at the house furthest to the right possible 
	    * to cover the range.
        */
        while (i < x.length) {
            numOfTransmitters++;
            int loc = x[i] + k;
            
            //go to right as far as we cover i_orig as well.
            while (i < x.length && x[i] <= loc) i++;
            loc = x[--i] + k; // this is where we place the transmitter
            //now go to the right of x[i] by k because transmitter at x[i] covers houses to its right as well. 
            while (i < x.length && x[i] <= loc) i++;
        }
		return numOfTransmitters;
	}
/*
	static int hackerlandRadioTransmitters(int[] x, int k) {
		// Complete this function
		for (int i = 1; i < x.length; i++) {
			int tmp = x[i];  // 기준
			int pos = i - 1;   // 비교할 대상

			while (pos >= 0 && tmp < x[pos]) {
				x[pos + 1] = x[pos];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				pos--;
			}
			x[pos + 1] = tmp;  // 기준값 저장
		}

		int cnt = 1;
		int idx = 1;
		int begin = x[0];
		int end = begin+k*2;
		
		while(idx < x.length) {
			System.out.println("1. x["+idx+"] = "+x[idx] + ", begin : " + begin + ", end : " + end);
			if((x[idx]-x[idx-1]) > k) {
				System.out.println(">>1. x["+idx+"] = "+x[idx] + ", begin : " + begin + ", end : " + end);
				begin = x[idx];
				end = begin + k*2;
				cnt++;
			}else {
				System.out.println("2. x["+idx+"] = "+x[idx] + ", begin : " + begin + ", end : " + end);
				int curX = x[idx];
				while(curX <= begin+k) {
					System.out.println("x["+idx+"] = "+x[idx] );
					end = x[idx] + k;
					if(idx < (x.length-1)) {
						idx++;
					}
					curX = x[idx] ;
				}
				System.out.println("3. x["+idx+"] = "+x[idx] + ", begin : " + begin + ", end : " + end);
				if(curX > end) {
					begin = x[idx];
					end = begin + k*2;
					cnt++;
					System.out.println("4. x["+idx+"] = "+x[idx] + ", begin : " + begin + ", end : " + end + ", cnt : " + cnt);
				}
			}
			idx++;
		}
		
//		while(idx < x.length) {
//			//search base
//			begin = x[idx];
//			cnt++;
//			while(x[idx] <= begin+k) {
//				base = x[idx];
//				idx++;
//				if(idx >= x.length) {
//					break;
//				}
//			}
//			end = base + k;
//			if(idx < x.length) {
//                while(x[idx] <= base+k) {
//                    idx++;
//                }
//			}
//		}
		
		return cnt;
	}
*/

}

