package com.coderaviverma.springtestDummy.test.ds;

import java.util.Comparator;
import java.util.PriorityQueue;

class Cricketer {
    String player_name;
    int test_runs;
    int odi_runs;
    int t20_runs;

    Cricketer(String name, int odi, int t20, int test) {
        this.player_name = name;
        this.test_runs = test;
        this.odi_runs = odi;
        this.t20_runs = t20;
    }
}

class Compare implements Comparator<Cricketer> {
    public int compare(Cricketer A, Cricketer B) {
        if (A.test_runs == B.test_runs) {
            if (A.odi_runs == B.odi_runs) {
                if (A.t20_runs < B.t20_runs) {
                    return -1;
                }
                return 0;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cricketer obj1 = new Cricketer("ABD", 9577, 1672, 8765);
        Cricketer obj2 = new Cricketer("Sachin", 10000, 1400, 9000);
        Cricketer obj3 = new Cricketer("Yuvi", 3636, 3636, 666666);
        Cricketer obj4 = new Cricketer("Ponting", 9577, 3636, 9000);
        PriorityQueue<Cricketer> pq = new PriorityQueue<Cricketer>(new Compare());
        pq.add(obj1);
        pq.add(obj2);
        pq.add(obj3);
        pq.add(obj4);
        while (!pq.isEmpty()) {
            System.out.print(pq.poll().player_name + " ");
        }
    }
}

