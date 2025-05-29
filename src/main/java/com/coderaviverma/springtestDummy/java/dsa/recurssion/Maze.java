package com.coderaviverma.springtestDummy.java.dsa.recurssion;

public class Maze {

    public static void main(String[] args) {

//        System.out.println(ways(3,3));
//        printPath("",3,3);
//        printPathDiagonally("",3,3);

        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,false,true}
        };

        pathRes("",maze,0,0);
    }

    static int ways(int r,int c){
        if (c==1 || r==1){
            return 1;
        }


        int left=ways(r-1,c);
        int right=ways(r,c-1);

        return left+right;
    }

    static void printPath(String p,int r,int c){
        if (c==1 && r==1){
            System.out.println(p);
            return;
        }

        if (r>1)
        printPath(p+"D",r-1,c);

        if (c>1)
        printPath(p+"R",r,c-1);
    }


    static void printPathDiagonally(String p,int r,int c){
        if (c==1 && r==1){
            System.out.println(p);
            return;
        }


        if (r>1 && c>1)
            printPathDiagonally(p+"D",r-1,c-1);

        if (r>1)
            printPathDiagonally(p+"V",r-1,c);

        if (c>1)
            printPathDiagonally(p+"H",r,c-1);
    }

    static void pathRes(String p,boolean[][] maze,int r,int c){
        if(r ==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r<maze.length-1){
            pathRes(p+"D",maze,r+1,c);
        }

        if (c<maze[0].length-1){
            pathRes(p+"H",maze,r,c+1);
        }

    }


}
