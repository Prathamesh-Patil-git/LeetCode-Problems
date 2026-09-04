class StockSpanner {

    Stack<Pair> stack = new Stack<>();
    
    class Pair{
        int price;
        int span;

        public Pair(int price, int span){
        this.price = price;
        this.span = span;
        }
    }
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
       int span = 1;
       while(!stack.isEmpty() && stack.peek().price <= price){

            span += stack.peek().span;
            stack.pop();
       }
       stack.push(new Pair(price,span));
       return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */