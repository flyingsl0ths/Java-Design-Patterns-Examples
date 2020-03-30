public interface Chain {
    public abstract void setNextChain(Chain nextChain);

    public abstract void calculate(Numbers request);
}