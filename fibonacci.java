package es.iessoterhernandez.daw.endes.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	private List<Integer> sequence;
	public Fibonacci() {
        this.sequence = new ArrayList<>();
    }

    public void generateSequence(int n) {
        for (int i = 0; i < n; i++) {
            sequence.add(calculateFibonacci(i));
        }
    }

    public void printSequence() {
        System.out.println("Secuencia de Fibonacci:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
    
