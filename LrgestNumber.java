package sriikanth;

public class LargestNumber {
	public static void main(String[] args) {

        double n1 = -7.8, n2 = 9.8, n3 = 6.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}

