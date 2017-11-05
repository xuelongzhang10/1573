public class Switch{
    public static void main(String[] args){
        int day = 0;
        int ran = (int)(Math.random()*12)+1;
        switch(ran){
            case 2:
                day = 28;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10:  case12:
                day = 31;
                break;
            default:
                day = 30;
                break;
        }
        System.out.println(ran + "月，共" + day + "天");
    }
}
