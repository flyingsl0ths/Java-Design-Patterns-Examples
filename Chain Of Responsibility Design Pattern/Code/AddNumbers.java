public class AddNumbers implements Chain {
    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if (request.getcalculationWanted() == "Addition") {
            int sum = request.getNumber1() + request.getNumber1();
            System.out.println(request.getNumber1() + " + " + request.getNumber1() + " = " + sum);
        } else {
            this.nextInChain(request);
        }
    }
}