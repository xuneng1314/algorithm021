public class Test860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;//5元
        int ten = 0;//10元
        for(int i:bills){
            if(i == 5) five++;//5块钱随便加
            else if(i==10) {five--;ten++;}//10块钱，扣除5块 加10块
            else if(ten > 0){ten--;five--;} //20块钱 如果有10块的，扣除10 扣除5
            else five-=3;//如果没有10块 扣除3*5
            if(five <0) return false;//每一轮判断一下是不是扣多了。扣多了说明找不了零钱
        }
        return true;
    }
}
