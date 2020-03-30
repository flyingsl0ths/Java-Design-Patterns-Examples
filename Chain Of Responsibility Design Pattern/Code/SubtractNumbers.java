public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "Subtraction") {
            int total = request.getNumber1() - request.getNumber1();
            System.out.println(request.getNumber1() + " - " + request.getNumber1() + " = " + total);
        } else {
            this.nextInChain(request);
        }
    }
}