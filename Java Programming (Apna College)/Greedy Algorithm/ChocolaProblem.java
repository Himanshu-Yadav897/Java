// we are given a bar of chocolate composed of (m xn) square peices. One should break the chocolate
//into single square. Each break of a part of the chocolate is a charged a cost expressed by a positive
// integer.This cost does not depend on the size of the part that is being broken but only depends on
// the line the break goes along. Let us denote with x1, x2, .... xm-1 and along horizontal lines
// with y1, y2, ...., yn-1.
// Compute the minimal cost of breaking the whole chocolate into single square.

import java.util.*;
public class ChocolaProblem {
    public static void main(String args[]){
        int n = 4, m =6;
        Integer costVer[] = { 2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // variables for loop
        int hp = 1; // Horizontal Peices
        int vp = 1; // Vertical Peices
        int cost = 0;

        while(h<costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){ // Horizontal Pieces
                cost = cost + (costHor[h] * vp);
                hp++;
                h++;
            }else{ // Vertical Pieces
                cost = cost + (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while(h < costHor.length){ // for left over array
            cost = cost + (costHor[h] * vp);
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost = cost + (costVer[v] * hp);
                vp++;
                v++;
        }

        System.out.println("min cost of cuts = " + cost);
        

    }
}
