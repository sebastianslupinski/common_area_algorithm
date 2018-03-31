public class Application {

    public static void main(String[] args){
        System.out.println(calculateOverLappingArea(-1, -1, 10, 10, -1, 0, 3, 9));
    }

    public static int calculateOverLappingArea(int r1x1, int r1y1, int r1x2, int r1y2,
                                          int r2x1, int r2y1, int r2x2, int r2y2){

        // r1 means first rectangle, r2 - second rectangle

        if (r1x1>r2x2){ return 0;}
        else if (r2x1>r1x2){ return 0;}
        else if (r1y1>r2y2){ return 0;}
        else if (r2y1>r1y2){ return 0;}
        // if any of this conditional is true it means that rectangles doesn't overlap at all

        int commonLeft = Math.max(r1x1, r2x1);
        int commonRight = Math.min(r1x2, r2x2);
        int commonBottom = Math.max(r1y1, r2y1);
        int commonTop = Math.min(r2y2, r1y2);

        return calculateSize(commonLeft, commonBottom, commonRight, commonTop);
    }

    public static int calculateSize(int x1, int y1, int x2, int y2){
        int size = ((x2-x1)*(y2-y1));
        return size;
    }
}
